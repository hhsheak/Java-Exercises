package exercises;

import java.util.Scanner;

public class RockPaperScissors {
    public static int count = 0;
    static int humanScore = 0;
    static int computerScore = 0;
    
    public static String computerChoice;
    public static String getComputerChoice() {
        int generated = (int)(Math.random() * 3);
        if (generated == 0) {
            return computerChoice = "ROCK";
        } else if (generated == 1) {
            return computerChoice = "PAPER";
        } else {
            return computerChoice = "SCISSORS";
        }
    }    
    
    public static String humanChoice;
    public static String getHumanChoice(String choice) {
        return humanChoice = choice.toUpperCase();
    }
    
    public static void playRound (String humanChoice, String computerChoice) {
        System.out.println("Your choice: " + humanChoice + ", Computer's choice: " + computerChoice);
        if (humanChoice.equals(computerChoice)) {
            System.out.println("Tie!");
        } else if (humanChoice.equals("ROCK") && computerChoice.equals("PAPER")) {
            computerScore ++;
            System.out.println("You lose!");
        } else if (humanChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) {
            humanScore ++;
            System.out.println("You win!");
        } else if (humanChoice.equals("PAPER") && computerChoice.equals("SCISSORS")) {
            computerScore ++;
            System.out.println("You lose!");
        } else if (humanChoice.equals("PAPER") && computerChoice.equals("ROCK")) {
            humanScore ++;
            System.out.println("You win!");
        } else if (humanChoice.equals("SCISSORS") && computerChoice.equals("ROCK")) {
            computerScore ++;
            System.out.println("You lose!");
        } else if (humanChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) {
            humanScore ++;
            System.out.println("You win!");
        } 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while  (count < 5) {
            getComputerChoice();
            // System.out.println(computerChoice);
            System.out.print("Rock! Paper! Scissors! ");
            getHumanChoice(scan.nextLine());
            System.out.println(" ");
            playRound(humanChoice, computerChoice);
            System.out.println("Your score: " + humanScore + ", Computer's Score: " + computerScore);
            System.out.println(" ");
            count ++;
        }

        if (humanScore > computerScore) {
            System.out.println("You win!");
        } else if (computerScore > humanScore) {
            System.out.println("You lose!");
        } else {
            System.out.println("Tie!");
        }
        scan.close();
    }
}
