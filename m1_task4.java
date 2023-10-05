import java.util.Scanner;
public class task4_ronald {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string of 3 characters: ");
        String str = scanner.nextLine();
        System.out.println(str.charAt(2) + "" + str.charAt(1) + "" + str.charAt(0));
    }
}
