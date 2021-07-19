package Recursion;

public class GreatestCommonDivisor {
    public int gcd(int a,int b) {
        if (a<0 || b<0) return -1;
        if (b==0) {
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        int rec = obj.gcd(8,4);
        System.out.println(rec);
    }
}
