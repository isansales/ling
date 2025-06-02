import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double speed, result;

        System.out.println("Escreva a velocidade em m/s: ");

        Scanner in = new Scanner(System.in);
        speed = in.nextDouble();

        result = speed*3.6;
        System.out.println("A velocidade em km/h is: " + result);
    }
}