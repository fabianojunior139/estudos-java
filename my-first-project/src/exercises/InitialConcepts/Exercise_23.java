package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_23 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        char option = 'y';

        while (option == 'y' || option == 'Y') {

            System.out.print("Write any integer number: ");
            int number = scan.nextInt();

            if (number == 40) {
                System.out.println("The number is 40!");
            } else {
                if (number == 80) {
                    System.out.println("The number is 80!");
                } else {
                    if (number > 80) {
                        System.out.println("The number is greater than 80!");
                    }
                }

                if (number == 25) {
                    System.out.println("The number is 25!");
                } else {
                    if (number < 25) {
                        System.out.println("The number is less than 25!");
                    }
                }

                if (number < 80 && number > 25) {
                    System.out.println("The number is between 25 and 80!");
                }
            }

            System.out.println("");
            System.out.print("Do you want to continue? // ('y') to continue | ('n') to finish: ");
            option = scan.next().charAt(0);
            System.out.println("");

        }

        scan.close();
    }
}
