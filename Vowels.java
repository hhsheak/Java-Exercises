package exercises;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scan.nextLine();
        word = word.toUpperCase();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
