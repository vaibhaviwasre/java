class code6{
	public static void main(String[]args){
		int num = 9;
		for (int i = 1;i<=9;i++){
			if (num%2==0){
				System.out.print(num*num);
			}else{
				System.out.print(num);
			}
			num--;
		}
	}
}
