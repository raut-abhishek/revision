// Runtime Method Overloading in Java

class Parent{
    void show(){
        System.out.println("Parent's method");
    }
}

class child extends Parent{
    void show(int a){
        System.out.println("Child's method" + a);
    }
}


public class methodOverloading2 {
    public static void main(String[] args) {
        Parent obj = new child();

        obj.show();

    }
    
}
