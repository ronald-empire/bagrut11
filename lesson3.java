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
