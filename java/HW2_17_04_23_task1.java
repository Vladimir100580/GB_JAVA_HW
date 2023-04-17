// Сравнить скорость работы реплейса классов String и StringBuilder.

public class HW2_17_04_23_task1 {
    public static void main(String[] args) {
        String st0 = "Есть урок, который идет не сорок пять минут, а всю жизнь. " +
                "Этот урок проходит и в классе, и в поле, и дома, и в лесу. Я назвал этот урок седьмым потому, " +
                "что в школе обычно бывает не больше шести уроков. Не удивляйтесь, если я скажу, что учителем " +
                "на этом уроке может быть и береза возле ваше дома, и бабушка. и вы сами (В. Песков)";

        String oldW = "урок";
        String newW = "занятие";


        // Метод с реплейсом String
        long t3 = System.nanoTime();
        String st1 = st0.replace(oldW, newW);
        System.out.println(st1);
        System.out.println(System.nanoTime() - t3);


        // Метод с реплейсом StringBuilder              (САМЫЙ БЫСТРЫЙ!!!!!!  ... хотя, иногда последний метод обгоняет Но, однозначно быстрее String реплейса)
        long t6 = System.nanoTime();
        StringBuilder stf0 = new StringBuilder(st0);
        StringBuilder delStr = new StringBuilder(st0);
        int nn = 0; // nn - счетчик позиции
        int ind1 = delStr.indexOf(oldW);
        while (ind1 != -1)
        {
            ind1 = delStr.indexOf(oldW);
            nn += ind1;
            stf0.replace(nn, nn + oldW.length(), newW);
            nn += newW.length();
            delStr.delete(0, ind1+oldW.length());
        }
        System.out.println(stf0);
        System.out.println(System.nanoTime() - t6);


        // String метод (За исключенгием обработки s2 delete) без реплейса (сборкой строки)
        long t0 = System.nanoTime();
        String stt = "";
        StringBuilder st2 = new StringBuilder(st0);
        int n1 = 0;
        while (true) {
            n1 = st2.indexOf(oldW);
            if (n1 < 0) {
                stt += st2;
                break;
            }
            for (int i = 0; i < n1; i++) {
                stt += String.valueOf(st2.charAt(i));
            }
            stt += newW;
            st2.delete(0, n1 + oldW.length());
        }
        System.out.println(stt);
        System.out.println(System.nanoTime() - t0);


        // StringBuilder метод реплейса (сборкой строки)
        long t4 = System.nanoTime();
        StringBuilder sttt = new StringBuilder("");
        StringBuilder st3 = new StringBuilder(st0);
        while (true) {
            n1 = st3.indexOf(oldW);
            if (n1 < 0) {
                sttt.append(st3);
                break;
            }
            for (int i = 0; i < n1; i++) {
                sttt.append(st3.charAt(i));
            }
            sttt.append(newW);
            st3.delete(0, n1 + oldW.length());
        }
        System.out.println(stt);
        System.out.println(System.nanoTime() - t4);
    }
}
