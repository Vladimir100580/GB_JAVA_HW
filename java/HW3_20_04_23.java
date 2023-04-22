// 1. Реализовать алгоритм обратной сортировки списков компаратором.
// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
// 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
// 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
// 6. Повторить пятый пункт но с LinkedList.
// 7. Сравнить время работы пятого и шестого пунктов.

import java.util.*;

public class HW3_20_04_23 {

    public static void main(String[] args) {

        // 1. Реализовать алгоритм обратной сортировки списков компаратором.
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 12; i++)  list1.add(new Random().nextInt(20));
        System.out.println("1) Исходный список1: " + list1);
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("Сортированный список: " + list1 + "\n");


        // 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа.
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 12; i++)  list2.add(new Random().nextInt(-20, 20));
        System.out.println("2) Исходный список2: " + list2);
        list2.removeIf(integer -> integer % 2 == 0);  // Написал как в комментарии ниже, но умная Idea, порекомендовала заменить одной строкой)
//        Iterator<Integer> iter = list2.iterator();
//        while (iter.hasNext()){
//            if (iter.next() % 2 == 0) iter.remove();
//        }
        System.out.println("Исключили честные числа: " + list2 + "\n");


        // 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 13; i++)  list3.add(new Random().nextInt(-20, 25));
        System.out.println("3) Исходный список3: " + list3);
        int max_i = Integer.MIN_VALUE;
        int min_i = Integer.MAX_VALUE;
        int summ = 0;
        for (int i: list3) {
            if (max_i < i) max_i = i;
            if (min_i > i) min_i = i;
            summ += i;
        }
        System.out.println("MAX: " + max_i + ", " + "MIN: " + min_i + ", " + "Average: ≈" + (double) Math.round(((double) summ / list3.size())*100)/100 + ".\n");


        // 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 8; i++)  list4.add(new Random().nextInt(12));
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 8; i++)  list5.add(new Random().nextInt(12));
        System.out.println("4) Исходные списки: \n" + list4 + "\n" + list5);
            // Сначала лучше найти все элементы второго списка, которых нет в первом, затем объединить полученные списки.
        list5.removeAll(list4);
        // System.out.println(list5 + "\n");
        list4.addAll(list5);
        System.out.println("Объединение списков, с учетом условия: " + list4 + "\n");


        // 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз. (ПРОСТИТЕ за вольность ... еще попробовал со 100000)
        ArrayList<Integer> list6 = new ArrayList<>();
        long t50 = System.nanoTime();
        for (int i = 0; i<100000; i++) list6.add(0, 0);  // если сделать 10000, отношение затраченного времени примерно равно 4
        long t51 = System.nanoTime();
        System.out.print("Время выполнения с ArrayList<Integer> в нс: ");
        System.out.println(t51-t50);

        // 6. Создать LinkedList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        LinkedList<Integer> list7 = new LinkedList<>();
        long t60 = System.nanoTime();
        for (int i = 0; i<100000; i++) list7.add(0, 0);  // со 100000 LinkedList уже выигрывает почти в 100 раз.
        long t61 = System.nanoTime();
        System.out.print("Время выполнения с LinkedList<Integer> в нс: ");
        System.out.println(t61-t60);

        // 7. Сравнить время работы пятого и шестого пунктов.
        float def = (float) (t51 - t50) / (t61 - t60);
        System.out.printf("Время выполнения с LinkedList<Integer> примерно в %.2f раза быстрей", def);
    }
}
