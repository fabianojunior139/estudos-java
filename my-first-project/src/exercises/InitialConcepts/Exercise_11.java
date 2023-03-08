package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_11 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the product's cost price: ");
        float costPrice = scan.nextFloat();

        System.out.print("Write the percentage of the increment value: ");
        float increment = scan.nextFloat();

        float finalPrice = costPrice + (costPrice * (increment / 100));

        System.out.println("The product's final price with " + increment + "% increment is: " + finalPrice);

        scan.close();
    }
}
