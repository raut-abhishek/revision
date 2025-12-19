// Stack vs Heap Memory in Java

public class StackVsHeapMemory{

    static class Test{
        int a = 10;      // instance variable stored in heap memory
        int b = 20;

        void show(){
            int c = 10; // local variable stored in stack memory
            System.out.println(a + " " + b + " are instance variables stored in heap memory");
            System.out.println(c + " is a local variable stored in stack memory");
        }
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();
    }
}