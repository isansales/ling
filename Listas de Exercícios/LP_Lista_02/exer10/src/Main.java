import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double miles, km;

        System.out.println("Digite uma distância em milhas: ");

        Scanner in = new Scanner(System.in);
        miles = in.nextDouble();

        km = miles * 1.6;
        System.out.println(miles + " milhas equivale a " + km + " km.");
    }
}