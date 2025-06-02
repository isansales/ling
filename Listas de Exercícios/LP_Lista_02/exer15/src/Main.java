import java.util.Scanner;
public class   Main {
    public static void main(String[] args) {
        double radius, height, volume;

        System.out.println("Digite o raio do cilindro: ");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();

        System.out.println("Digite a altura do cilindro: ");
        height = in.nextDouble();

        volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("O volume do cilindro é: " + volume);
    }
}
