package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_22 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        float totalCost = 0;
        float totalSale = 0;
        float difference = 0;

        for (int i = 0; i < 40; i++) {
            System.out.print("Write the product's value of cost: ");
            float productValueCost = scan.nextFloat();

            System.out.print("Write the sale's cost: ");
            float saleCost = scan.nextFloat();

            difference = productValueCost - saleCost;

            if (difference == 0) {
                System.out.println("There was a tie");
            } else {
                if (difference < 0) {
                    System.out.println("There was profit");
                } else {
                    System.out.println("There was damage");
                }
            }

            totalCost += productValueCost;
            totalSale += saleCost;

        }

        System.out.println("The average cost was: " + totalCost / 40);
        System.out.println("The average sale was:: " + totalSale / 40);

        scan.close();
    }
}
