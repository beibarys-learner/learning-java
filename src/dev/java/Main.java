package dev.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        Car nissan = new Car();
        nissan.color = "blue";
        nissan.name = "nissan n1";
        nissan.model = "sedan";
        nissan.drive();

        Car bmw = new Car();
        bmw.color = "blue";
        bmw.name = "bmw x5";
        bmw.model = "sedan";
        bmw.stop();
    }
}