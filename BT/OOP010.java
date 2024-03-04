package BT;

import java.util.Scanner;

class Product {
    private String name;
    private String location;
    private int weight;

    public Product() {

    }

    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    public String toString() {
        return name + " (" + weight + "kg) can be found from the " + location;
    }

}

public class OOP010 {
    public static void main(String[] args) {

        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure.toString());
        System.out.println(plaster.toString());
        System.out.println(tyre.toString());

    }
}
