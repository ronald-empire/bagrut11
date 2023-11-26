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
