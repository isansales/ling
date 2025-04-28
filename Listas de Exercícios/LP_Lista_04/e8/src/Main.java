import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, i = 2, contador = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        numero = in.nextInt();

        if (numero <= 1) {
            System.out.println("Número não é primo.");
        } else {
            while (i < numero) {
                if (numero % i == 0) {
                    contador++;
                }
                i++;
            }

            if (contador == 0) {
                System.out.println("O número " + numero + " é primo!");
            } else {
                System.out.println("O número " + numero + " não é primo!");
            }
        }
    }
}