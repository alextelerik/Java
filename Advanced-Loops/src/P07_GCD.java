import java.util.Scanner;

public class P07_GCD{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            int m = Integer.parseInt(scanner.nextLine());

            int smaller = Math.min(n, m);
            int greater = Math.max(n, m);
            int difference = greater - smaller;
            int iterator = Math.min(difference, smaller);
            int oldDivisor = 1;
            int newDivisor = 1;

            for (int i = 1; i <= iterator; i++)
            {
                if (difference % i == 0 && smaller % i == 0)
                {
                    newDivisor = i;
                }
                if (newDivisor > oldDivisor)
                {
                    oldDivisor = newDivisor;
                }

            }

            System.out.println(n == m ? n : oldDivisor);

        }
}
