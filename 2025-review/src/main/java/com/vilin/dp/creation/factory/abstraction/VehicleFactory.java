package com.vilin.dp.creation.factory.abstraction;

public interface VehicleFactory {

    AbstractCar createCar(String name);

    AbstractBicycle createBicycle(String name);

    AbstractMotorcycle createMotorcycle(String name);
}
