//Написать метод принимающий строку, ищущий в ней основание и степень После этого расчитывающий результат
// и выводящий в консоль в консоль строку параметра + ответ. Пример строки: "Основание -12б степень 7, результат".
// Попробовать с разными входящими строками.
public class HW2_17_04_23_task2 {
    public static void main(String[] args) {
        String st = "Основание -4, степень 5, результат равен";
        StringBuilder st1 = new StringBuilder(st);
        int n0 = st1.indexOf("е") + 2;
        st1.delete(0, n0);
        int n1 = st1.indexOf(",");
        st1.delete(n1, st1.length());
        StringBuilder sttemp1 = new StringBuilder(st);

        sttemp1.delete(0, sttemp1.indexOf("т"));;
        int n2 = sttemp1.indexOf("ь") + 2;
        sttemp1.delete(0, n2);
        int n3 = sttemp1.indexOf(",");
        sttemp1.delete(n3, sttemp1.length());

//        System.out.println(st1);
//        System.out.println(sttemp1);

        double basic = Double.parseDouble(String.valueOf(st1));
        double pow = Double.parseDouble(String.valueOf(sttemp1));
        Long result = Math.round(Math.pow(basic, pow));    // округляем, поэтому с иррациональными результатами работает грубо
        System.out.printf("%s %d", st, result);
    }
}
