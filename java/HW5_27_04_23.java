// Создать множество, ключ и значение строки. Добавить шесть элементов.
// Вывести в консоль значения. Добавить ко всем значениям символ "!".
// Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
// Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.

import java.util.*;

public class HW5_27_04_23 {

    public static void main(String[] args) {

        // Создать множество, ключ и значение строки. Добавить шесть элементов.
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "Константин");
        map1.put("3", "Мария");
        map1.put("4", "Александр");
        map1.put("5", "Виктор");
        map1.put("7", "Татьяна");
        map1.put("8", "Светлана");

        // Вывести в консоль значения.
        Iterator<String> iter = map1.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println(key + " ~ " + map1.get(key));   // для большей наглядности, вывел и ключи
        }

        // Добавить ко всем значениям символ "!".
        for (String key: map1.keySet()) {
            map1.compute(key, (k, v) -> v+"!");
            // map1.merge(key, "!", String::concat);  Можно и так
        }

        // Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("1", "Инженер");
        map2.put("2", "Библиотекарь");
        map2.put("4", "Водитель");
        map2.put("5", "Диспетчер");
        map2.put("6", "Врач");
        map2.put("8", "Учитель");
        map2.put("10", "Депутат");

        // Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.
        var m1 = new HashSet<>(map1.keySet());
        m1.addAll(map2.keySet());                          // объединили множества ключей

        HashMap<String, String> map3 = new HashMap<>();
        for (String key: m1)  map3.put(key, map1.getOrDefault(key, "") +
                (map1.containsKey(key) && map2.containsKey(key) ? " – " : "")      // тире вставляем только тогда, когда для данного ключа есть значения в обоих словарях
                + map2.getOrDefault(key, ""));

//        Можно и БЕЗ использования ТРЕТЬЕГО множества (если далее исходные данные map1(или map2) использоваться не будут)
//        for (String key: m1)  map1.put(key, map1.getOrDefault(key, "") + " " + map2.getOrDefault(key, ""));
//        System.out.println(map1);

        System.out.println();
        for (String key : map3.keySet())  System.out.println(key + " ~ " + map3.get(key));
    }
}
