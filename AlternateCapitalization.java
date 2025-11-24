package exercises;

import java.util.Scanner;

public class AlternateCapitalization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scan.nextLine();
        word = word.toLowerCase();
        String alt = "";
        String temp = "";

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                temp += word.charAt(i);
                temp = temp.toUpperCase();
                alt += temp;
                temp = "";
            } else {
                alt += word.charAt(i);
            }
        }

        System.out.println(alt);

        scan.close();
    }
}
