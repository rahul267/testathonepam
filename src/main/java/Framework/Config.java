package Framework;

import Enums.Browser;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Config {
    String url() default "";
    Browser browser() default Browser.NONE;
    String hub() default "";
    String baseUrl() default "";
    String path() default "";
}