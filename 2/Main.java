//Tamrin1&2>>number2//
package com.company;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ADD TOW INTEGER NUMBER TO CALCULATE : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Sum: " + (num1 + num2) );
        System.out.println("Subtraction: " + (num1 - num2) );
        System.out.println("Multiplication: " + (num1 * num2) );
        float taqsim = (num1 / num2);
        System.out.println("Quotient: " + (taqsim) );
    }
}
