//Tamrin1&2-1
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer number: " );
        int x = input.nextInt();

        int houre = x/3600;
        int temp = houre * 3600;
        int min = (x - temp)/60;
        int sec = (x - temp)-(min * 60);
        System.out.println(houre + " houres and " + min + " minutes and " + sec + " seconds" );

    }
}
