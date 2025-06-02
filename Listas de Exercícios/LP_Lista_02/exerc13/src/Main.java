import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double radius, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        radius = in.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        System.out.println("A área do círculo é: " + area);
    }
}