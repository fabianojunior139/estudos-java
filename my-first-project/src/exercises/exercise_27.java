package exercises;

import java.util.Scanner;

public class exercise_27 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        int option = 1;
        float totalDiscount = 0;
        float totalPaid = 0;

        while (option != 0) {
            System.out.print("Write the car's value: ");
            float carValue = scan.nextFloat();

            System.out.print("What is the type of fuel? (1) to alcohol (2) to gasoline (3) to diesel: ");
            int fuelType = scan.nextInt();

            if (fuelType < 1 || fuelType > 3) {
                System.out.println("Invalid command!");
            }

            if (fuelType == 1) {
                carValue = (float) (carValue - (carValue * 0.25));
                totalDiscount = (float) (carValue * 0.25);
                totalPaid += carValue;
                System.out.println("The new price of the car with 25% of discount is: " + carValue + " BRL");

            } else if (fuelType == 2) {
                carValue = (float) (carValue - (carValue * 0.21));
                totalDiscount = (float) (carValue * 0.21);
                totalPaid += carValue;
                System.out.println("The new price of the car with 21% of discount is: " + carValue + " BRL");

            } else if (fuelType == 3) {
                carValue = (float) (carValue - (carValue * 0.14));
                totalDiscount = (float) (carValue * 0.14);
                totalPaid += carValue;
                System.out.println("The new price of the car with 14% of discount is: " + carValue + " BRL");
            }

            System.out.println("");
            System.out.print("DO you want to stop? Type (0) to finish or any other key to continue: ");
            option = scan.nextInt();
            System.out.println("");
        }

        System.out.println("The total discounts were: " + totalDiscount);
        System.out.println("The total paid by customers was: " + totalPaid);

        scan.close();
    }
}
