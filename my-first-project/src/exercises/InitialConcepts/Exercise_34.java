package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_34 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the swimmer's age: ");
        int age = scan.nextInt();

        if (age >= 5 && age <= 25) {
            if (age >= 5 && age <= 7) {
                System.out.println("Category: A-Childish");

            } else if (age >= 8 && age <= 10) {
                System.out.println("Category: B-Childish");

            } else if (age >= 11 && age <= 13) {
                System.out.println("Category: A-Juvenile");

            } else if (age >= 14 && age <= 17) {
                System.out.println("Category: B-Juvenile");

            } else if (age >= 18 && age <= 25) {
                System.out.println("Category: Senior");
            }
        } else {
            System.out.println("Out-of-age swimmer");
        }

        System.out.println("");
        scan.close();
    }
}
