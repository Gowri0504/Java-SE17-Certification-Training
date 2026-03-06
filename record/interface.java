// package sealedExample;
// interface S5{
//     void S5();
//     int a=10;
//     System.out.println(a);
// }
package sealedExample;

interface S5 {
    int a = 10;      // constant
    void s5();       // method declaration


    public static void main(String[] args) {
        S5 s=new S5(){
            @Override
            public void s5() {
                System.out.println("S5 method implementation");
               
    };
    s.s5();
}
    }