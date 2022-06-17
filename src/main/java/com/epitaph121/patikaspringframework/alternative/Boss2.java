package com.epitaph121.patikaspringframework.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss2 implements BossInterface {

    @Override
    public String surum(String data){
        return "boss2 "+data;
    }
}
