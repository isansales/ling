import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter X: ");
        x = in.nextInt();

        do {
            System.out.println("Enter Y: ");
            y = in.nextInt();
        } while (y < 0);

        System.out.println(x + "^" + y + " = " + powerNumber(x, y));
    }

    // recursividade
    public static int powerNumber(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * powerNumber(x, y - 1);
    }
}
