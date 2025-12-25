public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};
        int key = 10;
        boolean found = false;

        for (int x : arr) {
            if (x == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}
