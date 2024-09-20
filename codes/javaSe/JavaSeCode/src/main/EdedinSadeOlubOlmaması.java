package main;

import java.util.Scanner;

public class EdedinSadeOlubOlmaması {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ədədi daxil edin:");
        int a = scanner.nextInt();
        boolean sade = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                sade = false;
                break;
            }
        }
        if (sade) {
            System.out.println("Ədəd sadədir.");
        } else {
            System.out.println("Ədəd sadə deyil.");
        }
    }
}
