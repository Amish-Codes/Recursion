package Recursion;

public class Fst_n_Lst_Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void countOcc(String str, int i, char element) {
        if (i==str.length()) {
            System.out.println("First Occurance "+first);
            System.out.println("Last Occurance " + last);
            return;
        }
        char  currentChar = str.charAt(i);
        if(currentChar==element) {
            if (first==-1) {
                first=i;
            }
            else {
                last = i;
            }
        }
        countOcc(str,i+1,element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        countOcc(str,0,'a');
    }
}
// Time Complexity - O(n)