import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int limit = 10; 
        int score = 0; 

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME...!");
        System.out.println("I'm thinking of a number between 1 and 100");

        boolean playAgain = true;

        while (playAgain) {
            int target = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correct = false;

            System.out.println("Try to guess it...!");
            System.out.println("You have " + limit + " attempts.....!!!");

            while (attempts < limit) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == target) {
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                    score++;
                    correct = true;
                    break;
                } else if (guess < target) {
                    System.out.println("Guess a bit higher.");
                } else {
                    System.out.println("A bit lower.");
                }
            }

            if (correct==false) {
                System.out.println("Ran out of attempts, correct answer was... " + target);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes") || playChoice.equals("y");

            System.out.println();
        }

        System.out.println("Game over! Your total score is: " + score);
        scanner.close();
    }
}
