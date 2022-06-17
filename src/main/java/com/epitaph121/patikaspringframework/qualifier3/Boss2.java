package com.epitaph121.patikaspringframework.qualifier3;

@QualifierMultiple2(Options.FIRST)
public class Boss2 implements BossInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple 2 : "+data;
    }
}
