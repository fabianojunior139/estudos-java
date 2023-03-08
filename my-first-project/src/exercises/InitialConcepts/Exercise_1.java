package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_1 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Write the second number: ");
        int number2 = scan.nextInt();

        int result = number1 + number2;

        System.out.println("The sum of the numbers is: " + result);

        scan.close();
    }
}