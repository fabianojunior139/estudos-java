package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_7 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the current temperature (in Celcius): ");
        float celcius = scan.nextFloat();

        float fahrenheit = (9 * celcius + 160) / 5;

        System.out.println("The current temperature in Fahrenheit is: " + fahrenheit);

        scan.close();

    }
}