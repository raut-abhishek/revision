public class MinElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20};
        int min = arr[0];

        for (int x : arr) {
            if (x < min)
                min = x;
        }

        System.out.println("Min = " + min);
    }
}
