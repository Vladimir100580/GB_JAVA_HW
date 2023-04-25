import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW4_24_04_23_write {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите через пробелы Ф,И,О, возраст, пол: ");
        String data = iScanner.nextLine();

        try (FileWriter fw = new FileWriter("file1.txt", true)) {
            fw.append(data+"\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
