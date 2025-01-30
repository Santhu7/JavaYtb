package firstPackage;
class Temp{
	public Temp() {
		System.out.println("Inside Constructor");
		System.out.println("Created a new Object, hence you are constructor is called");
	}
	public void prnt() {
		System.out.println("method prnt is called");
	}
}

public class Class_13 {
	public static void main(String[] args) {
		System.out.println("******** anonymus object ********");
		//object creation
		Temp obj1; // obj1 is the reference variable
		new Temp(); // this creates the new object in heap memory, but we cannot use this, since there is no reference variable
		new Temp().prnt(); // This creates one more object in heap memory and we can also call the methods inside the class

	}
}
