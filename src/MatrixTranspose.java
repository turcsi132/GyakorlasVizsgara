public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] example1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] example2 = {
                {5, 9, 3, 7},
                {3, 2, 1, 8}
        };

        int[][] example3 = {};

        System.out.println(transposeMatrix(example1));
        int [][] tempMatrix = transposeMatrix(example1);
//        System.out.println(transposeMatrix(example2));
//        System.out.println(transposeMatrix(example3));
        for (int i = 0; i < tempMatrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < tempMatrix[i].length; j++) {
                if (j == (tempMatrix[i].length - 1)){
                    System.out.print(tempMatrix[i][j]);
                }else {
                    System.out.print(tempMatrix[i][j] + ",");
                }

            }
            System.out.print("]\n");
        }

    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        if (matrix == null) {
            return matrix;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}

