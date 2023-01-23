package exercises;

import java.util.Scanner;

public class exercise_13 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write any integer number: ");
        int number = scan.nextInt();

        if (number == 10) {
            System.out.println("The number written is 10!");
        } else {
            if (number > 10) {
                System.out.println("The number written is greater than 10!");
            } else {
                System.out.println("The number written is less than 10!");

            }
        }

        scan.close();
    }
}
