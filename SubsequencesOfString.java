package Recursion;

import java.util.HashSet;

public class SubsequencesOfString {

    public static void subsequences(String str, int i, String newString, HashSet<String> set) {
        if (i==str.length()) {
            if (set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(i);
        // to be
        subsequences(str,i+1,newString+currChar,set);

        // not to be
        subsequences(str,i+1,newString,set);
    }

    public static void main(String[] args) {
//        String str = "abc";
        String str1 = "aaa";
        HashSet<String> set = new HashSet<>();
//        subsequences(str,0,"",set);
        subsequences(str1,0,"",set);
    }
}
// Time complexity O(2^n)