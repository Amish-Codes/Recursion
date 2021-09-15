package Recursion;
import  java.util.Scanner;
import java.util.stream.IntStream;

public class CheckArraySorted {

    public static boolean isSorted(int arr[], int i) {
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]<arr[i+1]) {
            return isSorted(arr, i+1);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of elements :");
            int n = sc.nextInt();

            System.out.println("Enter elements :");

            int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();

            System.out.println(isSorted(arr,0));
        }
    }
}
// Time Complexity - O(n)