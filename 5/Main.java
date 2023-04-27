//tamrin1&2-5
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        System.out.println("Enter numerator of deducation1: ");
        int num1x = inpute.nextInt();
        System.out.println("Enter denominator of deducation1: ");
        int num1y = inpute.nextInt();
        System.out.println("deducation1:" + num1x + "/" + num1y);

        System.out.println("Enter numerator of deducation2: ");
        int num2x = inpute.nextInt();
        System.out.println("Enter denominator of deducation2: ");
        int num2y = inpute.nextInt();
        System.out.println("deducation2:" + num2x + "/" + num2y);

        int numerator = num1x * num2x;
        int denominator = num1y * num2y;
        System.out.println("The result of mutiplication of this 2 deducation is: " + numerator + "/" + denominator);
    }
}
