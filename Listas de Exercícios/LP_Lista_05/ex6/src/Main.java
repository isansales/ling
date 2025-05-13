public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int aux;

        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = vetor[i];
            vetor[i] = aux;

        }
        for (int valor : vetor)
            System.out.print(valor + ", ");
    }
}
