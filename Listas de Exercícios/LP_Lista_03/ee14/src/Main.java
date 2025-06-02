import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        double valor = scanner.nextDouble();

        System.out.println("Menu:\n1. Débito\n2. Pix\n3. Crédito");
        System.out.print("Escolha a forma de pagamento: ");
        int forma = scanner.nextInt();

        switch (forma) {
            case 1 -> System.out.printf("Valor final: R$ %.2f\n", valor * 0.95);
            case 2 -> System.out.printf("Valor final: R$ %.2f\n", valor * 0.90);
            case 3 -> {
                System.out.print("Número de parcelas (até 10x): ");
                int parcelas = scanner.nextInt();
                if (parcelas <= 4) {
                    System.out.printf("Valor final: R$ %.2f\n", valor * 1.02);
                } else if (parcelas <= 10) {
                    System.out.printf("Valor final: R$ %.2f\n", valor * 1.05);
                } else {
                    System.out.println("Número de parcelas inválido.");
                }
            }
            default -> System.out.println("Forma de pagamento inválida.");
        }
    }
}
