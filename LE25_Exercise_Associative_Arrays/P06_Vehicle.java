package LE22_Objects_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_Vehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();

        String line = scan.nextLine();
        while(!line.equals("End")){
            String[] data = line.split("\\s+");

            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            line = scan.nextLine();
        }
        line = scan.nextLine();

        while(!line.equals("Close the Catalogue")){
            String model = line;

            vehicleList.stream().filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));


            line = scan.nextLine();
        }
        List<Vehicle> cars = vehicleList.stream()
                .filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = vehicleList.stream()
                .filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        double carsAvgHp = avgHp(cars);
        double trucksAvgHp = avgHp(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvgHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksAvgHp);
    }

    static double avgHp (List<Vehicle> vehicles){
        if(vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
    }
    static class Vehicle {
        String type;
        String model;
        String colour;

        int horsePower;

        public Vehicle(String type, String model, String colour, int HP){
            this.type = type;
            this.model = model;
            this.colour = colour;
            this.horsePower = HP;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColour() {
            return colour;
        }

        public int getHorsePower() {
            return horsePower;
        }

        @Override
        public String toString (){
            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d", getType().toUpperCase().charAt(0)+getType().substring(1),
                    this.model, this.colour, this.horsePower);
        }



    }
}
