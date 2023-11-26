/// task 1 - is number negative/positive/zero
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
            System.out.println("numbers are equal");
        }
    }
}
/// task 3 - fastest bicycle
import java.util.Scanner;
class Lesson3_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first bike letter: ");
        String bc1 = scanner.nextLine();
        System.out.println("second bike letter: ");
        String bc2 = scanner.nextLine();
        System.out.println("first bike speed: ");
        int v1 = scanner.nextInt();
        System.out.println("second bike speed: ");
        int v2 = scanner.nextInt();
        System.out.println("first bike distance: ");
        int d1 = scanner.nextInt();
        System.out.println("second bike distance: ");
        int d2 = scanner.nextInt();
        int time1 = d1/v1;
        int time2 = d2/v2;
        if (time1 > time2) {
            System.out.println(bc2);
        }
        if (time1 < time2) {
            System.out.println(bc1);
        }
        if (time1 == time2) {
            System.out.println("same time");
        }
    }
/// task 4 - calculate the average grade
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
/// task 5 - 
