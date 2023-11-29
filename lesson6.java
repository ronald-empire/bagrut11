// RONALD GITLIN

/// task 1 - average 5 grades
import java.util.Scanner;
public class Lesson6Task1 {
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

/// task 2 - break on 'enter'
import java.util.Scanner;
public class Lesson6Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordc = 0;
        String input = "";
        while (!input.equals("enter")) {
            System.out.print("enter any word or 'enter' to finish: ");
            input = scanner.nextLine();
            wordc++;
        }
        System.out.print(wordc);
    }
}

/// task 3 - is the card number correct
import java.util.Scanner;
public class Lesson6Task3 {
    //// main function is for testing...
    public static void main(String[] args) {
        int correct = 4367;
        checkCard(correct);
    }
    static void checkCard(int cardnum) {
        Scanner scanner = new Scanner(System.in);
        int input, count = 0;
        do {
            System.out.print("enter card number: ");
            input = scanner.nextInt();
            count++;
        } while(input != cardnum && count < 3);
        if (count <= 3){
            System.out.print("How much money? ");
        }
        else if (count == 3 && input != cardnum) {
            System.out.print("Error");
        }
    }
}

/// task 4 - check if string is palindrome
class Lesson6Task4 {
    public static void main(String[] args) {
        //// main function is for testing
        String str = "test put anything here";
        checkPal(str);
    }
    static void checkPal(String input) {
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        // Checking if both the strings are equal
        if (input.equals(rev)) {
            System.out.print("input is a palindrome");
        }
        if (!input.equals(rev)) {
            System.out.print('"'+input+'"'+" is NOT a palindrome");
        }
    }
}
