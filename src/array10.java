import java.util.Scanner;

/*
Input 10 numbers ina single Dimensional Array. 
Now enter a number and Search whether it is present in the given array or not using Linear Search Technique 
*/
public class array10 {
    public static void main(String[] args) {
        int f=0;
        int a[] = new int[10];
        Scanner rik=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<10;i++)
        a[i]=rik.nextInt();
        System.out.print("Enter the number to find: ");
        int n=rik.nextInt();
        for(int i=0;i<10;i++)
        if(a[i]==n){
            f=1;
            break;
        }
        if(f==1)
        System.out.println("Number found");
        else
        System.out.println("Number not found");
        
    }
}
