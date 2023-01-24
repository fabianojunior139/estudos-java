package exercises;

import java.util.Scanner;

public class exercise_32 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write a integer value for the first side of a triangle: ");
        int firstSide = scan.nextInt();

        System.out.print("Write a integer value for the second side of a triangle: ");
        int secondSide = scan.nextInt();

        System.out.print("Write a integer value for the third side of a triangle: ");
        int thirdSide = scan.nextInt();

        if (firstSide < secondSide + thirdSide && secondSide < firstSide + thirdSide && thirdSide < firstSide + secondSide) {
            if (firstSide == secondSide && secondSide == thirdSide) {
                System.out.println("Equilateral and Isosceles triangle!");

            } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
                System.out.println("Isosceles Triangle!");

            } else if (firstSide != secondSide && secondSide != thirdSide) {
                System.out.println("Scalene triangle!");
            }
        } else {
            System.out.println("Impossible to build a triangle with these values");
        }

        System.out.println("");

        scan.close();
    }
}
