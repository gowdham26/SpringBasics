package com.gowdham.springdemo.xmlconfigexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;

public class Cycle implements Vehicle {

    private void startUp() {
        System.out.println("Inside cycle - init");
    }

    private void shutDown() {
        System.out.println("Inside cycle - destroy");
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return null;
    }

    @Override
    public int getNoOfWheels() {
        return 0;
    }

    @Override
    public String getCompanyName() {
        return null;
    }

    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public void setModelName(String inModelName) {

    }
}
