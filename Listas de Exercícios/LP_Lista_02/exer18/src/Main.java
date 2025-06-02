import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, solution;

        System.out.println("Digite o coeficiente a: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        if (a == 0) {
            System.out.println("Esta não é uma equação válida.");
        } else {
            System.out.println("Digite o coeficiente b: ");
            b = in.nextDouble();

            solution = -b / a;
            System.out.println("A solução da equação " + a + "x + " + b + " = 0 é: x = " + solution);
        }
    }
}