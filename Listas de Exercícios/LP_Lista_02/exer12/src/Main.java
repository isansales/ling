import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;

        System.out.println("Digite a nota N1: ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextDouble();

        System.out.println("Digite a nota N2: ");
        n2 = in.nextDouble();

        media = (n1 * 1 + n2 * 2) / 3;
        if (media >= 0 && media <= 10) {
            System.out.println("A média ponderada é: " + media);
        } else {
            System.out.println("Notas inválidas. A média deve estar entre 0 e 10.");
        }
    }
}