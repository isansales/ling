import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, primeiro = 0, segundo = 1, proximo, contador = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantos termos da sequência de Fibonacci deseja ver:");
        n = in.nextInt();

        System.out.println("Sequência de Fibonacci:");

        if (n >= 1) {
            System.out.print(primeiro + " ");
        }
        if (n >= 2) {
            System.out.print(segundo + " ");
        }

        contador = 2;

        while (contador < n) {
            proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
            contador++;
        }
    }
}

