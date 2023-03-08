package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_28 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        float totalIncrease = 0;

        for (int i = 0; i < 584; i++) {
            System.out.print("Employee name: ");
            String name = scan.next();

            System.out.print("Employee salary: ");
            float salary = scan.nextFloat();

            System.out.print("Minimum wage amount: ");
            float minimumWage = scan.nextFloat();

            float numberOfMinimumWage = salary / minimumWage;
            float readjustment = 0;

            if (numberOfMinimumWage > 0 && numberOfMinimumWage <= 3) {
                readjustment = (float) (salary * 0.5);
                salary = (float) (salary + (salary * 0.5));
                totalIncrease += readjustment;
                System.out.println("The employee " + name + " had a readjustment of " + readjustment
                        + " BRL. Your new salary is: " + salary);

            } else if (numberOfMinimumWage > 3 && numberOfMinimumWage <= 10) {
                readjustment = (float) (salary * 0.2);
                salary = (float) (salary + (salary * 0.2));
                totalIncrease += readjustment;
                System.out.println("The employee " + name + " had a readjustment of " + readjustment
                        + " BRL. Your new salary is: " + salary);

            } else if (numberOfMinimumWage > 10 && numberOfMinimumWage <= 20) {
                readjustment = (float) (salary * 0.15);
                salary = (float) (salary + (salary * 0.15));
                totalIncrease += readjustment;
                System.out.println("The employee " + name + " had a readjustment of " + readjustment
                        + " BRL. Your new salary is: " + salary);

            } else if (numberOfMinimumWage > 20) {
                readjustment = (float) (salary * 0.1);
                salary = (float) (salary + (salary * 0.1));
                totalIncrease += readjustment;
                System.out.println("The employee " + name + " had a readjustment of " + readjustment
                        + " BRL. Your new salary is: " + salary);
            }

            System.out.println("");
        }

        System.out.println("The total increase on the payroll was: " + totalIncrease);

        scan.close();
    }
}
