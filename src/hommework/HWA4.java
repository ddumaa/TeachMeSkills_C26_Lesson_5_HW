package hommework;

import java.util.Arrays;

/**
 * Создайте двумерный массив. Выведите на консоль диагонали массива.
 */

public class HWA4 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int numbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
                if(array[i][j] == array[numbers][numbers]){
                    System.out.println(array[numbers][numbers]);
                    numbers++;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
