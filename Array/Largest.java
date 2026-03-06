public class Largest{
    public static void main(String[] args) {
        int num[] = {10, 20, 5, 30, 15};
        int largest = num[0];   
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println("The largest number is: " + largest);
    }


}   
    