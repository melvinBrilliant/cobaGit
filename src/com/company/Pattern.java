package com.company;

import java.util.Scanner;

public class Pattern {

    public static void showPattern1() {
        System.out.println("------------------------------------------------");
        System.out.println("Pattern 1");
        System.out.println("Masukkan nilai max");
        Scanner userInput = new Scanner(System.in);
        int n = Integer.parseInt(userInput.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
