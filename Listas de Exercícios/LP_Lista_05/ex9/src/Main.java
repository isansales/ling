public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 8, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}};

        for (int i=0; i<matrix.length; i++) {
            System.out.println(matrix[i][4-i]);
        }
    }
}