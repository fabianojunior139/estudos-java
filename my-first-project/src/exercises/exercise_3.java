package exercises;

import java.util.Scanner;

public class exercise_3 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the total distance traveled: ");
        float distance = scan.nextFloat();

        System.out.print("Write the total liters of fuel used: ");
        float fuel = scan.nextFloat();

        float consumption = (distance / fuel);

        System.out.println("Your average consumption is: " + consumption + "  km/l");

        scan.close();
    }
}
