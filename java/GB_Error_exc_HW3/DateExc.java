package GB_Error_exc_HW3;

public class DateExc extends Exception {
    public DateExc() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Введен неправильный формат даты: %s", i);
        System.out.println();
    }
}
