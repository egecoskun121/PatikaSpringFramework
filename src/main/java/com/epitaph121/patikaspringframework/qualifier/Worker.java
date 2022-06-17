package com.epitaph121.patikaspringframework.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifierCdi")
@ApplicationScoped
public class Worker {

    @Inject
    @QualifierMultiple
    private BossInterface bossInterface;


    public Worker() {

    }

    public String getData(String data){
        return bossInterface.surum(data);
    }

}
