package Recursion;

public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombinations(String str, int i, String combination) {
        if (i==str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(i);
        String mapping = keypad[currChar-'0'];
        for (int j=0; j<mapping.length();j++) {
            printCombinations(str, i+1, combination+mapping.charAt(j));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printCombinations(str,0,"");
    }
}
//Time Complexity - O(4^n)