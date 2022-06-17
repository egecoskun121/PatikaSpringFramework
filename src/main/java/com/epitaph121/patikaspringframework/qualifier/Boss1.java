package com.epitaph121.patikaspringframework.qualifier;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@Default
public class Boss1 implements BossInterface {

    @Override
    public String surum(String data){
        return "default data "+data;
    }
}
