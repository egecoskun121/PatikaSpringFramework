package com.epitaph121.patikaspringframework.ioc_dinot;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="cdinotWorker")
@ApplicationScoped
public class Worker {

    private Boss boss;


    public Worker() {
        boss= new Boss();
    }

    public String getData(String data){
        return boss.surum(data);
    }

}
