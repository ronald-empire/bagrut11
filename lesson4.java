// RONALD GITLIN

/// task 1 - sort by alphabetical order
import java.util.Scanner;
public class task1_ronald {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first word: ");
        String name1 = scanner.nextLine();
        System.out.print("enter the second word: ");
        String name2 = scanner.nextLine();
        System.out.print("enter third word: ");
        String name3 = scanner.nextLine();
        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0) {
            if (name2.compareTo(name3) < 0) {
                System.out.println(name1 + ", " + name2 + ", " + name3);
            } 
            else {
                System.out.println(name1 + ", " + name3 + ", " + name2);
            }
        } 
        else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0) {
            if (name1.compareTo(name3) < 0) {
                System.out.println(name2 + ", " + name1 + ", " + name3);
            } 
            else {
                System.out.println(name2 + ", " + name3 + ", " + name1);
            }
        } 
        else {
            if (name1.compareTo(name2) < 0) {
                System.out.println(name3 + ", " + name1 + ", " + name2);
            } 
            else {
                System.out.println(name3 + ", " + name2 + ", " + name1);
            }
        }
    }
}

/// task 2 - count letters
import java.util.Scanner;
public class Lesson4_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the sentence: ");
        String sentence = scanner.nextLine();
        int lettercount = sentence.length();
        System.out.println("The Sentence has " + lettercount + " Letters");
        System.out.println("or " + (lettercount-4) + " without spaces");
    }
}

/// task 3 - check for palindrome
import java.util.Scanner;
public class Lesson4_Task3 {
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

/// task 4 - flip string
import java.util.Scanner;
public class Lesson4_Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string of 3 characters: ");
        String str = scanner.nextLine();
        System.out.println(str.charAt(2) + "" + str.charAt(1) + "" + str.charAt(0));
    }
}

/// task 5 - replace vowels
import java.util.Scanner;
public class Lesson4_Task5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter a string of 4 characters: ");
    String str = scanner.nextLine();
    char l1 = str.charAt(0);
    char l2 = str.charAt(1);
    char l3 = str.charAt(2);
    char l4 = str.charAt(3);
    if (l1 == 'a' || l1 == 'e' || l1 == 'o' || l1 == 'u' || l1 == 'i') {
      l1 = '*';
    }
    if (l2 == 'a' || l2 == 'e' || l2 == 'o' || l2 == 'u' || l2 == 'i') {
      l2 = '*';
    }
    if (l3 == 'a' || l3 == 'e' || l3 == 'o' || l3 == 'u' || l3 == 'i') {
      l3 = '*';
    }
    if (l4 == 'a' || l4 == 'e' || l4 == 'o' || l4 == 'u' || l4 == 'i') {
      l4 = '*';
    }
    System.out.println("" + l1 + l2 + l3 + l4);
  }
}

/// task 6 - digits, divisibility checker
import java.util.Random;
public class Lesson4_Task6 {
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

