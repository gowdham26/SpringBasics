package com.gowdham.springdemo.javaconfigexamples;

import com.gowdham.springdemo.interfaces.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * The class which acts as a java source code version of applicationContext.xml
 */
@Configuration   // makes the class as bean configuration source
@PropertySource("classpath:/plane.properties") // load the properties files
public class VehicleConfig {

    // the method name will act as  the bean id
    @Bean
    public VehiclePlaneBean vehiclePlaneBean() {
        return new VehiclePlaneBean();
    }

    @Bean
    public Vehicle vehiclePlane() {
        return new Plane(vehiclePlaneBean());
    }

}
