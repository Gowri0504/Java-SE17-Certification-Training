class A {

    void showA(){
        System.out.println("Inside Class A");
    }

}

class B {

    A a = new A();   // B has object of A

    void showB(){
        System.out.println("Inside Class B");
        a.showA();
    }

}

class C {

    B b = new B();   // C has object of B

    void showC(){
        System.out.println("Inside Class C");
        b.showB();
    }

}

public class Main {

    public static void main(String[] args){
        C c = new C();   // create object of C
        c.showC();

    }

}