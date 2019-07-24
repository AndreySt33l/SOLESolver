package com.xsteel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MatrixReader {
    public static double[][] readMatrix(String path) {
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (IOException e){
            e.printStackTrace();
        }
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        return array;
    }
}
