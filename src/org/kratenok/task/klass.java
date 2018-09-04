package org.kratenok.task;

import java.util.Arrays;
import java.util.Random;

public class klass {
    public static void main(String[] args) {
        int[][] array;
        array = new int[10][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) { //length метот вычисления массива служеное слово
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        // System.out.println(Arrays.toString(array));// вывести массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

}
