import java.io.*;
class program7{
	public static void main(String[]args)throws IOexception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name = br.readLine();
		System.out.println("Name:" + name);
		String compname = br.readLine();
		System.out.println("Company name:" + compname);
	}
}

