package generics;

public class A1<T>{
    private T a;
    private T b;

    public A1(T a, T b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args){

        A1<Integer> a1 = new A1<>(10,20);

        System.out.println("a: " + a1.a);
        System.out.println("b: " + a1.b);
    }
}