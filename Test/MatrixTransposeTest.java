import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTransposeTest {

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

    @Test
    void transposeMatrix1() {
        int[][] result1 = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[i].length; j++) {
                assertEquals(result1[i][j], MatrixTranspose.transposeMatrix(example1)[i][j]);
            }
        }
    }

    @Test
    void transposeMatrix2() {
        int[][] result2 = {
                {5, 3},
                {9, 2},
                {3, 1},
                {7, 8}
        };
        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                assertEquals(result2[i][j], MatrixTranspose.transposeMatrix(example2)[i][j]);
            }
        }
    }

    @Test
    void transposeMatrix3() {
        int[][] result3 = {};
        for (int i = 0; i < result3.length; i++) {
            for (int j = 0; j < result3[i].length; j++) {
                assertEquals(result3[i][j], MatrixTranspose.transposeMatrix(example3)[i][j]);
            }
        }
    }
}