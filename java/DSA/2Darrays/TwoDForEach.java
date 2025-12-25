public class TwoDForEach {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 6},
            {7, 8}
        };

        for (int[] row : arr) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
