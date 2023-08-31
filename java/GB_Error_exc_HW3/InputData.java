package GB_Error_exc_HW3;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите все данные через пробелы (Ф.И.О, дата рождения - dd.mm.yyyy, номер телефона - только цифры, пол - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.trim().split("\\s+");  // Убираем все лишние пробелы
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("Вы ввели не все данные, пожалуйста, повторите попытку");
            } else System.out.println("Вы ввели лишние данные, пожалуйста, повторите попытку");
        }
    }
}
