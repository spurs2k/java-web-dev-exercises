package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        Double gas = input.nextDouble();

        Double mpg = (miles / gas);
        System.out.println("Your miles per gallon for this trip was " + mpg + ".");
        input.close();
    }
}

