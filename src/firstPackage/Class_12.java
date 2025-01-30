package firstPackage;

class Laptop{
	private String name;
	private int price;

	public Laptop()// default constructor
	{
	}
	
//	public Laptop()// default constructor
//	{
//		System.out.println("Inside Laptop class constructor");
//		name = "hello laptop";
//		price = 18000;
//	}
	
	public Laptop(String name, int price) // parameterized constructor
	{
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

public class Class_12 {
	public static void main(String[] args) {
		System.out.println("********* Constructor ************");
		/*
		 * Every time we create an Object we call the constructor
		 * Inside constructor we can write connections to a data base
		 * Inside constructor we can assign values to the Instance variables of the class
		 */
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		System.out.println(l1.getName());
		System.out.println(l1.getPrice());

		System.out.println("Constructor Overloading");
		Laptop l3 = new Laptop("Lenovo",9000);
		System.out.println(l3.getName());
		System.out.println(l3.getPrice());
		
		System.out.println("\n\n\nInheritance\n");
		
	}

}
