package jp.co.xxx.sample.aop;

import jp.co.xxx.sample.anno.Exe;
import jp.co.xxx.sample.guice.ITester;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BenchmarkInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation mi) throws Throwable {
        Class<?> clazz = mi.getThis().getClass().getSuperclass();
        final Logger log = LoggerFactory.getLogger(clazz);
        log.info("START:{}", clazz.getAnnotation(Exe.class).label());
        ITester.ResultInfo result = (ITester.ResultInfo) mi.proceed();
        if(!result.getStatus().isBol()){
            result.getMessages().forEach(log::error);
        }
        log.info("END:{}", result.getStatus());
        return result;
    }
}
