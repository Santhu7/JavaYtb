package javaInheritanceConcepts;
import firstPackage.Class_03;
class greet{
	
}

//In Java Multiple Inheritance will not work
// A<--B<--C  == A is parent of B, B is parent of C this will work
//A<--B, C<--B === If both A and C are parents of B, then this won't work in Java, since if we have same methods in both A and C, then if we try calling from B object, then Java will get confused to which parent it has to go, hence Multiple Inheritance will not work in Java

public class Class_01 {
	public static void main(String[] args) {
		ScientificCal ad1 = new ScientificCal();
		int r1,r2,r3,r4,r5;
		r1 = ad1.add(5, 8);
		r2 = ad1.sub(15, 8);
		r3 = ad1.mult(5, 8);
		r4 = ad1.div(15, 8);
		r5 = ad1.powerOfTwoNums(2, 3);
		System.out.println(r1 + " "+r2+" "+r3+" "+r4+" "+r5);
	}
}
