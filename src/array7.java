/*
Accept 10 numbers in single dimensional array.
Diosplay the array elements at even subscript(not even number)
*/
import java.util.Scanner;
public class array7 {
    public static void main (String args[]){
        int n[]=new int[10];
        Scanner rik =new Scanner(System.in);
        for(int i=0;i<10;i++)
        n[i]= rik.nextInt();
       System.out.println("The even subscript number are----");
        for(int j=0;j<10;j+=2)
       System.out.println(n[j]);

    }
}
