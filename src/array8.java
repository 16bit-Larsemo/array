import java.util.Scanner;

/*
Accept 10 numbers in single dimensional array.
Display the greatest number of the array.
*/
public class array8 {
    public static void main(String[] args) {
        System.out.println("Enter 10 digits: ");
        Scanner rik = new Scanner(System.in);
        int n[]=new int [10];
        for(int i =0;i<10;i++)
        n[i]=rik.nextInt();
        int max=n[0];
        for(int j=0;j<10;j++){
            if(n[j]>max)         
            max=n[j];
        }
        System.out.println("The greatest number is: " + max);

    }
}
