package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_30 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Write the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Write the third number: ");
        int num3 = scan.nextInt();

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }

        if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }

        if (num3 < num2 && num1 < num3) {
            if (num1 < num2) {
                System.out.println(num3 + " " + num1 + " " + num3);
            } else {
                System.out.println(num3 + " " + num3 + " " + num1);
            }
        }

        scan.close();
    }
}
