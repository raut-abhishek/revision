public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20};
        int max = arr[0];

        for (int x : arr) {
            if (x > max)
                max = x;
        }

        System.out.println("Max = " + max);
    }
}
