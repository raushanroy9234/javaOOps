package has_A_Relationship;

public class Vechile {
	String vechile_Type;
	String seater;
	int top_Speed ;
	Engine e = new Engine("Diesel type", 1500 ,223344);
	Engine e1;
	
	
	public Vechile()
	{
		
	}

	
	Vechile(String vechile_Type,String seater,int top_Speed)
	{
		this.vechile_Type = vechile_Type;
		this.seater = seater;
		this.top_Speed = top_Speed;
	}
	
	Vechile(String vechile_Type,String seater,int top_Speed,Engine e1)
	{
		this.vechile_Type = vechile_Type;
		this.seater = seater;
		this.top_Speed = top_Speed;
		this.e1 = e1;
	}
	
	public  void displayVechile()
	{
		System.out.println("vechile type :::" + this.vechile_Type);
		System.out.println("vechile seater :::" + this.seater);
		System.out.println("vechile type :::" + this.top_Speed);
		System.out.println("engine ::  " + this.e1.engine_Hp);
		System.out.println("engine   ::: " + this.e1.engine_No);
		System.out.println("engine ::: " + this.e1.engine_Type);
	}
}
