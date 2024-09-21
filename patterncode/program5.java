class code5{
	public static void main(String[]args){
		int num =1;
		for(int i = 1;i<=9;i++){
			if(num%2==1){
				System.out.print((char)num+64+" ");
			}
			else{
				System.out.println(num+ " ");
			}
			num++;
		}
	}
}

