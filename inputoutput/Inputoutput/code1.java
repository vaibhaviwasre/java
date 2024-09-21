import java.util.*;
class Program1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 :");
		int num2 = sc.nextInt();
		if(num1%2==0){
			System.out.println(num1 +" is even number");
		}else{
			System.out.println(num1 +" is odd number");
		}
	}
}
