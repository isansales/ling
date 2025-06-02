import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double measure, result;

        System.out.println("Escreva a medida em milímetros: ");

        Scanner in = new Scanner(System.in);
        measure = in.nextDouble();

        result = measure / 25.4;
        System.out.println("A medida em polegadas é: " + result);
    }
}