package VehicleMS;

import java.sql.Date;

public class Vehicle {
    private int vehicleId;
    private String brand;
    private double rentalCost;
    private String make;
    private String model;
    protected String type;
    protected boolean availability;
    protected Date lastServiceDate;

    public Vehicle(int vehicleId, String brand, double rentalCost, String make, String model,
            Date lastServiceDate) {
        this.vehicleId = vehicleId;
        this.brand = brand;

        this.rentalCost = rentalCost;
        this.make = make;
        this.model = model;

        this.availability = true;
        this.lastServiceDate = lastServiceDate;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

}

class Car extends Vehicle {
    private boolean isAuto;

    public Car(int vehicleId, String brand, double rentalCost, String make, String model,
            boolean availability, Date lastServiceDate, boolean isAuto) {
        super(vehicleId, brand, rentalCost, make, model, lastServiceDate);
        this.type = "Car";
        this.isAuto = isAuto;

    }

    public boolean isAuto() {
        return isAuto;
    }

    public void setAuto(boolean isAuto) {
        this.isAuto = isAuto;
    }

}

class Truck extends Vehicle {
    private double cargoCapacity;
    private double truckBedl;
    private int numAxels;
    private double fuelEff;

    public Truck(int vehicleId, String brand, double rentalCost, String make, String model, Date lastServiceDate,
            double cargoCapacity, double truckBedl, int numAxels,
            double fuelEff) {
        super(vehicleId, brand, rentalCost, make, model, lastServiceDate);
        this.type = "Truck";
        this.cargoCapacity = cargoCapacity;
        this.truckBedl = truckBedl;
        this.numAxels = numAxels;
        this.fuelEff = fuelEff;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getTruckBedl() {
        return truckBedl;
    }

    public int getNumAxels() {
        return numAxels;
    }

    public double getFuelEff() {
        return fuelEff;
    }

}

class Motorcycle extends Vehicle {
    private int mileage;

    public Motorcycle(int vehicleId, String brand, double rentalCost, String make, String model, Date lastServiceDate,
            int mileage) {
        super(vehicleId, brand, rentalCost, make, model, lastServiceDate);
        this.type = "Motorcycle";
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}