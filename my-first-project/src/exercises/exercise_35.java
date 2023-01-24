package exercises;

import java.util.Scanner;

public class exercise_35 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("What kind of customer are you? type (1) to residence, (2) to Business and (3) to industry: ");
        int typeConsumer = scan.nextInt();

        System.out.print("How many hours were the lights used?: ");
        float consumedHours = scan.nextFloat();

        float valueCount = 0;

        switch (typeConsumer) {
            case 1:
                valueCount = (float) (consumedHours * 0.6);
                break;

            case 2:
                valueCount = (float) (consumedHours * 0.48);
                break;

            case 3:
                valueCount = (float) (consumedHours * 1.29);
                break;

            default:
                System.out.println("Invalid paramenters, try again!");
                break;
        }

        if(valueCount != 0) {
            System.out.println("The account value is: " + valueCount);
        }

        scan.close();
    }
}
