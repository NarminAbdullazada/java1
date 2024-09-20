package main;

import java.util.Scanner;

public class EnBoyukReqem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ədədi daxil edin:");
        int a = scanner.nextInt();
        int enBoyuk = a % 10;
        while (a > 0) {
            int reqem = a % 10;
            if (reqem > enBoyuk) {
                enBoyuk = reqem;
            }
            a /= 10;
        }
        System.out.println("Ən böyük rəqəm: " + enBoyuk);
    }
}
