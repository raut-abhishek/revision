public class ArrayMethod {
    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        printArray(arr);
    }
}
