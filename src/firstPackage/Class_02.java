package firstPackage;

public class Class_02 {

	public static void main(String[] args) {
		System.out.println("---------------------------");
		System.out.println("Assignment Operators in JAVA");
		int n1 = 3;
		System.out.println("Initial Value of n1 :"+n1);
		int n2 =5;
		int res1, res2;
		res1 = n1/n2;
		res2 = n1%n2;
		System.out.println("We get Quotient if we simply do division : "+res1);
		System.out.println("We get remainder if we use modulo(%) operator : "+res2);

		n1++;//Post Increment
		++n1; //Pre Increment
		n1 += 8;
		n1 -= 7;
		n1 /= 2;
		n1 *= 6;

		--n1; // decrement


		System.out.println("After all operations above n1 :"+n1);
		System.out.println("---------------------------");
		System.out.println("\n---------------------------\n");
		System.out.println("Relational Operators");

		/*
		  '=' -- Assignment operator
		  '==' -- Comparison Operator

		 */

		int x = 7;
		int y = 6;
		boolean res3 = x>y;
		boolean res4 = x ==y;
		boolean res5 = x !=y;

		System.out.println("Is "+x+" greater than "+y+" : "+res3);


		System.out.println("Is "+x+" not equal "+y+" : "+res5);
		System.out.println("Is "+x+" equal "+y+" : "+res4);
		System.out.println("---------------------------");
		System.out.println("\n---------------------------\n");
		System.out.println("Logical Operators 'AND', 'OR', 'NOT'");
		System.out.println("&&, || short circuit operators");
		System.out.println("Short circuit operators save time, in && if first is false then it won't check for second one, in || if first is true it won't check for second condition");
		double d1 = 2.3;
		double d2 =9.3;
		boolean res6 = d1>d2;
		
		
		System.out.println("res5 : "+res5);
		System.out.println("res5 : "+res6);
		System.out.println("res5 AND res6 :"+(res6 & res5));
		System.out.println("res5 OR res6 :"+(res6 | res5));

		System.out.println("---------------------------");
		System.out.println("\n---------------------------\n");
		




	}

}
