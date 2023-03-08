package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_19 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        int male = 0;
        int female = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("What's your name? ");
            String name = scan.next();

            System.out.print("What's your gender? type 1 - to male // 2 - to female: ");
            int gender = scan.nextInt();

            System.out.println("");

            System.out.println("Name: " + name);

            if (gender == 1 || gender == 2) {
                if (gender == 1) {
                    System.out.println("Gender: Male");
                    male++;
                } else {
                    System.out.println("Gender: Female");
                    female++;
                }
            } else {
                System.out.println("Write a valid number!");
            }

            System.out.println("");
        }

        System.out.println(male + " person that response the quiz are men, and " + female + " are women.");

        scan.close();
    }
}
