package com.gowdham.springdemo.annotationexamples;

import com.gowdham.springdemo.enums.VehicleTypeEnum;
import com.gowdham.springdemo.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myAuto")  // explicitly bean id mentioned as "myAuto"
@Scope("singleton")
public class Auto {
    @Autowired                       // field injection
    @Qualifier("vehicleAutoBean")
    private Vehicle vehicleBean;

      /*  @Autowired // constructor injection
        public Auto( @Qualifier("vehicleAutoBean")Vehicle vehicleBean){
            this.vehicleBean = vehicleBean;
        }*/

    public VehicleTypeEnum getVehicleType() {
        return vehicleBean.getVehicleType();
    }

    public Vehicle getVehicle() {
        return vehicleBean;
    }

}

