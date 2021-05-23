package com.gowdham.springdemo.main;

import com.gowdham.springdemo.interfaces.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The driver class to run the spring basic demo using XML based spring configurations.
 */
public class HelloSpringAppXmlConfiguration {

    public static void main(String[] args) {
        //load config file and create the spring container - bean factory
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // getting the beans from bean factory
        Vehicle myCar = classPathXmlApplicationContext.getBean("myCar", Vehicle.class);
        Vehicle myBike = classPathXmlApplicationContext.getBean("myBike", Vehicle.class);

        // getting the bean data

        System.out.println("Vehicle1 details :");
        System.out.println("Type: " + myCar.getVehicleType());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Company Name: " + myCar.getCompanyName());
        System.out.println("No of Wheels: " + myCar.getNoOfWheels());
        System.out.println("Vehicle2 details :");
        System.out.println("Type: " + myBike.getVehicleType());
        System.out.println("Model Name: " + myBike.getModelName());
        System.out.println("Company Name: " + myBike.getCompanyName());
        System.out.println("No of Wheels: " + myBike.getNoOfWheels());

        // singleton bean example
        // modify the car object and access it again from bean factory to see the values
        myCar.setModelName("Z200");
        // access the myCar bean from factory
        Vehicle myCarUpdated = classPathXmlApplicationContext.getBean("myCar", Vehicle.class);
        System.out.println("Updated car model : " + myCarUpdated.getModelName());

        // prototype bean example
        // modify the bike object and access it again from bean factory to see the values
        myBike.setModelName("pulsar ns 160");
        // access the myCar bean from factory
        Vehicle myBikeUpdated = classPathXmlApplicationContext.getBean("myBike", Vehicle.class);
        System.out.println("Updated bike model : " + myBikeUpdated.getModelName());

        classPathXmlApplicationContext.close();
    }
}
