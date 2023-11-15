package hommework;

/**
 * Умножение двух матриц
 * 	Создайте два массива целых чисел размером 3х3 (две матрицы).
 * 	Напишите программу для умножения двух матриц.
 */

public class HWA2 {
    public static void main(String[] args) {
        int [][] arrays1 = {{1,1,2},{0,1,0},{2,4,0}};
        int [][] arrays2 = {{1,2,3},{1,1,1},{2,1,7}};
        for (int i = 0; i < arrays1.length; i++) {
            for (int j = 0; j < arrays1[i].length; j++) {
                System.out.println(arrays1[i][j] * arrays2[i][j]);
            }
        }
    }
}
