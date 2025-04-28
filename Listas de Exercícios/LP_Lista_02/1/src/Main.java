import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number, result;

        Scanner in = new Scanner(System.in); //Configura o Scanner

        System.out.println("Digite um numero: ");
        number = in.nextInt();

        result = number * 2;
        System.out.println("O dobro de " + number + " é " + result);
    }
}