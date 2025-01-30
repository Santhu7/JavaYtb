package firstPackage;

class MobilePhone{
	String name;
	int price;
	String className = "MobilePhone";
	/*
	 * constructor
	 * Every time when we create an object, we call the constructor and initialize the variables, but for static things no need of initializing for every object
	 * Hence we use static block
	 * static block executes only once and executes first, since every time we create an object, first the class loads and the object get instantiated
	 * i.e., every time we create an object, first class will load, then object get's initialized
	 * class will load only once, Inside JVM we will have 'Class Loader' inside we will have all the classes which are loaded, so for first object class will get loaded in Class Loader from the library
	 * Every time we load a class, we call the static block, hence static block will get executed only once
	 * To sum everything, When we create an Object, class loads first and sits in Class Loader inside JVM and static block is executed and then the object gets created, and then constructor will get called
	 * If we don't create any object of a class, it won't even call the static block
	 */
	
	static {
		System.out.println("Inside Static block of MobilePhone class");
		String type = "Smart Phone";
	}
	public MobilePhone() {
		System.out.println("Inside Constructor Block");
		name = "";
		price = 100;
	}
	
}
/*
 *  If we don't create any object of a class, it won't even call the static block
 */
class MobilePhone2{
	static {
		System.out.println("Inside Static block of MobilePhone2 class");
	}
}
/*
 *  So without creating an object, if we want to call the class, we can use Class.forName(className)
 */
class MobilePhone3{
	static {
		System.out.println("Inside Static block of MobilePhone3 class");
	}
}

public class Class_10 {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("************ Static block Concept *************");
		MobilePhone m1 = new MobilePhone();
		MobilePhone m2 = new MobilePhone();
		
		Class.forName("MobilePhone3");
		
	}

}
