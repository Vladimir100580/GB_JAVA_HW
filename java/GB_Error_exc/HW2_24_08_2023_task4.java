// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package GB_Error_exc;
import java.util.Scanner;

public class HW2_24_08_2023_task4 {

    public static void main(String[] args) throws Exception {
        String str1 = "";
        str1 = inputStr();
        printString(str1);
    }

    public static String inputStr() throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Введите непустую строку: ");
        String st = in.nextLine();
        if (st.equals("")) {
            throw new Exception("Строка не должна быть пустой!");
        }
        return st;
    }

    private static void printString(String st) {
        System.out.printf("Ваша строка: %s \n", st);
    }
}
