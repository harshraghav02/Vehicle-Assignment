package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    public Boat(){

    }
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return "Boat";
    }

    @Override
    public int getVehicleCapacity() {
        return 2;
    }
}
