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

        int resultado = buscaBinaria(array, target);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }
    }

    // Função de busca binária (iterativa)
    public static int buscaBinaria(int[] array, int target) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == target) {
                return meio; // Elemento encontrado
            } else if (array[meio] < target) {
                esquerda = meio + 1; // Busca na metade direita
            } else {
                direita = meio - 1; // Busca na metade esquerda
            }
        }

        return -1; // Elemento não encontrado
    }
}
