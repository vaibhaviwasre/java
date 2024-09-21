class StaticDemo1{
	int x = 30;
	static int y = 40;
	void fun(){
		System.out.println("In fun");
	}
	static void run(){
		System.out.println("In run");{
			StaticDemo1 obj = new StaticDemo1();
			System.out.println(obj.x);
			System.out.println(obj.y);
			obj.fun();
			obj.run();
		}
	}
}
