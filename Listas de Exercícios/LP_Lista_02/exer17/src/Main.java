import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double initialVelocity, acceleration, time, finalVelocity;

        System.out.println("Digite a velocidade inicial (m/s): ");
        Scanner in = new Scanner(System.in);
        initialVelocity = in.nextDouble();

        System.out.println("Digite a aceleração (m/s²): ");
        acceleration = in.nextDouble();

        System.out.println("Digite o tempo de percurso (s): ");
        time = in.nextDouble();

        finalVelocity = initialVelocity + (acceleration * time);
        System.out.println("A velocidade final é: " + finalVelocity + " m/s");
    }
}