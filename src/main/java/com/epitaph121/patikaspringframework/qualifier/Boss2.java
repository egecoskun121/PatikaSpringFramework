package com.epitaph121.patikaspringframework.qualifier;

import javax.enterprise.inject.Alternative;

@QualifierMultiple
public class Boss2 implements BossInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple 1 : "+data;
    }
}
