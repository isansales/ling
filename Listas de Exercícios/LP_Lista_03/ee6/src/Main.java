import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu do Caixa Eletrônico");
        System.out.println("5 - Saldo");
        System.out.println("6 - Saque");
        System.out.println("7 - Depósito");
        System.out.println("8 - Transferência");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção (5 a 9): ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 5:
                System.out.println("Opção escolhida: Saldo");
                break;
            case 6:
                System.out.println("Opção escolhida: Saque");
                break;
            case 7:
                System.out.println("Opção escolhida: Depósito");
                break;
            case 8:
                System.out.println("Opção escolhida: Transferência");
                break;
            case 9:
                System.out.println("Opção escolhida: Sair");
                break;
            default:
                System.out.println("Opção inválida! Por favor, escolha um número entre 5 e 9.");
                break;
        }
    }
}
