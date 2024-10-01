package main;

public class MethodsHome {
    public void printNumbers(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MethodsHome methodsHome = new MethodsHome();

        methodsHome.printNumbers(1, 10);
        methodsHome.printNumbers(11, 20);
        methodsHome.printNumbers(21, 30);
    }
}
