import java.util.*;

public class HW6_18_05_23hw {
    public static void main(String[] args) {
        myHashSet myHS = new myHashSet();

        myHS.addd(8);        // метод добавляющий остаток от деления на 7 (согласен, не практичный метод ... для себя, дабы закрепить)
        myHS.addd(9);
        myHS.addd(33);
        for (int i = 0; i < 7; i++) {
            myHS.add(new Random().nextInt(20));
        }

        System.out.println(myHS.contains(7));
//        System.out.println(Arrays.toString(myHS.toArray())); // До введенного метода пришлось бы так
        System.out.println(myHS.toStr());

        System.out.println(myHS.getItem(4));
    }
}

class myHashSet {

    static final Object OBJECT = new Object();
    private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>(); // помнит порядок добавления элементов, но более медлительный

    public boolean add(int num){
        return hashMap.put(num, OBJECT) == null;    // Добавляем элемент
    }

    public boolean addd(int num){
        return hashMap.put(num%7, OBJECT) == null;         //Добавляем элемент равный остатку от деления на 7 переданного числа (ДЛЯ СЕБЯ, эксперимент)
    }

    public boolean contains(int num) {
        return hashMap.containsKey(num);        //Присутствие элемента во множестве
    }

    public Object[] toArray() {
        return hashMap.keySet().toArray();    //Переводим в массив
    }

    public String toStr() {
        return Arrays.toString(toArray());    //!!! Возвращаем строку с элементами множества
        //return Arrays.toString(hashMap.keySet().toArray());    //Если без использования введенного выше toArray()
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];   // Элемент по индексу ... так же - можно: hashMap.keySet().toArray()[index];
    }

}

