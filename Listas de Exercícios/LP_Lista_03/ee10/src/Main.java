import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numeros[1] = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        numeros[2] = scanner.nextInt();

        Arrays.sort(numeros);
        System.out.println("Ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}

