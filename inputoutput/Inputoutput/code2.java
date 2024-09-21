import java.util.*;
class Program2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num % 8 ==0){
			System.out.println("Number is divisible by 8");
		}else{
			System.out.println("Number is not divisible by 8");
		}
	}
}
