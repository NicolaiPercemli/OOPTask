package com.company;

public class Main {

    public static void main(String[] args) {
        Porsche porsche = new Porsche(36);
        porsche.destination();
        porsche.destination("Germany");
        porsche.steer(45);
        porsche.accelerate(30);
        porsche.stop();
        porsche.isHeatingOn(false);

        Mercedes mercedes = new Mercedes(24);
        mercedes.destination("Stefan cel Mare str, 40","Chisinau", "Moldova");
        mercedes.steer(90);
        mercedes.accelerate(50);
        mercedes.stop();
        mercedes.isLightingOn(true);

        }
    }



