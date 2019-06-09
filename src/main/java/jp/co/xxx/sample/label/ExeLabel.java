package jp.co.xxx.sample.label;

import jp.co.xxx.sample.guice.ITester;
import jp.co.xxx.sample.guice.impl.Sample1TesterImpl;
import jp.co.xxx.sample.guice.impl.Sample2TesterImpl;
import lombok.Getter;
import lombok.experimental.Accessors;

public enum ExeLabel {
    // @formatter:off
    SAMPLE1(Sample1TesterImpl.class, "サンプル1"),
    SAMPLE2(Sample2TesterImpl.class, "サンプル2");

    @Getter
    @Accessors(prefix = "_")
    private final Class<? extends ITester> _clazz;
    @Getter
    @Accessors(prefix = "_")
    private final String _name;

    ExeLabel(Class<? extends ITester> clazz, String name){
        _clazz = clazz;
        _name = name;
    }
}
