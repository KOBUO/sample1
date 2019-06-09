package jp.co.xxx.sample.anno;

import jp.co.xxx.sample.label.ExeLabel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.TYPE_USE})
public @interface Exe {
    ExeLabel label();
}
