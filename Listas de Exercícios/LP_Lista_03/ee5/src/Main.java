import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;
        if (media >= 8.5) {
            conceito = "A";
        } else if (media >= 7) {
            conceito = "B";
        } else if (media >= 5) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Conceito: " + conceito);

    }
}
