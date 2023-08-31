package GB_Error_exc_HW3;

public class DataExc extends Exception {
    public DataExc() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Введен неправильный формат: %s", i);
        System.out.println();
    }
}
