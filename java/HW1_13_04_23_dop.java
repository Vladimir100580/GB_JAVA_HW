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
        System.out.printf("n=%d", n);

        short[] arr1 = task3(n);
        System.out.println(Arrays.toString(arr1));
        System.out.printf("n=%d", n);

        short[] arr2 = task4(n);
        System.out.println(Arrays.toString(arr2));

    }

    static int task1(){    // простите, не стал креативить с названиями методов
        return new Random().nextInt(0,2001);
    }

    static int task2(int i){
        int n = Integer.toBinaryString(i).length();    // не стал использовать выделенную функцию, пошёл "двухходовочкой"
        return n;
    }

    static short[] task3(int n){
        int k = 0;
        short[] arr = new short[Short.MAX_VALUE/n + 1];
        while (k * n <= Short.MAX_VALUE){
            arr[k] = (short) (k * n);                        // в методах task3 и task4 используем одноименные переменные, т.к. они локальные
            k ++;
        }
        return arr;
    }

    static short[] task4(int n){
        int k = 1;
        short[] arr = new short[(-Short.MIN_VALUE)/n];
        while (-k * n >= Short.MIN_VALUE){
            arr[k - 1] = (short) (-k * n);
            k ++;
        }
        return arr;
    }
}
