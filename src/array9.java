
/*
Accept 10 numbers in a Single Dimensional Array.
Create another array to store the squares of this array.
Display both the arrays in given format-------
Array1      Array 2
4           16
3           9
5           25
..          ..
*/
import java.util.*;

public class array9 {
    public static void main(String[] args) {
        Scanner rik = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            a[i] = rik.nextInt();
            b[i] = a[i] * a[i];
        }
System.out.println( 
    "Array 1 \t \t Array 2"
);
    }
}
