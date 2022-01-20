package staticpart;

public class Program6 {
	static int i;
	static
	{
		System.out.println("thils is static block 1");
	}
	
	public static void main(String [] args)
	{
		System.out.println("this is main method");
	}
	
	static
	{
		System.out.println("this is static block 2");
	}

}
