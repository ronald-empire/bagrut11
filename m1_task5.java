import java.util.Scanner;
public class task5_ronald {
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
