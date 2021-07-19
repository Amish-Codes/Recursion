package Recursion;

public class DecimalToBinary {
    public int dtb(int n) {
        if (n==0) {
            return 0;
        }
        return n%2 + 10 * dtb(n/2);
    }
    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        int rec = obj.dtb(10);
        System.out.println(rec);
    }
}
