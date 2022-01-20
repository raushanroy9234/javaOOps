package nonstaticpart;

public class Vechile {

	String vechileName;
	int vechileNo;
	String vechileType;
	
	//method for initialization of non static variable
	public void getValue(String v1,int v2,String v3)
	{
		vechileName = v1;
		vechileNo = v2;
		vechileType = v3;
		
	}
	
	// initialization of non static variable b y constructor
	Vechile(String v1,int v2 , String v3)
	{
		vechileName = v1;
		vechileNo = v2;
		vechileType = v3;
	}
	
	
	public static void  start()
	{
		System.out.println("Star the vechile");
	}
	
	
	public static void stop()
	{
		System.out.println("Stop the vechile");
	}
	
	

}
