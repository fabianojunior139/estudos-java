package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_4 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the employee name: ");
        String name = scan.nextLine();

        System.out.print("Write the employee salary: ");
        float salary = scan.nextFloat();

        System.out.print("Write the total sales the employee made (in cash): ");
        float totalSales = scan.nextFloat();

        float salaryWithCommission = (float) ((totalSales * 0.15) + salary);

        System.out.println("The employee " + name + " has a fixed salary of " + salary
                + " but in this mouth his salary will be " + salaryWithCommission + ".");

        scan.close();
    }
}
