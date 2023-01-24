package exercises;

import java.util.Scanner;

public class exercise_31 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the value (number) of variable A: ");
        float A = scan.nextFloat();

        System.out.print("Write the value (number) of variable B: ");
        float B = scan.nextFloat();

        System.out.print("What type of operation do you want to do? (only one character): ");
        String C = scan.next();

        if (C.length() == 1 && C.equals("-")) {
            System.out.println("The subtraction between the numbers " + A + " and " + B + " is: " + (A - B));

        } else if (C.length() == 1 && C.equals("+")) {
            System.out.println("The sum between the numbers " + A + " and " + B + " is: " + (A + B));

        } else if (C.length() == 1 && C.equals("*")) {
            System.out.println("The multiplication between the numbers " + A + " and " + B + " is: " + (A * B));

        } else if (C.length() == 1 && C.equals("/")) {
            if (A == 0 && B == 0) {
                System.out.println("Unable to perform this operation");
            } else {
                System.out.println("The division between the numbers " + A + " and " + B + " is: " + (A / B));
            }
        } else {
            System.out.println("Invalid operator");
        }

        scan.close();
    }
}
