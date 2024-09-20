package main;

public class SadeEdedler {
    public static void main(String[] args) {
        int count = 0;
        int a = 2;
        while (count < 20) {
            boolean sade = true;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    sade = false;
                    break;
                }
            }
            if (sade) {
                System.out.println(a);
                count++;
            }
            a++;
        }
    }
}