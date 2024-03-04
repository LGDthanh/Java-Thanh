package BT;

import java.util.Scanner;

class Dog {
    private String name;
    private String breed;
    private int age;

    // public Dog(String name, String breed, int age) {
    // this.name = name;
    // this.breed = breed;
    // this.age = age;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDogDetail() {
        System.out.println("Name:" + this.name + "--Breed:" + this.breed + "--Age:" + this.age);

    }

}

public class TET_HOLIDAY {
    public static void main(String[] args) {

        Dog hp = new Dog();
        hp.setName("Micky");
        hp.setBreed("Husky");
        hp.setAge(12);
        hp.printDogDetail();

    }
}