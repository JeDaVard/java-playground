package com.company;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn = false;
    private byte speed = 0;

    public Fan(String make, double radius, String color) {
        this.radius = radius;
        this.make = make;
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
        setSpeed((byte) 0);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return String.format("%s %s fan is %s, the speed is %d (radius %f)", color, make, isOn() ? "ON" : "OFF", getSpeed(), radius);
    }
}
