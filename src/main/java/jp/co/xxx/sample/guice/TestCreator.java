package jp.co.xxx.sample.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import jp.co.xxx.sample.aop.MyGuiceModule;
import jp.co.xxx.sample.label.ExeLabel;

public class TestCreator {
    public ITester getTester(ExeLabel exeLabel){
        Injector injector = Guice.createInjector(new MyGuiceModule());
        switch (exeLabel){
            case SAMPLE1:
            case SAMPLE2:
                return injector.getInstance(exeLabel.getClazz());
                default:
                    throw new IllegalArgumentException();
        }
    }
}
