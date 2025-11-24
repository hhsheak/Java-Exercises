package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input validation
        int n = 0; 
        boolean isInputValid = false;
        while (!isInputValid) {
            try {
                System.out.print("Input a whole number: ");
                n = scan.nextInt();
                isInputValid = true;
            } catch (InputMismatchException inp) {
                scan.nextLine();
            }
        }

        if (n == 1) {
            System.out.println("1 is neither prime nor composite.");
        }

        if (n == 2) { // Because i starts from 2, I included a special case to deal with n = 2
              System.out.println(n + " is prime."); 
        }

        for (int i = 2; i < n; i++) {  // Because x % 1 == 0, it becomes difficult to account for it so I decided to start from i = 2 instead
            int x = n % i;
            if (x == 0) { 
                System.out.println(n + " is non-prime.");
                break; // Once a number has a divisor, it is automatically non-prime and the rest of the numbers can be ignored
            } else if (x != 0 && i < n-1) { // Checks if all numbers until itself are divisors
                continue;
            } else {
                System.out.println(n + " is prime.");
            }
        }
     
        scan.close();
    }
}
