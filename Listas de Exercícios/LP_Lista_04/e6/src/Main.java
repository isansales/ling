import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        num2 = in.nextInt();

        System.out.println("Números naturais entre " + num1 + " e " + num2 + ":");

        if (num1 < num2) {
            num1++; // começa depois do primeiro número
            while (num1 < num2) {
                if (num1 >= 0) {
                    System.out.println(num1);
                }
                num1++;
            }
        } else {
            num2++; // começa depois do segundo número
            while (num2 < num1) {
                if (num2 >= 0) {
                    System.out.println(num2);
                }
                num2++;
            }
        }
    }
}
