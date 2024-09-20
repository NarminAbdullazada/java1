package main;

import java.util.Scanner;

public class CevreninUzunlugu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cevrənin radiusunu daxil edin:");
        double r = scanner.nextDouble();
        double uzunluq = 2 * Math.PI * r;
        System.out.println("Cevrənin uzunluğu: " + uzunluq);
    }
}