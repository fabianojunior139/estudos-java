package exercises;

import java.util.Scanner;

public class exercise_24 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        char wishContinue = 'y';

        while (wishContinue == 'y' || wishContinue == 'Y') {
            System.out.print("Type any number: ");
            int WrittenNumber = scan.nextInt();

            if (WrittenNumber == 0) {
                System.out.println("The number is 0!");
            } else {
                if (WrittenNumber > 0) {
                    System.out.println("The number is positive");
                } else {
                    System.out.println("The number is negative");
                }
            }

            System.out.print("Do you want to continue? Type 'y' to proceed // 'n' to finish: ");
            wishContinue = scan.next().charAt(0);
        }

        scan.close();

    }
}
