package typeCasting;

public class FruitDriver {
	//WE CAN ACCESS ONLY PARENT MEMBERS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Mango();
		f.test();
		System.out.println(f.i);
		System.out.println("===============");
		Object o = new Mango();
		System.out.println(0);

	}

}
