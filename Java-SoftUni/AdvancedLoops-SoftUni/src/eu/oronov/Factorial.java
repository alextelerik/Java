package eu.oronov;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(fact(n));

    }

    public static int fact(int n) {
        int result;
        if (n == 0 || n == 1)
            return 1;

        result = fact(n - 1) * n;
        return result;
    }

}
