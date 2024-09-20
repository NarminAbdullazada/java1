package main;

import java.util.Scanner;

public class EdedinCutOlubOlmaması {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.println("Ədədi daxil edin:");
        int a = skanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Ədəd cütdür.");
        } else {
            System.out.println("Ədəd cüt deyil.");
        }
    }
}
