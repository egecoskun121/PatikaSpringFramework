package com.epitaph121.patikaspringframework.bean;

import jdk.jfr.Name;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="cdiBean")
@ApplicationScoped
@Getter
@Setter
public class JsfBean {
    private String patika;

    public JsfBean() {
        this.patika="Spring Boot Eğitime Hoşgeldiniz";
    }


}
