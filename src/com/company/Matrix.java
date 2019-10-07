package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    public int row;
    public int col;
    public int[][] matrix;

    public Matrix(int row, int column) {
        this.row = row;
        this.col = column;
        this.matrix = new int[row][column];
    }

    public int numCols() {
        return this.matrix[0].length;

    }

    public int numRows() {
        return this.matrix.length;

    }

    public void set(int row, int column, int value) {
        if (row < numRows()) {
            if (column < numCols()) {
                matrix[row][column] = value;
            }
        } else {
            System.out.println("index is out of range.");
        }
    }

    public int sum() {
        int res = 0;
        for (int i = 0; i < numRows(); i++){
            for (int j = 0; j < numCols(); j++){
                res += matrix[i][j];
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = " ";
        res = "row " + row + " col " + col;
        for (int[] n : matrix){
            res  = res + Arrays.toString(n);
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return row == matrix1.row &&
                col == matrix1.col &&
                Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(row, col);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }

    public static void main (String[] args) {
        Matrix matrix1 = new Matrix(2,3);
        Matrix matrix2 = new Matrix(1,2);
        matrix1.set(1,2,2);

        System.out.println(matrix1.equals(matrix2));



    }



}
