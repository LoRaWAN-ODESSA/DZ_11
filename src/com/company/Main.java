package com.company;

import com.company.model.Car;
import com.company.service.CarStreamService;

public class Main {
    public static void main(String[] args) {
        String fileName = "/Users/sergey_kovalenko/Downloads/DZ_11/src/com/company/cars.txt";
        String newFileName = "/Users/sergey_kovalenko/Downloads/DZ_11/src/com/company/newCars.txt";
        CarStreamService carStreamService = new CarStreamService(fileName);
        Car[] cars = carStreamService.getCarsArray();

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].toString());
        }

        carStreamService.writeCarsArray(cars, newFileName);
    }
}