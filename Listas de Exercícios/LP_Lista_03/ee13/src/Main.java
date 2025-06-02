import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:\n1. Círculo\n2. Triângulo Retângulo\n3. Retângulo");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.print("Informe o raio: ");
                double raio = scanner.nextDouble();
                System.out.printf("Área = %.2f\n", Math.PI * raio * raio);
                System.out.printf("Perímetro = %.2f\n", 2 * Math.PI * raio);
            }
            case 2 -> {
                System.out.print("Base: ");
                double base = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                double hipotenusa = Math.sqrt(base * base + altura * altura);
                System.out.printf("Área = %.2f\n", (base * altura) / 2);
                System.out.printf("Perímetro = %.2f\n", base + altura + hipotenusa);
            }
            case 3 -> {
                System.out.print("Base: ");
                double base = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                System.out.printf("Área = %.2f\n", base * altura);
                System.out.printf("Perímetro = %.2f\n", 2 * (base + altura));
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
