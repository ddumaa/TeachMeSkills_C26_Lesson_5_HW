package hommework;

import java.util.Arrays;

/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в
 * 	строках двумерного массива по возрастанию.
 */

public class HWA5 {
    public static void main(String[] args) {
        int[][]array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array));
    }
}
