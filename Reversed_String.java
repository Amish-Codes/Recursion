package Recursion;

public class Reversed_String {
    public static void printRev(String str, int i) {
        if(i==0) {
            System.out.println(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        printRev(str,i-1);
    }
    public static void main(String[] args) {
        String str = "amish";
        printRev(str,str.length()-1);

    }
}
//Time Complexity - O(n)