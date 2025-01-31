package firstPackage;

class A{
	public void show() {
		System.out.println("Inside show method of class A");
	}
	public void config() {
		System.out.println("Inside config method of class A");
	}
}
class B extends A{
	public void show() {
		System.out.println("Inside show method of class B");
	}
}

class BasicCal{
	public int addTwoNums(int n1, int n2) {
		return n1+n2;
	}
	public int multTwoNums(int n1, int n2) {
		return n1*n2;
	}
}

class BasicCalPlusOne extends BasicCal{
	public int addTwoNums(int n1, int n2) {
		return n1+n2+1;
	}
}

public class Class_15 {

	public static void main(String[] args) {
		System.out.println("******** Method OverRiding ************");
		A obj1 = new A();
		obj1.show();
		B obj2 = new B();
		obj2.show();
		
		/*
		 * 
		 */
		BasicCal o1 = new BasicCal();
		BasicCalPlusOne o2 = new BasicCalPlusOne();
		System.out.println(o1.addTwoNums(3, 4)+"          "+o2.addTwoNums(3, 4));
	}

}
