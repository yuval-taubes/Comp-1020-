package Labs.lab3;
// import java.util.*;

public class Car {

    private String make;
    private String model;
    private int year;
    private double mileage; // in l/100km

    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " - " + mileage + " l/100km";
    }
}

