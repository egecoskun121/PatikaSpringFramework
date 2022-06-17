package com.epitaph121.patikaspringframework.qualifier3;

@QualifierMultiple2(Options.SECOND)
public class Boss3 implements BossInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple 3 : "+data;
    }
}
