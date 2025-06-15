import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] vector = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i< vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("Ache a posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Posição não encontrada");
        }
    }

}