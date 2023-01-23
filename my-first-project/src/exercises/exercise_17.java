package exercises;

import java.util.Scanner;

public class exercise_17 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        int counterIfTrue = 0;

        for (int i = 0; i < 80; i++) {
            System.out.print("Write any integer number: ");
            int chosenNumber = scan.nextInt();

            if (chosenNumber >= 10 && chosenNumber <= 150) {
                counterIfTrue++;
            }
        }

        System.out.println(counterIfTrue + " numbers are between 10 and 150.");

        scan.close();
    }

}
