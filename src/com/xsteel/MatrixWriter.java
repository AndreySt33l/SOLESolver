package com.xsteel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MatrixWriter {
    public static void writeMatrix(double[] result, String pathOut) {
        File file = new File(pathOut);
        try ( FileWriter writer = new FileWriter(file) ) {
            writer.write(Arrays.toString(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
