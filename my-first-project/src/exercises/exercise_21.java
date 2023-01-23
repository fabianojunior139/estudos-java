package exercises;

import java.util.Scanner;

public class exercise_21 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        char option = 'n';

        int counterEligiblePeople = 0;
        int totalPeopleCheck = 0;

        while (option == 'n' || option == 'N') {
            System.out.print("Write your name: ");
            String name = scan.next();

            System.out.print("Write your gender: (1) to male // (2) to female: ");
            int gender = scan.nextInt();

            System.out.print("Write your age: ");
            int age = scan.nextInt();

            System.out.print("Write your name: (1) to good // (2) to bad: ");
            int health = scan.nextInt();

            if (gender == 1 && age >= 18 && health == 1) {
                System.out.println(name + ", you are eligible for mandatory military service!");
                counterEligiblePeople++;
            } else {
                System.out.println(name + ", you aren't eligible for mandatory military service!");
            }

            totalPeopleCheck++;

            System.out.println("");
            System.out.println("Do you want to stop? (Y) to finish // (N) to continue");
            option = scan.next().charAt(0);
        }

        System.out.println("Of the " + totalPeopleCheck + " people who consulted, " + counterEligiblePeople
                + " are ready for mandatory enlistment");

        scan.close();
    }
}
