package com.company;

public abstract class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection +
                " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " +
                currentVelocity + " in direction " + currentDirection);
    }

    public void destination() {
        System.out.println("Didn't select destination. Driving to deafult one.");
    }

    public void destination(String country) {
        System.out.println("Driving to " + country + ".");
    }

    public void destination(String city, String country) {
        System.out.println("Driving to " + city + ", " + country + ".");
    }

    public void destination(String address, String city, String country) {
        System.out.println("Driving to " + address + ", " + city + "," + country + ".");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
