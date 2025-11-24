package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int first = 0;
        int second = 0;
        int third = 0;

        // Input validation
        boolean isInputValid = false;
        while (!isInputValid) {
            try {
                System.out.print("Input first number: ");
                first = scan.nextInt();
                scan.nextLine();
                System.out.print("Input second number: ");
                second = scan.nextInt();
                scan.nextLine();
                System.out.print("Input third number: ");
                third = scan.nextInt();
                scan.nextLine();
                isInputValid = true;
            } catch (InputMismatchException inp) {
                System.out.println("Input a number!\n");
                scan.nextLine();
            }
        }

        // Adds numbers together and finds the average
        sum = first + second + third;
        double average = sum / 3;
        System.out.println("Average is " + average);

        scan.close();
    }
}
