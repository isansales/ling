import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, height, area;

        System.out.println("Digite a base do triângulo: ");
        Scanner in = new Scanner(System.in);
        base = in.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        height = in.nextDouble();

        area = (base * height) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
}