package jp.co.xxx.sample.guice.impl;

import jp.co.xxx.sample.anno.Exe;
import jp.co.xxx.sample.guice.AbstractTester;
import jp.co.xxx.sample.label.ExeLabel;

@Exe(label = ExeLabel.SAMPLE1)
public class Sample1TesterImpl extends AbstractTester {

    @Override
    protected boolean isSuccess(boolean is) {
        return is;
    }
}
