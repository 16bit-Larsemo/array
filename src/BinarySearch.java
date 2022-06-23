import java.util.*;

// Create scanner object
/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner rik = new Scanner(System.in);
        int arr[] = new int[10],n=0,lv=0,uv=9,p=0,k=0;
        // Prompt user for input
        System.out.print("Enter the 10 numbers in array in ascending order: ");
        for (int i = 0; i <10 ; i++) {
           arr[i] = rik.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        n=rik.nextInt();
        while(lv<=uv){
            p=(lv+uv)/2;
            if(arr[p]<n)
            lv=lv+1;
            if(arr[p]>n)
            uv=uv-1;
            if(arr[p]==n)
            k=1;
            break;
        }
        if (k==1)
        System.out.println("Search is successful");
        else
        System.out.println("Search is unsucessful");
}
}