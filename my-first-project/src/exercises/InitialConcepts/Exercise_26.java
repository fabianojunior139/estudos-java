package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_26 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Write the numbers from 1 to 5: ");
            int typedNumber = scan.nextInt();

            if (typedNumber != (i + 1)) {
                System.out.println("Invalid number!");
                break;
            }

            if (i == 4) {
                System.out.println("You complete the challenge!");
            }
        }

        scan.close();
    }
}
