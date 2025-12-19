// Compile time Method Overloading in Java

class Test{
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

public class methodOverloading1 {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.add(5, 10);
        obj.add(5.5, 10.5);
    }
}
