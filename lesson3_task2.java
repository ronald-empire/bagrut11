import java.util.Scanner;
class Lesson3_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("enter a number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("first number is bigger");
        }
        if (num1 < num2) {
            System.out.println("second number is bigger");
        }
        if (num1 == num2) {
            System.out.println("nmubers are equal");
        }
    }
}
