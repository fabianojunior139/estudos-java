package exercises;

import java.util.Scanner;

public class exercise_5 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write the student's name: ");
        String nameStudent = scan.nextLine();

        System.out.print("Write the student's first note: ");
        int note1 = scan.nextInt();

        System.out.print("Write the student's second note: ");
        int note2 = scan.nextInt();

        System.out.print("Write the student's third note: ");
        int note3 = scan.nextInt();

        float avarege = (note1 + note2 + note3) / 3;

        System.out.println("The student " + nameStudent + " has an avarege of : " + avarege + ".");

        scan.close();
    }
}
