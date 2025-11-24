package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuesser {    
    static Scanner scan = new Scanner(System.in);
    static int random = (int) (Math.random()*101);
    static int totalGuesses = 0;
    static int guess = 0;
    public static void main(String[] args) {
        System.out.println("You have 10 tries to guess a number between 1 and 100! ");
        while (totalGuesses < 10) {
            checkGuess(getGuess());
            totalGuesses ++;
        }
        System.out.printf("You failed! The correct answer was %d!", random);
        System.exit(0);
    }

    public static int getGuess() {
        try {
            return guess = scan.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Enter an integer!");
            System.exit(0);
        }
         return 0;
    }

    public static void checkGuess (int guess) {
        if (guess == random) {
            System.out.println("Correct! Number of attempts: " + (totalGuesses + 1));
            System.exit(0);
        } else if (guess > random) {
            System.out.println("Too high! Number of attempts: " + (totalGuesses +1 ));
        } else {
            System.out.println("Too low! Number of attempts: " + (totalGuesses +1 ));
        }
    }
}
