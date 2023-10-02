package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 lambo = new F1("lambo", false);
        lambo.move(40, 0);
        lambo.accelerate(20);
        lambo.accelerate(-60);
    }
}