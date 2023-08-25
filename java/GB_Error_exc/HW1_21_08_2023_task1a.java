package GB_Error_exc;

public class HW1_21_08_2023_task1a {

    public static void main(String[] args) {
        String[][] ints = new String[6][];
        ints[0] = new String[]{"0", "7", "0", "1", "8"};
        ints[1] = new String[]{"1", "4", "1", "0", "1", "8"};
        ints[2] = new String[]{"2", "1", "0"};
        ints[3] = new String[]{"6", "5"};
        ints[4] = new String[]{"0", "1"};
        ints[5] = new String[]{"9", "18"};

        System.out.println(matrixCount2(ints));
    }

    public static String matrixCount1(int[][] matrix) {
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

    public static String matrixCount2(String[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
                int fl1 = 0;
                int fl2 = 0;
                try {
                System.out.println(matrix[j][i]);
                } catch (RuntimeException e) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println("такого элемента нет");
                    fl1 = 1;
                }
//                if (fl1 = 0 && matrix[j][i] == "4") {
//
//                }
                try {
                    System.out.println(matrix[i][j]);
                } catch (RuntimeException e) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println("такого элемента нет!");
                    return "Не! удовлетворяет условию (null)";
                }
            }
        }
        return "Удовлетворяет условию (null)";
    }

}
