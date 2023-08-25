// Дан следующий код, исправьте его там, где требуется
// В условии задачи так:
//   catch (Throwable ex) {
//       System.out.println("Что-то пошло не так...");
//   } catch (NullPointerException ex) {
//       System.out.println("Указатель не может указывать на null!");
//   } catch (IndexOutOfBoundsException ex) {
//       System.out.println("Массив выходит за пределы своего размера!");
//   }

package GB_Error_exc;
import java.io.FileNotFoundException;
public class HW2_24_08_2023_task3 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");    // Была нарушена иерархия исключений
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {   // Здесь throws излишне, если в теле метода более ничего нет.
        try {
            System.out.println(a + b);                                                  // ... но, т.к. есть предупреждение о выбросе, скорее всего эту строку нужно обернуть
        } catch (Exception e) {
            throw new FileNotFoundException();
        }
    }

}
