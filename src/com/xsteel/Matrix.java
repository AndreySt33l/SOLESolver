package com.xsteel;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Matrix {
    private Row[] matrix;
    private  int rows;
    private  int columns;

    public Matrix(Matrix matrix){
        this.matrix = matrix.getMatrix();
        rows = matrix.getRows();
        columns = matrix.getColumns();
    }

    public Matrix(double[][] matrix){
        this.rows = matrix.length;
        this.matrix = new Row[matrix.length];

        int counter = 0;
        for (double[] row : matrix){
            this.matrix[counter] = new Row(row);
            counter++;
        }

        this.columns = counter;
    }

    public Matrix(File pathToFile) throws FileNotFoundException {
        double[][] matrix;
        String[] str;

        int rows = 0;
        int columns = 0;

        Scanner scanner = new Scanner(pathToFile);

        while (scanner.hasNextLine()){
            str = scanner.nextLine().split(" ");
            rows++;

            for (String value : str) {
                
                columns++;
            }
        }
    }

    public Row[] getMatrix(){
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Row getRow(int index){
        return matrix[index];
    }

    public double[] getColumn(int index){
        double[] result = new double[rows];

        for (int i = 0; i < rows; i++)
            result[i] = matrix[i].getElement(index);

        return result;
    }

    public double getElement(int i, int j){
        return matrix[i].getElement(j);
    }

    public void switchRows(int index1, int index2){
        Row tempr = new Row(getRow(index1));

        matrix[index1].setRow(matrix[index2]);
        matrix[index2].setRow(tempr);
    }

    @Override
    public String toString() {
        String res = new String();

        for (int i = 0; i < matrix.length; i++) {
            res = res + matrix[i].toString() + "\n";
        }

        return res;
    }


}
