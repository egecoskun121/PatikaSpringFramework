package com.epitaph121.patikaspringframework.qualifier3;

@QualifierMultiple2(Options.THIRD)
public class Boss4 implements BossInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple 4 : "+data;
    }
}
