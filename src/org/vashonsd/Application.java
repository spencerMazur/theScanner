package org.vashonsd;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me the temperature in Fahrenheit:");
        double theNumber = scan.nextInt( );
        scan.nextLine();
        double inCelsius = (theNumber-32) * (5.0/9.0);
        System.out.println("The temperature in Celsius is " + inCelsius);



    }
}
