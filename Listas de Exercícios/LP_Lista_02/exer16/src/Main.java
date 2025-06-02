import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, height, volume;

        System.out.println("Digite o raio do cone: ");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();

        System.out.println("Digite a altura do cone: ");
        height = in.nextDouble();

        volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
        System.out.println("O volume do cone é: " + volume);
    }
}
