class code12{
	public static void main(String[]args){
		int row = 3;
		for(int i = 1;i<=row;i++){
			i = row*row;
			for(int j = 1;j<=row;j++){
				System.out.print(i-- + " ");
			}
			System.out.println();
		}
	}
}
