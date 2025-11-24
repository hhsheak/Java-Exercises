package exercises;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scan.nextInt();
        System.out.print("Input another number: ");
        int x = scan.nextInt();

        for (int i = 1; i < x+1; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        scan.close();
    }
}


