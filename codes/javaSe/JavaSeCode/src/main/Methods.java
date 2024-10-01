package main;

public class Methods {
    public void printName(int count, String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Methods methods = new Methods();

        methods.printName(2, "Fidan");
        methods.printName(3, "Ayan");
        methods.printName(1, "Nəzrin");
    }
}