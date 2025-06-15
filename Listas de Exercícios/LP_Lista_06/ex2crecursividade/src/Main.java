import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Digite um número inteiro maior que zero:");
            n = in.nextInt();
        } while (n <= 0);

        System.out.println(n + "! = " + fatorial(n));
    }

    // recursividade
    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
