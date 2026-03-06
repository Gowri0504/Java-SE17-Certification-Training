public Class Largest{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int largest = findLargest(a, b, c);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
}