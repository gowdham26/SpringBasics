package com.gowdham.springdemo.xmlconfigexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;

// class used for setter injection example
public class VehicleBean {

    private VehicleTypeEnum vehicleTypeEnum;
    private String modelName;
    private String companyName;
    private int wheels;

    public VehicleTypeEnum getVehicleTypeEnum() {
        return vehicleTypeEnum;
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
