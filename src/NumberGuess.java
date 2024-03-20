import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;  // Minimum number in the range
        int maxRange = 100; // Maximum number in the range
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange; // Generating random number

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        int guess;
        int attempts = 0;


        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
            else{
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly in " + attempts + " attempts!");
            }
        } while (attempts<4);
        if (attempts == 4) {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
        }

        //System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly in " + attempts + " attempts!");


    }
}

