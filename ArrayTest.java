public class ArrayTest {
    public static void main(String[] args) {
        int[] roll_no = new int[5];
        roll_no[0] = 2013107086;
        roll_no[1] = 2013107087;
        // System.out.println(roll_no.length);
        for (int i = 0; i < roll_no.length; i++) {
            System.out.println(roll_no[i]);
        }


        int[][] matrix = new int[3][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;

        matrix[1][0] = 3;
        matrix[1][1] = 4;

        matrix[2][0] = 5;
        matrix[2][1] = 6;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println(matrix[0].length);

    }
}
