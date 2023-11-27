// RONALD GITLIN 

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
            System.out.println("these numbers are equal");
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
class Lesson3_Task4 {
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

/// task 5 - smallest number
import java.util.Scanner;
class Lesson3_Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number: ");
        int num1 = scanner.nextInt();
        System.out.println("second number: ");
        int num2 = scanner.nextInt();
        System.out.println("third number: ");
        int num3 = scanner.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number is: "+num1);
        }
        else if (num2 < num3) {
            System.out.println("The smallest number is: "+num2);
        }
        else {
            System.out.println(" The smallest number is: "+num3);
        }
    }
    
/// task 6 - distance between 2 points on 2D graph
import java.util.Scanner;
class Lesson3_Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x1: ");
        int x1 = scanner.nextInt();
        System.out.println("enter y1: ");
        int y1 = scanner.nextInt();
        System.out.println("enter x2: ");
        int x2 = scanner.nextInt();
        System.out.println("enter y2: ");
        int y2 = scanner.nextInt();
        
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("distance between set points is "+distance);
    }
}

/// task 7 - sequences
import java.util.Scanner;
class Lesson3_Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the initial of the sequence: ");
        int a1 = scanner.nextInt();
        System.out.println("enter the step of the sequence: ");
        int d = scanner.nextInt();
        int a5 = 4 * d + a1;
        int a10 = 9 * d + a1;
        System.out.println("fifth number of sequence: "+a5);
        System.out.println("tenth number of sequence: "+a10);
    }
}

/// task 8 - ice cream shop
import java.util.Scanner;
class Lesson3_Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many ice creams? ");
        int icenum = scanner.nextInt();
        
        int boxes = icenum / 54;
        int stacks = (icenum % 54) / 10;
        int single = (icenum % 54) % 10;

        float total = (boxes * 5000) + (stacks * 1000) + (single * 120);
        
        System.out.println(total/100);
    }
}

/// task 9 - about
import java.util.Scanner;
class Lesson3_Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your name: ");
        String name = scanner.nextLine();
        System.out.println("your school: ");
        String school = scanner.nextLine();
        System.out.println("number of subjects: ");
        String subjn = scanner.nextLine();
        System.out.println("My name is "+name+", My school is "+school+", The number of subjects I study is "+subjn+".");
    }
}

/// task 10 - three digit sum
import java.util.Scanner;
class Lesson3_Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a *three* digit number: ");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("this number isn't a 3 digit.");
        }
        else {
            int d1 = number / 100;
            int d2 = number / 10 % 10;
            int d3 = number % 10;
            System.out.println("sum of digits is: ");
            System.out.print(d1 + d2 + d3);
        }
    }
}
