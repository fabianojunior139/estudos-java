package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_18 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 75; i++) {
            System.out.print("Write the age of the person " + (i + 1) + ": ");
            int age = scan.nextInt();

            if (age >= 18) {
                System.out.println("This person is of legal age!");
            } else {
                System.out.println("This person isn't of legal age");
            }
        }

        scan.close();
    }
}
