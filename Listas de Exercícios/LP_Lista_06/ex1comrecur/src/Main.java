import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Digite um numero maior que zero: ");
            n = in.nextInt();
        } while (n <= 0);

        System.out.println("A soma dos antecessores de " + n + " é " + somarAntecessores(n));
    }

    public static int somarAntecessores(int n) {
        if (n == 1)
            return 1;
        return n + somarAntecessores(n - 1);
    }
}
