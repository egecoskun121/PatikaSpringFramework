package com.epitaph121.patikaspringframework.qualifier3;


import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Qualifier
@Target({TYPE,METHOD,PARAMETER,FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QualifierMultiple2 {
    Options value();
}
