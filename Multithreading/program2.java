class orderDelayedException extends Exception{
	orderDelayedException(String str)
	{
		super(str);
	}
}
class Zomato{
	boolean rainStatus = true;
	boolean rainCheck(){
		if(rainStatus==true)
			return rainStatus;
		else
			return rainStatus;
	}
	void order(String food){
		boolean val = rainCheck();
		if(val==true){
			throw new
				orderDelayedException("order cancelled deu to heavy rainfall");
		}
		System.out.println("Preparing order" + food);
	}
}
class User{
	public static void main(String[]args){
		Zomato obj = new Zomato();
		obj.order("Briyani");
	}
}
