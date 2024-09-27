package main;

public class ClassAndObjectHome {
    public static void main(String[] args) {
        class Person {
            int id;
            String name;
            String surname;
            int age;
            String phone;
        }

        Person person1 = new Person();
        Person person2 = new Person();

        person1.id = 1;
        person1.name = "John";
        person1.surname = "Doe";
        person1.age = 30;
        person1.phone = "123-456-7890";

        person2.id = 2;
        person2.name = "Jane";
        person2.surname = "Smith";
        person2.age = 25;
        person2.phone = "098-765-4321";

        System.out.println("Person 1:");
        System.out.println("ID: " + person1.id);
        System.out.println("Name: " + person1.name);
        System.out.println("Surname: " + person1.surname);
        System.out.println("Age: " + person1.age);
        System.out.println("Phone: " + person1.phone);

        System.out.println("\nPerson 2:");
        System.out.println("ID: " + person2.id);
        System.out.println("Name: " + person2.name);
        System.out.println("Surname: " + person2.surname);
        System.out.println("Age: " + person2.age);
        System.out.println("Phone: " + person2.phone);
    }
}
