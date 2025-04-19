package mobile;

import java.util.Scanner;

class Mobile {
    String brand;
    String model;
    int price;


    public Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}