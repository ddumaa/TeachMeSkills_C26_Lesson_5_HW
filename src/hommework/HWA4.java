package hommework;

import java.util.Arrays;

/**
 * Создайте двумерный массив. Выведите на консоль диагонали массива.
 */

public class HWA4 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
                if(i == j){
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println(" ");
        for (int i = array.length-1; i>=0; i--) {
            for (int j = array[i].length-1; j >=0; j--) {
                if(i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.deepToString(array));
    }
}
