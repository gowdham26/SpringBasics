package com.gowdham.springdemo.annotationexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class VehicleBusBean implements Vehicle {

    @Value("${bus1.modelName}")
    private String modelName;
    @Value("${bus1.companyName}")
    private String companyName;
    @Value("${bus1.wheels}")
    private int wheels;

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.BUS;
    }

    @Override
    public int getNoOfWheels() {
        return wheels;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void setModelName(String inModelName) {
        modelName = inModelName;
    }

    @PostConstruct
    private void afterBeanInitialization() {
        System.out.println("Inside bus : bus just started");
    }

    // this method will never called as the scope is prototype for this bean
    @PreDestroy
    private void justBeforeBeanDestroyed() {
        System.out.println("Inside bus : bus gonna stop now");
    }
}
