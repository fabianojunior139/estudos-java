package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_33 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write your professor's level: ");
        int levelProfessor = scan.nextInt();

        System.out.print("How many hours did you work this month?: ");
        int classHours = scan.nextInt();

        float salaryProfessor = 0;

        switch (levelProfessor) {
            case 1:
                salaryProfessor = classHours * 12;
                break;

            case 2:
                salaryProfessor = classHours * 17;
                break;

            case 3:
                salaryProfessor = classHours * 25;
                break;

            default:
                System.out.println("Invalid parameters, try again!");
                break;
        }

        if (salaryProfessor != 0) {
            System.out.println("Teacher's salary for the month will be: " + salaryProfessor);
        }

        System.out.println("");
        scan.close();
    }
}
