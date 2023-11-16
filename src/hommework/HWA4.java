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
        System.out.println(" ");
        int numbers2 = array.length-1;
        for (int i = array.length-1; i>=0; i--) {
            for (int j = array[i].length-1; j >=0; j--) {
                if(array[i][j] == array[numbers2][numbers2]) {
                    System.out.println(array[numbers2][numbers2]);
                    numbers2--;
                }
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.deepToString(array));
    }
}
