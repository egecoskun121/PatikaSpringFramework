package com.epitaph121.patikaspringframework.qualifier;


import javax.inject.Qualifier;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Qualifier
@Target({TYPE,METHOD,PARAMETER,FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QualifierMultiple {
}
