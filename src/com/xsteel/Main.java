package com.xsteel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String pathIn = "/Users/steel/Desktop/in.txt";
        String pathOut = "/Users/steel/Desktop/out.txt";
        Matrix matrix = new Matrix(MatrixReader.readMatrix(pathIn));

        MatrixWriter.writeMatrix(LinearEquation.solve(matrix), pathOut);
    }
}