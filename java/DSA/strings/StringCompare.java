package strings;

public class StringCompare{
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");

        System.out.println(a == b);        
        System.out.println(a.equals(b));   
    }
}

