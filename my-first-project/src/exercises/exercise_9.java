package exercises;

import java.util.Scanner;

public class exercise_9 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the value deposited: ");
        float valueDeposited = scan.nextFloat();

        float yield = (float) (valueDeposited + (valueDeposited * 0.07));

        System.out.print("The value deposited after 1 month will be: " + yield);

        scan.close();
    }
}
