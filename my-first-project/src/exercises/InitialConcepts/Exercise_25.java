package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_25 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Write the second number: ");
        int secondNumber = scan.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are the same!");
        } else {
            if (firstNumber > secondNumber) {
                System.out.println("The numbers are different, and the number " + firstNumber + " is greater than number " + secondNumber);
            } else {
                System.out.println("The numbers are different, and the number " + secondNumber + " is greater than number " + firstNumber);
            }
        }

        scan.close();
    }
}
