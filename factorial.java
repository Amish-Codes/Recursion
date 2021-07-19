package Recursion;

public class factorial {
    public int fact(int n) {
        if (n<0) return -1;
        if (n == 1) return 1;
        return  n * fact(n-1);
    }

    public static void main(String[] args) {
        factorial obj =  new factorial();
        int rec = obj.fact(3);
        System.out.println(rec);
    }
}
