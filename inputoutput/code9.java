import java.util.*;
class program9{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player info");
		String info = sc.nextLine();
		StringTokenizer st = new StringTokenizer(info,"a # @");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
