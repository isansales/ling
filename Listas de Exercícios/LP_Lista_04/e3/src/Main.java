import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("Números positivos divisíveis por 4 e menores que 200:");

        while (num < 200) {
            if (num > 0 && num % 4 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
