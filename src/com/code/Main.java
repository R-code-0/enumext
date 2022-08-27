package com.code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Жума күнүн англисче жазыңыз: ");
        String s = sc.next().toUpperCase();
        for (DayOfWeek value : DayOfWeek.values()) {
            if (value.name().equals(s)) {
                System.out.println(DayOfWeek.valueOf(s));
                System.exit(0);
            }
        }
        System.out.println("Жума күнү табылган жок.");
    }
}