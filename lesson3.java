/// task 1 -
import java.util.Scanner;
class Lesson3_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int thenumber = scanner.nextInt();
        if (thenumber < 0) {
            System.out.println("number is *negative*");
        }
        if (thenumber > 0) {
            System.out.println("number is *positive*");
        }
        if (thenumber == 0) {
            System.out.println("number is zero");
        }
    }
}
/// task 2 - which number is biggest
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
/// task 3 - calculate the average grade
import java.util.Scanner;
class Lesson3_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first grade: ");
        int gr1 = scanner.nextInt();
        System.out.println("second grade: ");
        int gr2 = scanner.nextInt();
        System.out.println("third grade: ");
        int gr3 = scanner.nextInt();
        int sum = gr1 + gr2 + gr3;
        float average = sum/3;
        System.out.println(average);
    }
}
