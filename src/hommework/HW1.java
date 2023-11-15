package hommework;

/**
 * Шахматная доска
 * 	Создать программу для раскраски шахматной доски с помощью цикла.
 * 	Создать двумерный массив String'ов 8х8. С помощью циклов задать
 * 	элементам циклам значения B(Black) или W(White).
 */

public class HW1 {
    public static void main(String[] args) {
        String[][] arrayString = new String[8][8];
        int numsColumn = 0;
        for (String[] array1: arrayString) {
            for (String numArray: array1) {
                numsColumn++;
                if(numsColumn %2 ==0){
                    numArray = " B ";
                } else {
                    numArray = " W ";
                }
                System.out.print(numArray);
            }
            numsColumn++;
            System.out.println();
        }
    }
}

