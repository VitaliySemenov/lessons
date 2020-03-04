package lesson2;

import java.util.Arrays;
public class ArraysLesson {
    public static void main(String[] args) {
        // Объявление переменной массива
        int[] someArr;
//        int someArr[]; C-style
        someArr = new int[7];
        System.out.println(Arrays.toString(someArr));

        int[] someArr2 = {37, 48, 125, 983, -23, 0, -112};
        System.out.println(Arrays.toString(someArr2));

    }
}
