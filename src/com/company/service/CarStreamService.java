package com.company.service;

import com.company.model.Car;
import com.company.model.ElectricCar;
import com.company.model.PassengerCar;
import com.company.model.Truck;
import com.company.util.ArrayUtil;
import com.company.util.StreamUtil;

import java.util.Arrays;
import java.util.Objects;

public class CarStreamService {
    private Car[] cars;
    final private String name;

    public CarStreamService(String name) {
        this.cars = new Car[]{};
        this.name = name;
    }

    public Car[] getCarsArray() {
        createCars(getCarParams());
        Car[] newCarsList = Arrays.copyOf(cars, cars.length);
        cars = new Car[]{};
        return newCarsList;
    }

    private String[] getCarParams() {
        String str = StreamUtil.readFile(name);
        if (str != null) {
            return str.split(";" + System.lineSeparator());
        }
        return new String[]{};
    }

    private void createCars(String[] newString) {
        for (String str : newString) {
            String[] params = str.split(",");
            switch (params[0]) {
                case "PassengerCar":
                    cars = ArrayUtil.expandArray(cars, new PassengerCar(params[1], Integer.parseInt(params[2]),
                            Double.parseDouble(params[3]),
                            params[4],
                            Double.parseDouble(params[5]),
                            Double.parseDouble(params[6])));
                    break;
                case "Truck":
                    cars = ArrayUtil.expandArray(cars, new Truck(params[1], Integer.parseInt(params[2]),
                            Double.parseDouble(params[3]),
                            params[4],
                            Double.parseDouble(params[5]),
                            Double.parseDouble(params[6])));
                    break;
                case "ElectricCar":
                    cars = ArrayUtil.expandArray(cars, new ElectricCar(params[1],
                            Integer.parseInt(params[2]),
                            Double.parseDouble(params[3]),
                            params[4], Double.parseDouble(params[5])));
                    break;
            }
        }
    }

    public void writeCarsArray(Car[] cars, String fileName) {
        String str = "";
        for (int i = 0; i < cars.length; i++) {
            str += cars[i].getClass().getSimpleName() + "," +
                    cars[i].getModel() + "," +
                    cars[i].getRegistrationNumber() + "," +
                    cars[i].getMaxSpeed() + "," +
                    cars[i].getPrice() + "," +
                    cars[i].getFuelConsumption() + ";" + System.lineSeparator();
        }
        StreamUtil.writeFile(fileName, str);
    }


}
