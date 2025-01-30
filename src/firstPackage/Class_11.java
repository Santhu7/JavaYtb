package firstPackage;

class Human{
	//private keyword if it is used, then that particular variable is limited to only the methods in the class in which it is defined
	//for all the instance variables it is recommended to use private key
	private String name = "Stranger";
	private int age = 15;
	private String qualification;
	
	public void setAge(int ag) {
		age = ag;
	}
	public void setName(String naam) {
		name = naam;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getQualification() {
		return qualification;
	}
	/*
	 * this is a keyword represents the current object that we are referring to
	 */
//	public void setQualification(String qualification, Human obj) {
//		Human Obj1 = obj;
//		Obj1.qualification = qualification;
//	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
}

public class Class_11 {

	public static void main(String[] args) {
		System.out.println("********** Encapsulation **********");
		Human h1 = new Human();
//		h1.name = "Sushanth";
//		h1.age = 13;
//		System.out.println(h1.age);
		System.out.println("Hi, "+h1.getName()+". you are of "+h1.getAge()+" years Old..!");
		
		Human h2 = new Human();
		h2.setAge(19);
		h2.setName("Dheeraj");
		System.out.println("Hi, "+h2.getName()+". you are of "+h2.getAge()+" years Old..!");
		
	}

}
