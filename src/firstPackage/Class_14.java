package firstPackage;

class Calc{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
	
}


public class Class_14 {
	public static void main(String[] args) {
		System.out.println("********* Inheritance ************");
		/*
		 * copy the feature to child/derived/super class from parent/base/sub class
		 * i.e., we can we the features of  the parent class
		 */
		Laptop l2 = new Laptop();
		l2.setName("Dell");
		System.out.println(l2.getName());
	}

}
