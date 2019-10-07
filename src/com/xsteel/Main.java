package com.xsteel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Enter your own paths*/
        String pathIn = "/Users/steel/Desktop/in.txt";
        String pathOut = "/Users/steel/Desktop/out.txt";
        /*Matrix Reader reads a matrix from in.txt file*/
        Matrix matrix = new Matrix(MatrixReader.readMatrix(pathIn));
        /**
          * Matrix Writer creates out.txt file
          * LinearEquation solves the matrix using Jordan-Gauss method
          * NB The matrix must have the solution; otherwise, the answer will be incorrect
          */
        MatrixWriter.writeMatrix(LinearEquation.solve(matrix), pathOut);
    }
}
