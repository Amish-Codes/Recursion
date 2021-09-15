package Recursion;

public class RemoveDuplicatesInString {

    public  static boolean [] map = new boolean[26];
    public static  void  removeDuplicates(String str, int i, String newString) {
        if (i==str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar-'a']) {
            removeDuplicates(str,i+1,newString);
        } else {
            newString += currChar;
            map[currChar-'a'] = true;
            removeDuplicates(str, i+1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbcda";
        removeDuplicates(str,0,"");
    }
}
// Time Complexity - O(n)