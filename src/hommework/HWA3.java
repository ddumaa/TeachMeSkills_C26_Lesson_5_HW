package hommework;

import java.util.Arrays;

/**
 * Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * 	всех элементов массива.
 */

public class HWA3 {
    public static void main(String[] args) {
        int [][] array = new int[3][4];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
                sum+=array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);
    }
}
