import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1, x2, a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira raiz (x1): ");
        x1 = in.nextDouble();
        System.out.println("Digite a segunda raiz (x2): ");
        x2 = in.nextDouble();

        a = 1;
        b = -(x1 + x2);
        c = x1 * x2;

        System.out.println("A equação do segundo grau é: ");
        System.out.println(a + "x^2 + (" + b + ")x + (" + c + ") = 0");
    }
}