package constructor;

public class Human {
	String gender;
	String name;
	int age;
	int x = 10;
	
	
	Human(String a, String n, int a1)
	{
		gender = a;
		name = n;
		age = a1;
		System.out.println("Gender :: " + gender);
		System.out.println("name   :: " + name);
		System.out.println("age :: " + a1);
		
	}
	
	public static void male( String name, int age)
	{
	    System.out.println("Name :: " + name);
	    System.out.println("Age  :: " + age);
	}
	
	public static void male(String name, int age, int height, String o2level)
	{
		System.out.println("  Name   ::  " + name);
		System.out.println("  Age    ::  " + age);
		System.out.println("  Height ::  " + height);
		System.out.println("  o2level::  " + o2level);
	}
	
	


}
