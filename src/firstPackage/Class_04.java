package firstPackage;

class emptyClass{

}

class Caluculator{
	int a =9; // Class Variable -- Instance variable
	/*
	====Method Overloading===

	 In java we can have methods with same name but with different number of arguments in it, this is called Method Overloading
	 */
	public int addNums(int n1,int n2){
		//n1, n2 -- Local Variables
		return n1+n2;
	}

	//WIth different data but with same number of arguments we can have the method defined
	
	public double addNums(double n1,int n2, int n3){
		return n1+n2+n3;
	}
	
	// we can have same method name with different number of parameters
	// we can also have same parameters(different data type arguments) but with different data type as return value
			
	
	public int addNums(int n1,int n2, int n3){
		return n1+n2+n3;
	}
	
	public int addNums(int n1,int n2, int n3, int n4){
		return n1+n2+n3;
	}

}

class AIresponse{
	public void playMusic() {
		System.out.println("Playing Music");
	}

	public String getMeAPen(int cost) {
		if (cost>9)
			return "Here is your Pen";
		return "Price not matched, hence nothing for you";
	}
}

/*
Inside JVM we have stack memory and heap memory
Stack -- Last in first out , stack in high level will have 2 columns in memory, one is used for storing variable name, and other is used to store the value of the respective variable
	Every method will have it own stack
	In stack we store data in a sequence
Heap --- Heap memory can expand, i.e., memory expands
*/


public class Class_04 {
	public static void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("Object Oriented Programming concepts");
		System.out.println("In JAVA to define objects we need class");
		System.out.println("Every object will have properties and it's own behaviour");
		System.out.println("JVM creates the Object in side class file");
		//Class is created by us, and is compiled by compiler and is converted to byte code by and given to JVM and then JVM gives the Object by converting byte code to Machine code and this Machine code is given to JRE


		Caluculator cal1 = new Caluculator();

		//cal1 -- reference variable of type caluculator, using this reference variables we can call methods of the particular class and also use the properties of the class
		//new Caluculator() --- Object of class Caluculator

		int num1 = 5;
		int num2 = 15;
		
		//num1, num2 are primitive variables, since data type int is primitive
		//num1, num2 are local variables
		
		System.out.println(cal1.a);
		int res1 =cal1.addNums(num1,num2);
		System.out.println(res1);
		int res2 = cal1.addNums(4, 6);
		System.out.println(res2);
				

		System.out.println("-------------------------\n");
		System.out.println("-------------------------");

		System.out.println("More examples of Classes");

		AIresponse aiAns = new AIresponse();

		aiAns.playMusic();
		String p1 = aiAns.getMeAPen(9);
		System.out.println(p1);

		String p2 = aiAns.getMeAPen(19);
		System.out.println(p2);
		System.out.println("-------------------------\n");
		System.out.println("-------------------------");

		System.out.println("static keyword while definig the key word");

	}

}
