import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite um número inteiro: ");
        number = in.nextInt();

        result = number * number;
        System.out.println("O quadrado de " + number + " é " + result);
    }
}