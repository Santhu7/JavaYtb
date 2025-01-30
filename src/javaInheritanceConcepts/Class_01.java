package javaInheritanceConcepts;

class greet{
	
}

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
