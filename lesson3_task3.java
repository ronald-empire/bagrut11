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
