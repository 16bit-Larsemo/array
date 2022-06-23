import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        // Take 5 numbers in arr1 and 7 numbers in arr2

        Scanner rik = new Scanner(System.in);
        System.out.println("Enter the number of elements in array 1: ");
        int nos1 = rik.nextInt();
        System.out.println("Enter the number of elements in array 2: ");
        int nos2 = rik.nextInt();
        int nosMerged = nos1 + nos2;
        int[] arr1 = new int[nos1];
        int[] arr2 = new int[nos2];
        int arr3[] = new int[nosMerged];
        System.out.println("Enter the numbers in Array 1:");
        for (int i = 0; i < nos1; i++) {
            arr1[i] = rik.nextInt();
        }
        System.out.println("Enter the numbers in Array 2:");
        for (int i = 0; i < nos2; i++) {
            arr2[i] = rik.nextInt();
        }
        for (int i = 0; i < nos1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < nos2; i++) {
            arr3[nos1 + i] = arr2[i];
        }
        // Now Merging
        System.out.println("The numbers in a merged array:\n");
        for (int i = 0; i < nosMerged; i++) {
            System.out.println(arr3[i]);
        }
    }
}