package Recursion;

public class fibonacci {
    public  int fib(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 ||n==1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        fibonacci obj = new fibonacci();
        int rec = obj.fib(10);
        System.out.println(rec);
    }
}
