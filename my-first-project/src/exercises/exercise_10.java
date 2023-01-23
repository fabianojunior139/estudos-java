package exercises;

import java.util.Scanner;

public class exercise_10 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the purchase value: ");
        float purchaseValue = scan.nextFloat();

        float installments = purchaseValue / 5;

        System.out.println("The value will be 5x - " + installments + " BRL");

        scan.close();
    }
}
