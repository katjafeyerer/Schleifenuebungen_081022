public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5);

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y] + " |");
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        //code to be done

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }
}

