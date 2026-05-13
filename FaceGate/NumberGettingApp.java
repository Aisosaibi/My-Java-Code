import java.util.Random;
import java.util.Scanner;

public class NumberGettingApp{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int countGuesses = 0;
        int correctGuess = rand.nextInt(101);

        System.out.print("Guess the number: ");

        int guess = 0;
        boolean isGuessCorrect = false;

        String rating = null;

        while (scanner.nextInt() > 100 && scanner.nextInt() < 0 || !scanner.hasNextInt()){
            System.out.println("Invalid input.\n\nGuess again (1 -100): ");
            if (!scanner.hasNextInt()) scanner.next();
        }

        guess = scanner.nextInt();
        System.out.print(guess);

        if (guess == correctGuess){
            countGuesses++;
            System.out.printf("Correct guess: %d%nAttempts used: %d%nRating: %s%n", correctGuess, countGuesses, rating);     
        }

        while (countGuesses <= 5){

            while (scanner.nextInt() > 100 && scanner.nextInt() < 0 || !scanner.hasNextInt()){
                System.out.println("Invalid input.\n\nGuess again (1 -100): ");
                scanner.next();
            }

            if (isGuessCorrect){
                switch (countGuesses){
                    case 1: 
                        rating = "Legendary";
                        break;

                    case 2: 
                        rating = "Excellent";
                        break;

                    case 3: 
                    case 4: 
                        rating = "Good";
                        break;

                    case 5: 
                        rating = "Close!";
                    default: 
                        rating = "Better luck";
                }
            }

            if (scanner.nextInt() > correctGuess){
                countGuesses++;
                System.out.println("Your guess was higher.\n\nGuess again: ");
                guess = scanner.nextInt();
            }

            if (scanner.nextInt() < correctGuess){
                countGuesses++;
                System.out.println("Your guess was lower.\n\nGuess again: ");
                guess = scanner.nextInt();
            }

            if (scanner.nextInt() == correctGuess){
                isGuessCorrect = true;
                countGuesses++;
                break;
            }

        }

        System.out.printf("Correct guess: %d%nAttempts used: %d%nRating: %s%n", correctGuess, countGuesses, rating);
    }
}
