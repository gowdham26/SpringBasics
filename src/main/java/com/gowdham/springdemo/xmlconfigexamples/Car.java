package com.gowdham.springdemo.xmlconfigexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;

public class Car implements Vehicle {

    private final VehicleBean carVehicle;

    public Car(VehicleBean vehicleBean) {
        carVehicle = vehicleBean;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.CAR;
    }

    @Override
    public int getNoOfWheels() {
        return carVehicle.getWheels();
    }

    @Override
    public String getCompanyName() {
        return carVehicle.getCompanyName();
    }

    @Override
    public String getModelName() {
        return carVehicle.getModelName();
    }

    @Override
    public void setModelName(String inModelName) {
        carVehicle.setModelName(inModelName);
    }

}
