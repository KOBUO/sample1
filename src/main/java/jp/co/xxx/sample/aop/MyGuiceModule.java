package jp.co.xxx.sample.aop;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import jp.co.xxx.sample.anno.LogTarget;

public class MyGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(LogTarget.class), new BenchmarkInterceptor());
    }
}
