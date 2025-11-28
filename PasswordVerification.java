package exercises;

import java.util.Scanner;

public class PasswordVerification {

    public static void verify(String password) {
        
        // Checks length
        boolean checkLength = false;
        if (password.length() >= 8) {
            checkLength = true;
        }
        
        // Converts each character to ASCII code
        int[] passno = new int[password.length()];
        for (int i = 0; i < password.length(); i++) {
            int temp = 0;
            temp += password.charAt(i);
            passno[i] = temp;
            temp = 0;
        }
        
        // Checks for capital letter
        boolean gotCapitalLetter = false;
        for (int i : passno) {
            if (i >= 65 && i <= 90) {
                gotCapitalLetter = true;
                break;
            } else {
                continue;
            }
        }

        // Checks for small letter
        boolean gotSmallLetter = false;
        for (int i : passno) {
            if (i >= 97 && i <= 122) {
                gotSmallLetter = true;
                break;
            } else {
                continue;
            }
        }

        // Checks for special character
        boolean gotSpecialCharacter = false;
        for (int i : passno) {
            if (i >= 33 && i <= 64) {
                gotSpecialCharacter = true;
                break;
            } else {
                continue;
            }
        }
        
        if (checkLength == false) {
            System.out.println("Too short!");
        } else if (gotCapitalLetter == false) {
            System.out.println("No capital letter!");
        } else if (gotSmallLetter == false) {
            System.out.println("No small letter!");
        } else if (gotSpecialCharacter == false) {
            System.out.println("No special character!");
        } else {
            System.out.println("Password verified!");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a password: ");
        String password = scan.nextLine();   
        PasswordVerification.verify(password);  
        scan.close(); 
    }
}
