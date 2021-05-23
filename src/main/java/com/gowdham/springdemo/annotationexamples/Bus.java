package com.gowdham.springdemo.annotationexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //default bean id will be used as "bus"
@Scope("prototype")
public class Bus {

    private Vehicle vehicleBean;

    public VehicleTypeEnum getVehicleType() {
        return vehicleBean.getVehicleType();
    }

    public Vehicle getVehicle() {
        return vehicleBean;
    }

    @Autowired // setter injection
    @Qualifier("vehicleBusBean")
    public void setVehicleBean(Vehicle vehicleBean) {
        this.vehicleBean = vehicleBean;
    }
}
