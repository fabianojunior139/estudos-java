package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_15 {

    public void execute() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write any number: ");
        int chosenNumber = scan.nextInt();

        if (chosenNumber >= 100 && chosenNumber <= 200) {
            System.out.println("The number is between 100 and 200!");
        } else {
            System.out.println("The number isn't between 100 and 200!");
        }

        scan.close();
    }
}
