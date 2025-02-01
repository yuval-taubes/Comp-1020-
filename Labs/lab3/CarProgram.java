package Labs.lab3;

public class CarProgram {
    public static void main(String[] args) {
    //     Car[] cars = new Car[10];
    //     fillArray(cars);
        
    //     System.out.println("All Cars:");
    //     printCars(cars);
        
    //     System.out.println("\nFord Cars:");
    //     printCarsByMake(cars, "Ford");
        
    //     System.out.println("\nToyota Cars:");
    //     printCarsByMake(cars, "Toyota");
        
    //     System.out.println("\nLada Cars:");
    //     printCarsByMake(cars, "Lada"); // Should print nothing
        
    //     System.out.println("\nCars from 1998 to 2012:");
    //     printCarsByYearRange(cars, 1998, 2012);
        
    //     System.out.println("\nCars from 2019 to 2020:");
    //     printCarsByYearRange(cars, 2019, 2020);
        
    //     System.out.println("\nCars with better than 10 l/100km mileage:");
    //     printCarsByMileage(cars, true);
        
    //     System.out.println("\nCars with worse than 10 l/100km mileage:");
    //     printCarsByMileage(cars, false);
    // }

    // public static void fillArray(Car[] cars) {
    //     cars[0] = new Car("Ford", "Focus", 2012, 7.2);
    //     cars[1] = new Car("Toyota", "RAV4", 2019, 8.5);
    //     cars[2] = new Car("Ford", "Mustang", 2015, 11.2);
    //     cars[3] = new Car("Toyota", "Corolla", 2008, 6.8);
    //     cars[4] = new Car("Honda", "Civic", 2020, 6.5);
    //     cars[5] = new Car("Chevrolet", "Camaro", 2017, 12.0);
    //     cars[6] = new Car("Mazda", "CX-5", 2021, 7.8);
    //     cars[7] = new Car("Hyundai", "Elantra", 2015, 7.0);
    //     cars[8] = new Car("Ford", "Explorer", 2010, 10.5);
    //     cars[9] = new Car("Toyota", "Highlander", 2022, 9.2);
    // }

    // public static void printCars(Car[] cars) {
    //     for (Car car : cars) {
    //         System.out.println(car);
    //     }
    // }

    // public static void printCarsByMake(Car[] cars, String make) {
    //     for (Car car : cars) {
    //         if (car.getMake().equalsIgnoreCase(make)) {
    //             System.out.println(car);
    //         }
    //     }
    // }

    // public static void printCarsByYearRange(Car[] cars, int startYear, int endYear) {
    //     for (Car car : cars) {
    //         if (car.getYear() >= startYear && car.getYear() <= endYear) {
    //             System.out.println(car);
    //         }
    //     }
    // }

    // public static void printCarsByMileage(Car[] cars, boolean betterThan10) {
    //     for (Car car : cars) {
    //         if ((betterThan10 && car.getMileage() < 10) || (!betterThan10 && car.getMileage() >= 10)) {
    //             System.out.println(car);
    //         }
    //     }
    // }


        Car[] cars = new Car[20];
        int carCount = fillArray(cars);
        
        System.out.println("All Cars:");
        printCars(cars, carCount);
        
        System.out.println("\nFord Cars:");
        printCarsByMake(cars, carCount, "Ford");
        
        System.out.println("\nToyota Cars:");
        printCarsByMake(cars, carCount, "Toyota");
        
        System.out.println("\nLada Cars:");
        printCarsByMake(cars, carCount, "Lada"); // Should print nothing
        
        // System.out.println("\nCars from 1998 to 2012:");
        // printCarsByYearRange(cars, carCount, 1998, 2012);
        
        System.out.println("\nCars from 2019 to 2020:");
        printCarsByYearRange(cars, carCount, 6000, 1);
        
        System.out.println("\nCars with better than 10 l/100km mileage:");
        printCarsByMileage(cars, carCount, true);
        
        System.out.println("\nCars with worse than 10 l/100km mileage:");
        printCarsByMileage(cars, carCount, false);
    }

    public static int fillArray(Car[] cars) {
        cars[0] = new Car("Ford", "Focus", 2012, 7.2);
        cars[1] = new Car("Toyota", "RAV4", 2019, 8.5);
        cars[2] = new Car("Ford", "Mustang", 2015, 11.2);
        cars[3] = new Car("Toyota", "Corolla", 2008, 6.8);
        cars[4] = new Car("Honda", "Civic", 2020, 6.5);
        cars[5] = new Car("Chevrolet", "Camaro", 2017, 12.0);
        cars[6] = new Car("Mazda", "CX-5", 2021, 7.8);
        cars[7] = new Car("Hyundai", "Elantra", 2015, 7.0);
        cars[8] = new Car("Ford", "Explorer", 2010, 10.5);
        cars[9] = new Car("Toyota", "Highlander", 2022, 9.2);
        cars[10] = new Car("Nissan", "Altima", 2018, 8.0);
        return 11;
    }

    public static void printCars(Car[] cars, int carCount) {
        for (int i = 0; i < carCount; i++) {
            System.out.println(cars[i]);
        }
    }

    public static void printCarsByMake(Car[] cars, int carCount, String make) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getMake().equalsIgnoreCase(make)) {
                System.out.println(cars[i]);
            }
        }
    }

    public static void printCarsByYearRange(Car[] cars, int carCount, int startYear, int endYear) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getYear() >= startYear && cars[i].getYear() <= endYear) {
                System.out.println(cars[i]);
            }
        }
    }

    public static void printCarsByMileage(Car[] cars, int carCount, boolean betterThan10) {
        for (int i = 0; i < carCount; i++) {
            if ((betterThan10 && cars[i].getMileage() < 10) || (!betterThan10 && cars[i].getMileage() >= 10)) {
                System.out.println(cars[i]);
            }
        }
    }
}
