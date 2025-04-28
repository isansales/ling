import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km_h, m_s;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em Km/h: ");
        km_h = in.nextDouble();

        m_s = km_h / 3.6;
        System.out.println("A velocidade em m/s é: " + m_s);
    }
}