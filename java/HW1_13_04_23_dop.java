// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// *Пункты реализовать в разных методах

import java.util.Arrays;
import java.util.Random;

public class HW1_13_04_23_dop {

    public static void main(String[] args) {

        int i = task1();
        System.out.println(i);

        int n = task2(i);
        System.out.println(n);

        short[] arr1 = task3(n, i);
        System.out.println(Arrays.toString(arr1));

        short[] arr2 = task4(n, i);
        System.out.println(Arrays.toString(arr2));
    }

    static int task1(){    // простите, не стал креативить с названиями методов
        return new Random().nextInt(0,2001);
    }

    static int task2(int i){
        return Integer.toBinaryString(i).length();    // не стал использовать выделенную функцию, пошёл "двухходовочкой"
    }

    static short[] task3(int n, int i){
        int n0 = ((i - 1) / n + 1) * n;
        int n1 = (Short.MAX_VALUE / n) * n;
        short[] arr = new short[(n1 - n0) / n + 1];
        for (int l = n0; l <= n1; l += n) {
            arr[(l - n0) / n] = (short) l;
        }
        return arr;
    }

    static short[] task4(int n, int i){
        int k = (i  / n ) + (Short.MIN_VALUE / n ) * (-1) + 1;
        short[] arr = new short[i - Short.MIN_VALUE + 1 - k];
        int m = 0;
        for (int l = Short.MIN_VALUE; l <= i; l++) {
            if (l % n != 0) {
                arr[m] = (short) l;
                m++;
            }
        }
        return arr;
    }
}
