package eu.oronov;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        int num = 1;

        while (num <= n)
        {
            for (int j = 0; j < counter; j++)
            {
                System.out.print(num + " ");
                num++;
                if (num > n)
                {
                    return;
                }
            }
            counter++;
            System.out.println();
        }

    }
}
