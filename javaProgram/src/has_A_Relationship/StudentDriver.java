package has_A_Relationship;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are using aggregation which means one class is partially dependent on another class
		Address a1 = new Address("silicon city", 801301);
		Student st = new Student("Raushan roy", "bsc it",a1);
		System.out.println("Student Name :: " + st.name);
		System.out.println("Student Stream :: " + st.stream);
        System.out.println(a1.city);
        System.out.println(st.ad.city);
	}

}
