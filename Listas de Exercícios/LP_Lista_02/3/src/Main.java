import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        numero = in.nextDouble();

        result = numero / 5;
        System.out.println("A quinta parte de " + numero + " é " + result);
    }
}