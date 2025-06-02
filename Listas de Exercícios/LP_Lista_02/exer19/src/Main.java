import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, root1, root2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente a: ");
        a = in.nextDouble();
        System.out.println("Digite o coeficiente b: ");
        b = in.nextDouble();
        System.out.println("Digite o coeficiente c: ");
        c = in.nextDouble();

        // Calcula o discriminante (delta)
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes da equação são: ");
            System.out.println("Raiz 1: " + root1);
            System.out.println("Raiz 2: " + root2);
        }
    }
}