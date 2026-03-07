package compositionpattern;
public class B {
    A a=new A();
    void B1(){
        a.A1();
        System.out.println("B1 method");
    }
}
public class A {
    void A1(){
        System.out.println("A1 method");
    }
}