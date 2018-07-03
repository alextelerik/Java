package eu.oronov;

import java.util.Scanner;

public class NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Еnter a number in the range [1...100]: ");
        double n = Double.parseDouble(scanner.nextLine());

        while(n<1 || n>100)
        {
            System.out.println("Invalid number!");
            n = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("The number is: ");
        System.out.println(n);

    }
}
