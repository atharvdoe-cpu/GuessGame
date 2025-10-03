import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(50) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 50:");

        while (guess != number) {
            guess = sc.nextInt();
            if (guess < number) System.out.println("Too low, try again:");
            else if (guess > number) System.out.println("Too high, try again:");
            else System.out.println("Congratulations! You guessed it!");
        }
    }
}