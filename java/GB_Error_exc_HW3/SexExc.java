package GB_Error_exc_HW3;

public class SexExc extends Exception {
    public SexExc() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Указан неверный пол: %s", i);
        System.out.println();
    }
}
