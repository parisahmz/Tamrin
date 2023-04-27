//Tamrin1&2-3
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Length Of Yard:");
            float length = input.nextFloat();

            System.out.println("Enter Width Of Yard:");
            float width = input.nextFloat();

            float areay = width * length;
            System.out.println("Area of your yard is:" + areay);

            System.out.println("Enter Length Of House:");
            float x = input.nextFloat();

            System.out.println("Enter Width Of House:");
            float y = input.nextFloat();

            float areah = x * y;
            System.out.println("Area of your house is:" + areah);

            float delta = areay - areah;
            System.out.println("Delta area is " + delta);

            System.out.println("The Average speed of Lawn Mower is " + 2.3);
            float t = ( ( (10 * delta) / 23) / 60 );
            System.out.println("The Time Of Lawn Mower Working Is: " + t + "min");
        }
    }

