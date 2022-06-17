package com.epitaph121.patikaspringframework.ioc_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="iocdiWorker")
@ApplicationScoped
public class Worker {

    @Inject
    private BossInterface bossInterface;


    public Worker() {

    }

    public String getData(String data){
        return bossInterface.surum(data);
    }

}
