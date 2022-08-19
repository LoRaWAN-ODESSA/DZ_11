package com.company.util;

import com.company.model.Car;

import java.util.Arrays;

public class ArrayUtil {

    public static Car[] expandArray(Car[] cars, Car newCar) {
        if (cars.length == 0) {
            return new Car[]{newCar};
        } else {
            Car[] newCars = Arrays.copyOf(cars, cars.length + 1);
            newCars[cars.length] = newCar;
            return newCars;
        }
    }
}
