package has_A_Relationship;

public class VechileDriver {
	//here we use composition because one class is completely dependent on another class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile v1 = new Vechile("Car", "4 Seater" , 240);
		System.out.println(v1.vechile_Type);
		System.out.println(v1.seater);
		System.out.println(v1.top_Speed);
		System.out.println(v1.e.engine_Type);
		System.out.println(v1.e.engine_Hp);
		System.out.println(v1.e.engine_No);
		
		System.out.println("===================================");
		Vechile v2 =new Vechile("Car","4 Seater", 250,new Engine("Petrol",2000,9999999));
		System.out.println(v2.vechile_Type);
		System.out.println(v2.seater);
		System.out.println(v2.top_Speed);
		System.out.println(v2.e1.engine_Type);
		System.out.println(v2.e1.engine_Hp);
		System.out.println(v2.e1.engine_No);
		
		
		v2.displayVechile();
		

	}

}
