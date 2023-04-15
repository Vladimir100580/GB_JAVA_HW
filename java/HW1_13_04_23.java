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


        int k = 0;
        short[] arr1 = new short[Short.MAX_VALUE/n + 1];  // числа, кратые n, находим через произведение
        while (k * n <= Short.MAX_VALUE){
            arr1[k] = (short) (k * n);   // "(short)" подставил сам редактор, иначе подчеркивал красным
            k ++;
        }
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
        System.out.println(Arrays.toString(arr1));


        int k1 = 1;
        short[] arr2 = new short[(-Short.MIN_VALUE)/n];  // здесь уже ноль не учитываем
        while (-k1 * n >= Short.MIN_VALUE){
            arr2[k1 - 1] = (short) (-k1 * n);   // начинаем с -n
            k1 ++;
        }
        System.out.println(Arrays.toString(arr2));

    }

}