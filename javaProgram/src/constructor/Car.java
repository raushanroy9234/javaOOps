package constructor;

public class Car 
{
	String name;
	String color;
	int price;
	
	/*
	 * public static  Car obj()
	{
	  return new Car();
	}
	 */
	
	public Car setValue(String name,String color, int price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
		return this;
		
	}
	
	Car(String name)
	{
		this.name = name;
	}
	
	Car(String name, String color)
	{
		this(name);
		this.color = color;
	}
	Car(String name, String color, int price)
	{
		this(name,color);
		this.price = price;
	}
	
	public void displayValue()
	{
		System.out.println("car name is :: " + name);
		System.out.println("car color is :: " + color);
		System.out.println("car price is :: " + price);
	}
}
