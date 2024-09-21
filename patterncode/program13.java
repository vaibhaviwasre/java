class code13{
	public static void main(String[]args){
		for (int i = 1;i<=6;i++){
			i1 = 1;
			i2 = 3;
			for (int j = 1;j<=3;j++){
				if(i%2==1){
					System.out.print(i1+1 + " ");
				}else{
					System.out.println(i2-- + " ");
				}
				System.out.println();
			}
		}
	}
}
