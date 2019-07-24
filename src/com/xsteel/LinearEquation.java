package com.xsteel;

public class LinearEquation {
    private static boolean isZeroColumn(double[] arr){
        boolean result = true;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                result = false;
            }
        }

        return result;
    }

    private static int getNotZeroIndex(double[] arr){
        int index = -1;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                index = i;
            }
        }

        return index;
    }

    private static double[] GaussJordanEliminate(Matrix m){
        Matrix matrix = new Matrix(m);

        System.out.println(matrix);

        for (int i = 0; i < matrix.getRows(); i++) {
            if (matrix.getElement(i, i) == 0 && isZeroColumn(matrix.getColumn(i))){
                throw new ArithmeticException("Unsolvable");
            }
            else {
                if (matrix.getElement(i, i) == 0) {
                    matrix.switchRows(i,
                            getNotZeroIndex(matrix.getColumn(i)));
                }
                if (matrix.getElement(i, i) != 1) {
                    matrix.getRow(i).divideBy(matrix.getElement(i, i));
                }

                int j = 0;
                while (j < matrix.getRows()) {
                    while (j != i && j < matrix.getRows()) {
                        matrix.getRow(j).setRow(
                                Row.subtract(
                                        matrix.getRow(j), Row.multiply(matrix.getRow(i), matrix.getElement(j, i))
                                ));
                        j++;
                    }
                    j++;
                }
            }
        }

        return matrix.getColumn(matrix.getColumns());
    }


    public static double[] solve(double[][] mtrx) throws ArithmeticException{
        Matrix matrix = new Matrix(mtrx);

        return GaussJordanEliminate(matrix);
    }

    public static double[] solve(Matrix mtrx) throws ArithmeticException{
        return GaussJordanEliminate(mtrx);
    }
}
