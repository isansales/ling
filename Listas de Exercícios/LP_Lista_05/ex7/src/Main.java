public class Main {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4},
        };

        int longestRow = 0;
        int longestColumn = 0;

        for (int row=0; row<matrix.length; row++) {
            int sumRow = 0;
            int sumColumn = 0;

            for (int column=0; column<matrix[0].length; column++) { //só funciona se for matriz quadrada
                sumRow += matrix[row][column];
                sumColumn += matrix[column][row];
            }

            if (sumRow>longestRow)
                longestRow = sumRow;
            if (sumColumn>longestColumn)
                longestColumn = sumColumn;
        }

        System.out.println("Longest row sum: " + longestRow);
        System.out.println("Longest column sum: " + longestColumn);
    }
}