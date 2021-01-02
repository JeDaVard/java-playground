package com.company;

interface Things {
    Integer a = 1;
    String b = "";
}

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Bosh", 4.2, "Black");
        fan.switchOn();
        fan.setSpeed((byte) 4);
        fan.switchOff();

    }
}
