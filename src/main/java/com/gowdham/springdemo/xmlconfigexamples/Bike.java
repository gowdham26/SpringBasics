package com.gowdham.springdemo.xmlconfigexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;

public class Bike implements Vehicle {

    private final VehicleBean bikeVehicle;

    public Bike(VehicleBean vehicleBean) {
        this.bikeVehicle = vehicleBean;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.BIKE;
    }

    @Override
    public int getNoOfWheels() {
        return bikeVehicle.getWheels();
    }

    @Override
    public String getCompanyName() {
        return bikeVehicle.getCompanyName();
    }

    @Override
    public String getModelName() {
        return bikeVehicle.getModelName();
    }

    @Override
    public void setModelName(String inModelName) {
        bikeVehicle.setModelName(inModelName);
    }
}
