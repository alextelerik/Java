package eu.oronov;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // 3
        int num = 1;

        for (int i = 0; i <= n; i++) { // от 0 до 3
            System.out.println(num);
            num = num * 2;
        }

    }
}
