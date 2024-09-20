package main;

import java.util.Scanner;

public class EdedinReqemleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ədədi daxil edin:");
        int a = scan.nextInt();
        int cem = 0;
        while (a > 0) {
            cem += a % 10;
            a /= 10;
        }
        System.out.println("Rəqəmlərin cəmi: " + cem);
    }
}
