package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_8 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("How much is costing dollar today? ");
        float priceDollar = scan.nextFloat();

        System.out.print("How much dollars do you have? ");
        float totalDollars = scan.nextFloat();

        float valueInReal = priceDollar * totalDollars;

        System.out.println("Do you have " + valueInReal + " BRL");

        scan.close();
    }
}
