package com.gowdham.springdemo.interfaces;

import com.gowdham.springdemo.enums.VehicleTypeEnum;

public interface Vehicle {

    VehicleTypeEnum getVehicleType();

    int getNoOfWheels();

    String getCompanyName();

    String getModelName();

    void setModelName(String inModelName);

}
