package Recursion;

public class MoveXend {

    public static void moveAllX(String str, int i, int count, String newString) {
        if (i==str.length()) {
            for (i=0;i<count;i++) {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);
        if (currChar=='x') {
            count++;
            moveAllX(str, i+1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, i+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str,0,0,"");
    }
}
// Time Complexity - O(n)