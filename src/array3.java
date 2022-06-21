//Program for greatest number using array
class array3{
	public static void main(String [] args){
	int arr[]= {10,15,20,55,99,101,35};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The Greatest Number is:" +max);
	}
}
