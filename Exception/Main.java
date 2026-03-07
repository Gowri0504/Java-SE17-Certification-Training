try{
    throw new RuntimeException();
}catch(Exception e){
    System.out.println("A");
}catch(RuntimeException e){
    System.out.println("B");
}

try{
    throw new Exception();
}catch(RuntimeException e){
    System.out.println("A");

    }catch(Exception e){
    System.out.println("B");
}

try{
    return;
}finally{
    System.out.println("A");
}

try{
    System.out.println("A");
    throw new RuntimeException();
} finally{
    System.out.println("B");
}

try{
    throw new Error();
} catch(Exception e){
    System.out.println("Exception");
}

try{
    throw new Error();
} catch(Throwable){
    System.out.println("Caught");
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new Error();
        } catch (Throwable t) {
            System.out.println("Caught");
        }
    }
} //


        try {
            int arr[]={1,2};
            System.out.println(arr[3]);
        }catch (RuntimeException e){
            System.out.println("Handled");
        } // Handled


public class Main {
    public static void main(String[] args) {

    }
}

try{
    int x=Integer.parseInt("10");
}catch(NumberFormatException e){
    System.out.println("Handled");  
}     //10


      try{
    throw new IllegalArgumentException();
    }catch(RuntimeException e){
         System.out.println("Handled");
} //RuntimeException is the parent class of IllegalArgumentException, so it will be caught and "Handled" will be printed.

try{
    String s=null;
    s.length();

}catch(NullPointerException e){
    System.out.println("Null");
}// Null


