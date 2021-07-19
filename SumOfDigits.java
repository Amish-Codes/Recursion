package Recursion;

public class SumOfDigits {
    public int sum(int n) {
        if (n == 0 || n < 0) return 0;
        return n%10 + sum(n/10);
    }
    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        int rec = obj.sum(5555);
        System.out.println(rec);
    }
}
