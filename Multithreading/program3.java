class ThreadDemo extends Thread{
	ThreadDemo(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(2000);
		}catch(Exception e){
		}
	}
}
class Client{
	public static void main(String[]args){
		
		System.out.println(Thread.currentThread());
		ThreadDemo tg = new ThreadDemo();
		ThreadGroup tg = new ThreadGroup("Instagram");
		ThreadGroup SubTg1 = new ThreadGruop(tg,"Reels");
		ThreadGroup SubTg2 = new ThreadGroup(tg,"post");
		ThreadDemo t1 = new ThreadGroup(ubTg1,"Shashi");
		ThreadDemo t2 = new ThreadGroup(subTg2,"Ashish");
		ThreadDemo t3 = new ThreadGroup(subTg3,"Kanha");
		ThreadDemo t4 = new ThreadGroup(subTg4,"Rahul");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(tg.getparent().getName());
		System.out.println(tg.activeCount());
		System.out.println(subTg2.activeCount());
		System.out.println(Tg1.getparent().getName());
	}
}
