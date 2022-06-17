package com.epitaph121.patikaspringframework.cdi;


import com.epitaph121.patikaspringframework.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value="newtuto")
@ApplicationScoped
public class _04_New {


    // produced
    @Produces
    public String producedData(@New StudentDto studentDto){
        studentDto=StudentDto.builder()
                .studentId(0L).studentName("Ege")
                        .build();
        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String consumedData;
}
