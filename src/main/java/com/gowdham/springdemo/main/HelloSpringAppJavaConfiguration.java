package com.gowdham.springdemo.main;

import com.gowdham.springdemo.javaconfigexamples.Plane;
import com.gowdham.springdemo.javaconfigexamples.VehicleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The driver class to run the java configuration based spring basics examples - NO XML at all.
 */
public class HelloSpringAppJavaConfiguration {
    public static void main(String[] args) {
        // load the spring container - bean factory
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);

        // retrieve the bean - remember that the bean id used here is method name declared in the VehicleConfig class
        Plane plane = context.getBean("vehiclePlane", Plane.class);

        // get the bean data
        System.out.println("Vehicle Type: " + plane.getVehicleType());
        System.out.println("Model Name: " + plane.getModelName());
        System.out.println("Company Name: " + plane.getCompanyName());
        System.out.println("Wheels: " + plane.getNoOfWheels());

    }
}
