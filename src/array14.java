import java.util.Scanner;

public class array14 {
    public static void main(String[] args) {
        Scanner rik =new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int arr[] = new int[10], k=0;
        for (int i = 0; i < 10; i++) {
            arr[i] =rik.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int num=rik.nextInt();
        for (int i = 0; i < 10; i++) {
            if(arr[i]==num)
            k=1;
        }
        if(k==1)
        System.out.println("Number is found");
        else
        System.out.println("Number is not found");
    }
}
