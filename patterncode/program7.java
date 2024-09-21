class code7{
	public static void main(String[]args){
		int num=9;
		char ch = 'A';
		for(int i = 9;i<=1;i++){
			if(num%2==1){
				System.out.print((char)num+64+" ");
			}else{
				System.out.println(num+ " " );
			}
			num--;
		}
	}
}
