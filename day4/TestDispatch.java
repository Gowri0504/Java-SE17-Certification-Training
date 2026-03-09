class A {
    void show() {
        System.out.println("Method in class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Method in class B");
    }
}

class C extends B {
    void show() {
        System.out.println("Method in class C");
    }
}

public class TestDispatch {
    public static void main(String[] args) {
        
        //arraylist object
        java.util.ArrayList<A> list = new java.util.ArrayList<>();
        

        A ref;   

        ref = new A();
        ref.show();

        ref = new B();
        ref.show();

        ref = new C();
        ref.show();
    }
}