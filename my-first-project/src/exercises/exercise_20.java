package exercises;

import java.util.Scanner;

public class exercise_20 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        char option = 'n';

        int counterCars = 0;
        int counterTotalCars = 0;

        while (option == 'n' || option == 'N') {
            System.out.println("Write the car's year: ");
            int year = scan.nextInt();

            if (year > 2000) {
                System.out.println("You have 7% off on the purchase of this car!");
                counterCars++;
            } else {
                System.out.println("You have 12% off on the purchase of this car!");
            }

            counterTotalCars++;

            System.out.println("Do you want to stop? (N) to continue // (Y) to finish");
            option = scan.next().charAt(0);
        }

        System.out.println(counterCars + " cars are from the year 2000 and below.");
        System.out.println(counterTotalCars + " cars were consulted");

        scan.close();
    }
}
