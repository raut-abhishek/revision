package strings;

public class SplitString {
    public static void main(String[] args) {
        String s = "Java is powerful";

        String[] words = s.split(" ");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
