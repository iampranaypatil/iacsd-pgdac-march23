package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Your numbers before Swap are: \n" + a + " " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Your numbers after Swap are: \n" + a + " " + b);

    }
}
