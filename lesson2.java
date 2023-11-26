/// task 1 -
import java.util.Random;
public class Lesson2_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        System.out.println(randomNumber);
        if (randomNumber < 10) {
            System.out.println("Number is single digit");
        } 
        else {
            System.out.println("Number is double digit");
        }
        if (randomNumber % 2 == 0){
            System.out.println("Number is divisible by two");
        }
        else {
            System.out.println("Number does not divide by two");
        }
        if (randomNumber % 3 == 0){
            System.out.println("Number is divisible by three");
        }
        else {
            System.out.println("Number does not divide by three");
        }
    }
}

/// task 2 -
import java.util.Scanner;
public class Lesson2_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the sentence: ");
        String sentence = scanner.nextLine();
        int lettercount = sentence.length();
        System.out.println("The Sentence has " + lettercount + " Letters :)");
    }
}

/// task 3 -
import java.util.Scanner;
public class Lesson2_Task3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter a string of 3 characters: ");
    String str = scanner.nextLine();
    if (str.charAt(0) == str.charAt(2)) {
      System.out.println("it's a palindrome");
    } else {
      System.out.println("it's NOT a palindrome");
    }
  }
}

/// task 4 -

/// task 5 -

/// task 6 -

