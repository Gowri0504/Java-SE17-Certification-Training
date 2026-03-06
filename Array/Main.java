public class Main {

    static void reverse(int[] a, int l, int r){
        while(l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        for(int x : arr)
            System.out.print(x+" ");
    }
}