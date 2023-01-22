package exercises;

import java.util.Scanner;

public class exercise_16 {
    public void execute() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write the first student note: ");
        double note1 = scan.nextInt();

        System.out.print("Write the second student note: ");
        double note2 = scan.nextInt();

        System.out.print("Write the Third student note: ");
        double note3 = scan.nextInt();

        double average = (note1 + note2 + note3) / 3;

        if (average >= 7) {
            System.out.println("The student's average is: " + average + " and it's approved!");
        } else {
            if (average >= 5.1 && average <= 6.9) {
                System.out.println("The student's average is: " + average + " and is in recovery!");
            } else {
                System.out.println("The student's average is: " + average + " and is flunked!");
            }
        }

        scan.close();
    }
}
