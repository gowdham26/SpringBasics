package com.gowdham.springdemo.annotationexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class VehicleAutoBean implements Vehicle {

    @Value("${auto1.modelName}")
    private String modelName;
    @Value("${auto1.companyName}")
    private String companyName;
    @Value("${auto1.wheels}")
    private int wheels;

    @PostConstruct
    private void afterBeanInitialization() {
        System.out.println("Inside auto : auto just started");
    }

    @PreDestroy
    private void justBeforeBeanDestroyed() {
        System.out.println("Inside auto : auto gonna stop now");
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.AUTO;
    }

    @Override
    public int getNoOfWheels() {
        return wheels;
    }

    public String getCompanyName() {
        return companyName;
    }
}
