// RONALD GITLIN

/// task 1 - average 5 grades
import java.util.Scanner;
public class Lesson6Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountGrades = 5, sumGrades = 0;
        for (int index = 1; index <= amountGrades; index++) {
            System.out.print("Your grade: ");
            int grade = scanner.nextInt();
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

/// task 5 - dividers of number
public class Lesson6Task5 {
    public static void main(String[] args) {
        int input = -360;
        printDivisors(input);
    }
    static void printDivisors(int number) {
        System.out.print(number + " can be divided by: ");
        if (number < 0) {
            for (int i = 1; i <= number*-1; i++) {
                if (number % i == 0) {
                    System.out.print(i);
                    if (i != number*-1) {
                        System.out.print(", ");
                    }
                }
            }
        } 
        else {     
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i);
                    if (i != number) {
                        System.out.print(", ");
                    }
                }
            }
        }
    }
}

/// task 6 - 
public class Lesson6Task6 {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++) {
            for (int j = 1; j<=10; j++) {
                System.out.print("["+i*j+"] ");
            }
        }
    }
}

/// task 7 - 
import java.util.Scanner;
public class Lesson6Task7 {
    public static void main(String[] args) {
        int i, max = 0;
        Scanner scanner = new Scanner(System.in);
        for (i = 1; i <= 7; i++) {
            System.out.print("enter grade " + i + ": ");
            int grade = scanner.nextInt();
            if (grade > max) {
                max = grade;
            }
            else {
                max = max;
            }
        }
        System.out.println("your maximum grade is: " + max);
    }
}

/// task 8 - 


/// task 9 - 


/// task 10 - 
