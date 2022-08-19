package com.company.model;

public class ElectricCar extends Car {

    public ElectricCar(String model, int maxSpeed, double price, String registrationNumber, double fuelConsumption) {
        super(model, maxSpeed, price, registrationNumber, fuelConsumption);
        super.setFuelConsumption(0.0);
    }

    @Override
    public String toString() {
        return "ElectricCar {" +
                " model = " + super.getModel() +
                ", maxSpeed = " + super.getMaxSpeed() + " km/h" +
                ", price = " + super.getPrice() + "$" +
                ", registrationNumber = " + super.getRegistrationNumber() +
                " }";
    }

}
