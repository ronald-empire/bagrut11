// RONALD GITLIN

// task 1 - average 5 grades
import java.util.Scanner;
public class Lesson5Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountGrades = 5, sumGrades = 0;
        for (int index = 1; index <= amountGrades; index++) {
            System.out.print("Your grade: ");
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades += grade;
        }
        double avg = (double) sumGrades / amountGrades;
        System.out.println("\nYour average is: " + avg);
    }
}

// task 2
