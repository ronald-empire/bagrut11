import java.util.Scanner;
public class task2_ronald {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the sentence: ");
        String sentence = scanner.nextLine();
        int lettercount = sentence.length();
        System.out.println("The Sentence has " + lettercount + " Letters :)");
    }
}
