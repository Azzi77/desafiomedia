package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;
        A= sc.nextDouble();
        B= sc.nextDouble();

        media = ((( A *3.5 )+ ( B*7.5))/11);

        System.out.printf("MEDIA = %.5f",  media   );
        System.out.println();
    }
}
