import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int computerNumber = random.nextInt(101) + 1;

        System.out.print("Guess a number (1-100): ");
        short playerGuess = Short.parseShort(scan.nextLine());

        int tries = 1;
        int playerLastHigherGuess = 100;
        int playerLastLowerGuess = 1;

        while(playerGuess != computerNumber) {
            if (playerGuess > computerNumber) {
                System.out.println("Wrong! Your number is higher");
            } else {
                System.out.println("Wrong! Your number is lower");
            }

            if (playerGuess > computerNumber) {
                playerLastHigherGuess = playerGuess;
                System.out.printf("Guess a number (%d-%d): ", playerLastLowerGuess, playerGuess);
            } else {
                playerLastLowerGuess = playerGuess;
                System.out.printf("Guess a number (%d-%d): ", playerGuess, playerLastHigherGuess);
            }

            playerGuess = Short.parseShort(scan.nextLine());
            tries++;
        }

        System.out.printf("You guessed it from try number %d", tries);

    }

}
