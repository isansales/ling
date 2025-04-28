import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas da primeira matriz (A): ");
        int linhasA = sc.nextInt();
        System.out.print("Informe o número de colunas da primeira matriz (A): ");
        int colunasA = sc.nextInt();

        System.out.print("Informe o número de linhas da segunda matriz (B): ");
        int linhasB = sc.nextInt();
        System.out.print("Informe o número de colunas da segunda matriz (B): ");
        int colunasB = sc.nextInt();
        if (colunasA != linhasB) {
            System.out.println("Multiplicação de matrizes impossível. O número de colunas de A deve ser igual ao número de linhas de B.");
            return;
        }
        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] C = new int[linhasA][colunasB];
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("Elemento A[" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("Elemento B[" + (i + 1) + "][" + (j + 1) + "]: ");
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Matriz Produto (C = A x B):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
