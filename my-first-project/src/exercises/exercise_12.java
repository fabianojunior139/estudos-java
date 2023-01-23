package exercises;

import java.util.Scanner;

public class exercise_12 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the car's manufacturing cost: ");
        float manufacturingPrice = scan.nextFloat();

        float priceWithTaxes = (float) (manufacturingPrice + (manufacturingPrice * 0.45));

        float finalPrice = (float) (priceWithTaxes + (priceWithTaxes * 0.28));

        System.out.println("the car's final value is: " + finalPrice);

        scan.close();
    }
}
