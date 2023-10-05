import java.util.Random;
public class task6_ronald {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        System.out.println(randomNumber);
        if (randomNumber < 10) {
            System.out.println("Number is single digit");
        } 
        else {
            System.out.println("Number is double digit");
        }
        if (randomNumber % 2 == 0){
            System.out.println("Number is divisible by two");
        }
        else {
            System.out.println("Number does not divide by two");
        }
        if (randomNumber % 3 == 0){
            System.out.println("Number is divisible by three");
        }
        else {
            System.out.println("Number does not divide by three");
        }
    }
}
