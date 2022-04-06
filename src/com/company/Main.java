package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet a: ");
        int a = sc.nextInt();
        System.out.println("Ievadiet b: ");
        int b = sc.nextInt();
        int max = 0;

        while(a != 0 && b != 0){
            max = Math.max(a, b);
            if(max == a) a %= b;
            else b %= a;
        }

        System.out.println(a+b);
    }
}
