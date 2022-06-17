package com.epitaph121.patikaspringframework.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss1 implements BossInterface {

    @Override
    public String surum(String data){
        return "boss1 "+data;
    }
}
