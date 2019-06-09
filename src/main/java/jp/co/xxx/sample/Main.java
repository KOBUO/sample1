package jp.co.xxx.sample;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import jp.co.xxx.sample.guice.TestCreator;
import jp.co.xxx.sample.label.ExeLabel;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override protected void configure() {}
        });
        injector.getInstance(TestCreator.class).getTester(ExeLabel.SAMPLE1).test(true);
        injector.getInstance(TestCreator.class).getTester(ExeLabel.SAMPLE2).test(false);
    }
}