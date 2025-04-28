import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, maior, menor;
        int contador = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o 1º número inteiro:");
        numero = in.nextInt();maior = numero;
        menor = numero;

        while (contador < 5) {
            System.out.println("Digite o " + (contador + 1) + "º número inteiro:");
            numero = in.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            contador++;
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
    }
}
