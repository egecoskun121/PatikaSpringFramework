package com.epitaph121.patikaspringframework.ioc_di;

public class Boss implements BossInterface{

    @Override
    public String surum(String data){
        return "sürüm "+data;
    }
}
