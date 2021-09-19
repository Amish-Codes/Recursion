package Recursion;
// find the number of ways in which you can invite n people to your party, single or in pairs

public class PartyInvPC {

    public static int countPairs(int n) {

        if (n<=1) {
            return 1;
        }

        // single
        int way1 = countPairs(n-1);

        // pairs
        int way2 = (n-1) * countPairs(n-2);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.printf("%d", countPairs(n));
    }
}
