package GB_Error_exc;

public class Lk_1_er {
    public static void main(String[] args) {
        System.out.println(devide(7,0));
        System.out.println(mass(100));
    }

    private static float devide(int i, int i1) {
        if (i1 == 0) {
            throw new RuntimeException("Делите на ноль бессовестным образом");
        }
        return (float) i/i1;
    }

    public static int mass(int i0) {


        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10 + i * 10); // генерация случайного числа и приведение к типу int
        }


        return ints[i0];
    }
}
