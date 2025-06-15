import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.println("Array disponível:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Digite o número que deseja buscar:");
        int target = in.nextInt();

        int resultado = buscaBinaria(array, target, 0, array.length - 1);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }

        in.close();
    }

    // recursividade
    public static int buscaBinaria(int[] array, int target, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1;
        }

        int meio = esquerda + (direita - esquerda) / 2;

        if (array[meio] == target) {
            return meio;
        } else if (array[meio] < target) {
            return buscaBinaria(array, target, meio + 1, direita);
        } else {
            return buscaBinaria(array, target, esquerda, meio - 1);
        }
    }
}
