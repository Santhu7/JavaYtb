package javaInheritanceConcepts;


//This method and super method keyword in Java
class A extends Object{//Every class in Java extends to Object class
	public A() {
		super(); // Every class in Java extends to Object class -- Here super class calls the constructor of Object class
		System.out.println("Inside default constructor Class A");
	}
	public A(int gr) {
		super();
		System.out.println("Inside parameterized constructor of Class A");
	}

}

class B extends A{

	public B() {
		super(); // This function calls the constructor(default one -- Non parameterized) of super class
		//		super(5); // This prints default constructor of B and parameterized constructor of A
		System.out.println("Inside default constructor Class B");
	}

	public B(int num) {
		super(num);
//		this(); //This will execute both default constructor of B, Parameterized constructor of B and also the parent class constructor
		System.out.println("Inside parameterzed constructor of Class B");
	}

}
public class NewCalForFY {
	public static void main(String[] args) {
		B obj1 = new B();
		/*
		 * Since B is sub class of A, when we create and object of B, even the constructor of A(super class) is also called
		 * i.e., whenever we create an object of a class, it will call constructor of that class and also the parent class
		 */
		System.out.println("---------------------------");
		B obj2 = new B();
		System.out.println("---------------------------");
		/*
		 * Every constructor of Java has the default method of super(), even if we don't write that inside constructor/Inside default constructor
		 * This super method calls the default constructor of the parent class
		 */
		
		/*
		 * How to execute both(default and parameterized) the constructors of Class B and default constructor of A, with one Object
		 * that can happen by using this() method in parameterized constructor
		 */
		B obj3 = new B(6);
	}
}
