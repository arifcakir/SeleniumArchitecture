package com.saha.slnarch.report.screenshot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TakeScreenShot {

  boolean before() default false;

  boolean after() default false;

  String logMessage() default "";
}