package com.company.model;

public class Truck extends PetrolCar {


    public Truck(String model, int maxSpeed, double price, String registrationNumber, double engineVolume, double fuelConsumption) {
        super(model, maxSpeed, price, registrationNumber, engineVolume, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Truck {" +
                " model = " + super.getModel() +
                ", maxSpeed = " + super.getMaxSpeed() + " km/h" +
                ", price = " + super.getPrice() + "$" +
                ", fuelConsumption = " + super.getFuelConsumption() + " l/km" +
                ", engineVolume = " + super.getEngineVolume() + "l" +
                ", registrationNumber = " + super.getRegistrationNumber() +
                " }";
    }
}
