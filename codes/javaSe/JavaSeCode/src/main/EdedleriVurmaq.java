package main;

import java.util.Scanner;

public class EdedleriVurmaq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin:");
        int a = scanner.nextInt();
        System.out.println("İkinci ədədi daxil edin:");
        int b = scanner.nextInt();
        int hasil = a * b;
        System.out.println("Nəticə: " + hasil);
    }
}