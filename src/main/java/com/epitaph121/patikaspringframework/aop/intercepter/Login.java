package com.epitaph121.patikaspringframework.aop.intercepter;

@Intercepter
public class Login {


    public String isLoginMethod(String data){
        return "isLogin: "+data;
    }
}
