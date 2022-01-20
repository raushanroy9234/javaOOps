package methodOverloading;

public class Vechile {
	
	
	public static void car(String name,int milenge)
	{
		System.out.println("Car name :: " + name);
		System.out.println("Car milenge :: " + milenge);
	}
	
	public static void car(String name , int milenge, String color)
	{
		System.out.println("Car name :: " + name);
		System.out.println("Car milenge :: " + milenge);
		System.out.println("Car color :: " + color);
	}

}
