// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main

import java.util.Arrays;
import java.util.Random;

public class HW1_13_04_23 {


    public static void main(String[] args) {

        int i = new Random().nextInt(0,2001);
        System.out.println(i);


        int n = Integer.toBinaryString(i).length();    // не стал использовать выделенную функцию, пошёл "двухходовочкой"
        System.out.println(n);


        int n0 = ((i - 1) / n + 1) * n; // ближайшее справа к i число, кратное n ... (i - 1) т.к. учитыввем и само i.
        int n1 = (Short.MAX_VALUE / n) * n; // ближайшее слева к MAX_VALUE число кратное n
        short[] m1 = new short[(n1 - n0) / n + 1];  // арифметика помогла вычислить размерность массива
        for (int l = n0; l <= n1; l += n) {         // сократили количесво итерраций в n раз
            m1[(l - n0) / n] = (short) l;      // (short) подставляет сам редактор. Иначе подчерктвает красным
        }
        System.out.println(Arrays.toString(m1));

        int k = (i  / n ) + (Short.MIN_VALUE / n ) * (-1) + 1; // количество чисел на промежутке от MIN_VALUE до i кратных n.
        short[] m2 = new short[i - Short.MIN_VALUE + 1 - k];   // вновь арифметика (единички в строках 32 и 33 можно было убрать ... оставил для наглядности)
        int m = 0;
        for (int l = Short.MIN_VALUE; l <= i; l++) {
            if (l % n != 0) {
                m2[m] = (short) l;
                m++;
            }
        }
    System.out.println(Arrays.toString(m2));

    }
}