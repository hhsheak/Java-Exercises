package exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scan.nextLine();
        word = word.toLowerCase();
        String inverted = "";
        
        for (int i = word.length()-1; i >= 0; i--) {
            inverted += word.charAt(i);
        }
        
        if (word.equals(inverted)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        
    }
}
