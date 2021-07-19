package Recursion;

public class Power {
    public int pow(int base, int exp) {
        if (exp<0) return -1;
        if (exp==0 || exp==1) return base;
        return base * pow(base, exp-1);
    }

    public static void main(String[] args) {
        Power obj = new Power();
        int rec = obj.pow(2,2);
        System.out.println(rec);
    }
}
