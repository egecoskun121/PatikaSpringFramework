package com.epitaph121.patikaspringframework.qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifier3Cdi")
@ApplicationScoped
public class Worker {

    @Inject
    @QualifierMultiple2(Options.SECOND)
    private BossInterface bossInterface;


    public Worker() {

    }

    public String getData(String data){
        return bossInterface.surum(data);
    }

}
