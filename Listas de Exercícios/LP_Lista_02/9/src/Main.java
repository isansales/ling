import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em quilômetros: ");
        km = in.nextDouble();

        miles = km / 1.6;
        System.out.println(km + " km equivale a " + miles + " miles");
    }
}