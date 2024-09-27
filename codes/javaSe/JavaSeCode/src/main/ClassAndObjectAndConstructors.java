package main;

public class ClassAndObjectAndConstructors {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("Dell");
        Computer computer3 = new Computer("HP", "Silver");

        System.out.println("Computer 1:");
        System.out.println("ID: " + computer1.id);
        System.out.println("Brand: " + computer1.brand);
        System.out.println("Model: " + computer1.model);
        System.out.println("Color: " + computer1.color);

        System.out.println("\nComputer 2:");
        System.out.println("ID: " + computer2.id);
        System.out.println("Brand: " + computer2.brand);
        System.out.println("Model: " + computer2.model);
        System.out.println("Color: " + computer2.color);

        System.out.println("\nComputer 3:");
        System.out.println("ID: " + computer3.id);
        System.out.println("Brand: " + computer3.brand);
        System.out.println("Model: " + computer3.model);
        System.out.println("Color: " + computer3.color);
    }
}

class Computer {
    Integer id;
    String brand;
    String model;
    String color;

    public Computer() {
        System.out.println("Default constructor called");
    }

    public Computer(String model) {
        System.out.println("Constructor with model called: " + model);
        this.model = model;
    }

    public Computer(String model, String color) {
        System.out.println("Constructor with model and color called: " + model + ", " + color);
        this.model = model;
        this.color = color;
    }
}