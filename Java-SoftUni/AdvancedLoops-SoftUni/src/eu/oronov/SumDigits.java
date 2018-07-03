package eu.oronov;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int n1 = n;

        do
        {
            sum = sum + (n1 % 10);
            n1 = n1 / 10;
        }
        while (n1>0);

        System.out.println(sum);



    }
}
