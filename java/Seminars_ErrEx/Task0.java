package Seminars_ErrEx;

public class Task0 {

    public static void main(String[] args) {
        try {
            System.out.println(tttest0(6,0));
//            throw new RuntimeException();
        } catch(Exception e){
            System.out.println("ку-ку");
        }
    }
    private static float tttest0(int i, int i1) {
        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {5, 4, 3, 2};
        float k = i/i1;
        return k;
    }
}
