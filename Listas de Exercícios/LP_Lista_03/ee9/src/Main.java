import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado A: ");
        int a = scanner.nextInt();
        System.out.print("Lado B: ");
        int b = scanner.nextInt();
        System.out.print("Lado C: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}
