package GB_Error_exc;

public class HW1_21_08_2023_task1 {

    public static void main(String[] args) {
        int[][] ints = new int[6][];
        ints[0] = new int[]{0, 7, 0, 1, 8};
        ints[1] = new int[]{1, 4, 1, 0, 1, 8};
        ints[2] = new int[]{2, 1, 0};
        ints[3] = new int[]{6, 5};
        ints[4] = new int[]{0, 1};
        ints[5] = new int[]{9, 18};

        System.out.println(matrixCount2(ints));

    }


    public static String matrixCount2(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
//                int fl1 = 0;
//                int fl2 = 0;
//                try {
//                System.out.println(matrix[j][i]);
//                } catch (RuntimeException e) {
//                    System.out.println(i);
//                    System.out.println(j);
//                    System.out.println("такого элемента нет");
//                    fl1 = 1;
//                }
                try {
                    System.out.println(matrix[i][j]);
                } catch (RuntimeException e) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println("такого элемента нет!");
                    return "Не! удовлетворяет условию";
                }
            }
        }
        return "Удовлетворяет условию";
    }
}
