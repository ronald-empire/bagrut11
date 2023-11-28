import java.util.Scanner;
class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number [a]: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter number [b]: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter number [c]: ");
        int n3 = scanner.nextInt();
        
        namePrint(name);
        divideBy(n1);
        System.out.println("Task 3 result [a*b]: "+multiplyTwo(n1, n2));
        addThree(n1, n2, n3);
        calcCircle(n2);
        System.out.println("Task 6 result [a, b]: "+triCalc(n1, n2));
        flipChars('f', 'i', 'x');
        System.out.println("Task 8 result [a is initial, b is difference, c is wanted index]: "+sequenceCalc(n1, n2, n3));
    }
    static void namePrint(String name) {
        System.out.println("Hello, "+name);
    }
    static void divideBy(int a) {
        float result = a/5;
        System.out.println("Task 2 result [a/5]: "+result);
    }
    static int multiplyTwo(int a, int b) {
        int result = a*b;
        return result;
    }
    static float addThree(int a, int b, int c) {
        int result = a+b+c;
        float average = result/3;
        System.out.println("Task 4 result [a+b+c]: "+result+" | average: "+average);
        return average;
    }
    static void calcCircle(int rad) {
        double diam = 2*rad;
        double circ = Math.PI * diam;
        double area = Math.PI * rad * rad;
        System.out.println("Task 5 result [b=radius] circumference: "+circ+" | area: "+area);
    }
    static double triCalc(int a, int b) {
        double hypotenuse = Math.sqrt((a*a)+(b*b));
        return hypotenuse;
    }
    static void flipChars(char alpha, char beta, char gamma) {
        System.out.println("Task 7 result [f, i, x]: "+gamma + beta + alpha);
    }
    static int sequenceCalc(int initial, int diff, int index) {
        int prev_index = index - 1;
        int num_index = prev_index * diff + initial;
        return num_index;
    }
}
