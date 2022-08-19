package com.company.model;

public abstract class PetrolCar extends Car {

    private double engineVolume;
    private double fuelConsumption;

    public PetrolCar(String model, int maxSpeed, double price, String registrationNumber, double engineVolume, double fuelConsumption) {
        super(model, maxSpeed, price, registrationNumber, fuelConsumption);
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
