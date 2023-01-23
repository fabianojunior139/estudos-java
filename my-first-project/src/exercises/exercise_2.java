package exercises;

import java.util.Scanner;

public class exercise_2 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the first number: ");
        float number1 = scan.nextFloat();

        System.out.print("Write the second number: ");
        float number2 = scan.nextFloat();

        System.out.println("");

        System.out.println("The sum of numbers is: " + (number1 + number2));
        System.out.println("The subtraction of numbers is: " + (number1 - number2));
        System.out.println("The multiplication of numbers is: " + (number1 * number2));
        System.out.println("The division of numbers is: " + (number1 / number2));

        System.out.println("");

        scan.close();
    }
}
