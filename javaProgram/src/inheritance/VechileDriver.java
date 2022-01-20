package inheritance;

public class VechileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar e1 = new ElectricCar();
		System.out.println(e1.i);
		System.out.println(e1.j);
		System.out.println(e1.k);
		e1.run();
		e1.accelrate();
		e1.charge();

	}

}
