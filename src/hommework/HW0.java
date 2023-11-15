package hommework;

import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел.
 * 	С помощью циклов "пройти" по всему массиву и увеличить каждый
 * 	элемент на заданное число. Пусть число, на которое будет
 * 	увеличиваться каждый элемент, задается из консоли.
 */

public class HW0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int[][][] array3d = {{{2, 1, 8},{3, 5, 1}},{{1, 2, 3},{2, 1, 7}},{{9, 0, 1},{3, 6, 7}}};

        for (int[][] array2: array3d) {
            for (int[] array1:array2) {
                for (int num: array1) {
                    num+=number;
                    System.out.println(num);
                }
            }
        }
    }
}
