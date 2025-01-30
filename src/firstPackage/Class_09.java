package firstPackage;

class Mobile{
	//Instance variable
	String brand;
	int price;
	static String mobileType;
	public void mobileInfo() {
		String msg ="Your Mobile"; //local variables
		System.out.println(msg+" -- Brand : "+brand +", price : "+price+", mobile type : "+mobileType);
	}
	
	public static void mobileInfo2() {
		System.out.println("This is start of Static Method");
		String greeting ="hello"; //local variables
		System.out.println(greeting+" "+mobileType);
		System.out.println("This is end of Static Method");
	}
}

public class Class_09 {

	public static void main(String[] args) {
		/*
		 * static keyword
		 * static keyword is used for memory management, static keyword is used to share the same variable/ method for a given class
		 * static variables can be called using the class name/ reference obj but preferred one is Class name
		 * If we change static variable value it effects everywhere i.e., for the created instances the value changes
		 */
		Mobile m1 = new Mobile();
		m1.brand = "Samsung";
		m1.price = 3500;
		Mobile.mobileType = "Smart Phone";
		m1.mobileInfo();
		
		Mobile m2 = new Mobile();
		m2.brand = "Motorola";
		m2.price = 500;
		Mobile.mobileType = "Smart phone";

		Mobile m3 = new Mobile();
		m3.brand = "Nokia";
		m3.price = 3900;
		Mobile.mobileType = "Basic Phone";
		
		Mobile m4 = new Mobile();
		m4.brand = "MI";
		m4.price = 900;
		
		m2.mobileInfo();
		m3.mobileInfo();
		m4.mobileInfo();
		
		
		
		/*
		 * 
		 * When ever if we want to work with Non static method, we need to create an object of that class and then apply method
		 * But we can call a static method directly with the help of a class name
		 * Also we can use static variable inside a static method, but we cannot use instance variables inside a static method, since instance variables(Non static variables) are different for different objects that we create, hence we cannot use an Instance variables inside a static method
		 * Main method is static because, if that is not static, we need to create an Object of the class in which main is written, but to create object, some where the execution should start, we all know main() is the starting point of the execution, hence main method is defined as static
		 * 
		 */
		
//		Mobile.mobieInfo();
		Mobile.mobileInfo2();
	}

}
