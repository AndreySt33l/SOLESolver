package com.xsteel;

import java.util.Arrays;

public class Row {
    private double[] row;

    public Row() {}

    public Row(int length) {
        row = new double[length];
    }

    public Row(double[] row) {
        this.row = row;
    }

    public Row(Row row){
        this.row = row.getRow();
    }

    public double[] getRow() {
        return row;
    }

    public void setRow(double[] row) {
        this.row = row;
    }

    public void setRow(Row row){
        this.row = row.getRow();
    }

    public int length() {
        return row.length;
    }

    public double getElement(int index) {
        try {
            return row[index];
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return 0;
    }

    public void setElement(int index, double value){
        try {
            row[index] = value;
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public void multiplyBy(double value){
        for (int i = 0; i < row.length; i++){
            row[i] *= value;
        }
    }

    public void divideBy(double value){
        for (int i = 0; i < row.length; i++){
            row[i] /= value;
        }
    }

    public static Row sum(Row row1, Row row2){
        Row result = new Row(compareLength(row1, row2));

        for (int i = 0; i < row1.length(); i++) {
            double newValue = row1.getElement(i) + row2.getElement(i);
            result.setElement(i, newValue);
        }

        return result;
    }

    public static Row subtract(Row row1, Row row2){
        Row result = new Row(compareLength(row1, row2));

        for (int i = 0; i < row1.length(); i++) {
            double newValue = row1.getElement(i) - row2.getElement(i);
            result.setElement(i, newValue);
        }

        return result;
    }

    public static Row multiply(Row row1, double value){
        Row result = new Row(row1.length());

        for (int i = 0; i < row1.length(); i++){
            double newValue = row1.getElement(i) * value;
            result.setElement(i, newValue);
        }

        return result;
    }

    public static Row divide(Row row1, double value){
        Row result = new Row(row1.length());

        for (int i = 0; i < row1.length(); i++){
            double newValue = row1.getElement(i) / value;
            result.setElement(i, newValue);
        }

        return result;
    }

    private static int compareLength(Row row1, Row row2){
        return row1.length() > row2.length() ? row1.length() : row2.length();
    }

    @Override
    public String toString() {
        return  Arrays.toString(row);
    }


}
