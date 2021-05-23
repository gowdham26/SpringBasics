package com.gowdham.springdemo.javaconfigexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;

public class Plane implements Vehicle {
    private final VehiclePlaneBean plane;

    public Plane(VehiclePlaneBean vehicle) {
        plane = vehicle;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return plane.getVehicleTypeEnum();
    }

    @Override
    public int getNoOfWheels() {
        return plane.getWheels();
    }

    @Override
    public String getCompanyName() {
        return plane.getCompanyName();
    }

    @Override
    public String getModelName() {
        return plane.getModelName();
    }

    @Override
    public void setModelName(String inModelName) {
        plane.setModelName(inModelName);
    }
}
