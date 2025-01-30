package firstPackage;


/*
 Method Overloading  -- For methods in JAVA We can have different number of parameters or Same number of parameters of different type
 */
class TestSample{
	//Instance Variable
	int n1 = 10;
	
	public void greetings(String nameOfYours) {
		int v1 = 90; // Local Variable
		System.out.println("Hello "+nameOfYours+"...!");
	}
	
	
}

/*
 Stack Memory(methods) -- Last In First Out  -- Every Method will have it's own stack
 stores local variables as key value pair with key as variable name and values as it value
 stores reference variable (where we define an object with new keyword) --- key as the reference variable and the value is address of the reference object
 
 
 
 Heap Memory -- for classes
 Store Instance variable defined at class level and the methods in the class
 */

public class Class_05 {

	public static void main(String[] args) {
		TestSample obj1 = new TestSample();
		obj1.n1 = 100;
		
		System.out.println("Instance 1 Class Variable value : "+(obj1.n1));

		TestSample obj2 = new TestSample();
		obj2.n1 = 200;
		
		System.out.println("Instance 2 class variable value : "+(obj2.n1));
		
		TestSample obj3 = new TestSample();
		System.out.println("Instance 3 Class variable value : "+obj3.n1);
		
		obj3.greetings("Santhosh");
	}

}
