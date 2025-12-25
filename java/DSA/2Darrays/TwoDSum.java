public class TwoDSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {3, 4}
        };

        int sum = 0;
        for (int[] row : arr) {
            for (int x : row) {
                sum += x;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
