package exercises;

import java.util.Scanner;

public class exercise_6 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the value to variable 'A': ");
        int A = scan.nextInt();

        System.out.print("Write the value to variable 'B': ");
        int B = scan.nextInt();

        int aux = 0;

        aux = B;
        B = A;
        A = aux;

        System.out.println("Changing the values...");

        System.out.println("the value of variable 'A' was " + B + ", but is now: " + A);
        System.out.println("the value of variable 'B' was " + A + ", but is now: " + B);

        scan.close();
    }
}
