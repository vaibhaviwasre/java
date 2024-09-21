import java.util.*;
class program3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 1;i<=arr.length;i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
	}
}
