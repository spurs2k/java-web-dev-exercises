package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        gas = input.nextDouble();

        mpg = (miles / gas);
        System.out.println("Your miles per gallon for this trip was " + mpg + ".");
        input.close();
    }
}

