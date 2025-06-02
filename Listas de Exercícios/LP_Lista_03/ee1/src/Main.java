import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, sqrt;

        Scanner in = new Scanner(System.in);
        n = in.nextDouble();

        if (n >= 0) {
            sqrt = Math.sqrt(n);
            System.out.println("a raiz quadrada de " + "é " + sqrt);
        } else {
            System.out.println("Não existe raiz quadrada de valores negativos");
        }
    }
}