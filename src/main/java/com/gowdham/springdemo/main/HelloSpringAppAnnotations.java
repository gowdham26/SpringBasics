package com.gowdham.springdemo.main;

import com.gowdham.springdemo.annotationexamples.Auto;
import com.gowdham.springdemo.annotationexamples.Bus;
import com.gowdham.springdemo.interfaces.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The driver class to run the spring basic demo using Annotations(and a tiny XML file) based spring configurations.
 */

public class HelloSpringAppAnnotations {
    public static void main(String[] args) {
        // load config file and create spring container - bean factory
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
        // retrieve the bean - explicit bean id example
        Auto vehicle = context.getBean("myAuto", Auto.class);
        System.out.println("Vehicle type : " + vehicle.getVehicleType());
        Vehicle auto = vehicle.getVehicle();
        System.out.println("Model name : " + auto.getModelName());
        System.out.println("Company name : " + auto.getCompanyName());
        System.out.println("No of Wheels : " + auto.getNoOfWheels());

        // auto was defined as singleton scope - meaning single shared instance all the time, lets check that
        auto.setModelName("ULTRA");
        Auto newAuto = context.getBean("myAuto", Auto.class);
        System.out.println("model name for old auto : " + auto.getModelName());
        System.out.println("model name for new auto : " + newAuto.getVehicle().getModelName());

        // retrieve the bean - default bean id example
        Bus vehicle1 = context.getBean("bus", Bus.class);
        System.out.println("Vehicle type : " + vehicle1.getVehicleType());
        Vehicle bus = vehicle1.getVehicle();
        System.out.println("Model name : " + bus.getModelName());
        System.out.println("Company name : " + bus.getCompanyName());
        System.out.println("No of Wheels : " + bus.getNoOfWheels());
        // bus was defined as prototype scope - meaning fresh instance when each time created, lets check that
        bus.setModelName("ULTRA");
        Bus newBus = context.getBean("bus", Bus.class);
        System.out.println("model name for old bus : " + bus.getModelName());
        System.out.println("model name for new bus : " + newBus.getVehicle().getModelName());


        context.close();
    }
}
