package com.gowdham.springdemo.javaconfigexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import org.springframework.beans.factory.annotation.Value;

public class VehiclePlaneBean {

    private VehicleTypeEnum vehicleTypeEnum;
    @Value("${plane1.modelName}")
    private String modelName;
    @Value("${plane1.companyName}")
    private String companyName;
    @Value("${plane1.wheels}")
    private int wheels;

    public VehicleTypeEnum getVehicleTypeEnum() {
        return VehicleTypeEnum.PLANE;
    }

    public void setVehicleTypeEnum(VehicleTypeEnum vehicleTypeEnum) {
        this.vehicleTypeEnum = vehicleTypeEnum;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
