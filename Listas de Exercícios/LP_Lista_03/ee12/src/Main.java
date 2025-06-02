import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Menu:\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Resultado: " + (num1 + num2));
            case 2 -> System.out.println("Resultado: " + (num1 - num2));
            case 3 -> System.out.println("Resultado: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
