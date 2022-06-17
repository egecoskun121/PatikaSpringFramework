package com.epitaph121.patikaspringframework.aop.intercepter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@ApplicationScoped
@Named(value="aopIntercepter")

public class AopBean implements Serializable {

    private static final Long serialVersionUID=1L;

    @Inject
    private Login login;

    public String getAopBean(){
        return login.isLoginMethod("Yes");
    }
}
