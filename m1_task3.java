import java.util.Scanner;
public class task3_ronald {
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
