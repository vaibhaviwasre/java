import java.util.*;
class program3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter element:");
			arr[i] = sc.nextInt();
			System.out.print("Array elements are:");
			for(int i= 0;i<arr.length;i++){
				sum = sum + arr[i];
				System.out.println("sum" + sum);
			}
		}
	}
}
