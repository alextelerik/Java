import java.util.Scanner;

public class P10_CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 2)
        {
            System.out.println("Not Prime");
            return;
        }

        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                prime = false;
                System.out.println("Not Prime");
                break;
            }
        }
        if (prime)
        {
            System.out.println("Prime");
        }

    }
}
