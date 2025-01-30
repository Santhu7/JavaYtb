package firstPackage;

import java.lang.classfile.instruction.SwitchCase;

public class Class_03 {
	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("Conditional Statements");
		int c =89;
		int d = 59;
		if(c>d) {
			System.out.println(c+" is greater");
		}
		else if (c<d) {
			System.out.println(d+" is greater");
		}
		else 
			System.out.println(c+" and "+d +" both are same");
		
		
		//Compare 3 numbers
		int e = 90;
		if(c>d && c>e) {
			System.out.println(c+" is greatest");
		}
		else if (d>e) {
			System.out.println(d+" is greatest");
		}
		else 
			System.out.println(e+" is greatest");
		
		
		System.out.println();
		System.out.println("Terinary Operator  ?: ");
		int g1 = 14;
		
		if (g1%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		System.out.println("Using Terinary Operator");
		String vf;
		vf = g1%2==0 ? "Even":"Odd";
		System.out.println(g1+" is "+vf);
		
		System.out.println("Examples of Terinary Operators");
		System.out.println(g1%2==0?g1%6==0?"Divisble by 6 and Even":"Just Even":"Odd");
		
		System.out.println("-----------------------\n");
		System.out.println("-----------------------");
		System.out.println("Switch case statements");
		
		
		int dy = 1;
		switch(dy){
		case 1:
			System.out.println("This is Sunday");
			System.out.println("Holiday");
			break;
		case 2:
			System.out.println("This is MOnday");
			break;
		case 3:
			System.out.println("This is Tue");
			break;
		case 4:
			System.out.println("This is Wed");
			break;
		case 5:
			System.out.println("This is Thu");
			break;
		case 6:
			System.out.println("This is Fri");
			break;
		case 7:
			System.out.println("This is Sat");
			break;
		default:
			System.out.println("Wrong Input");
		}
		System.out.println("-----------------------\n");
		System.out.println("-----------------------");
		
		
		
		System.out.println("Loops in JAVA : while, do while, for");
		
		
		System.out.println("While loop");
		int it1 =7;
		while(it1>=1) {
			System.out.println(it1);
			it1-=1;
		}
		
		
		System.out.println("Do while loop");
		int it2 =7;
		
		do {
			System.out.println(it2);
			it2-=1;
		}while(it2>=1);
		
		
		System.out.println("For Loop");
		for(int it3 =1;it3<4;it3++) {
			System.out.println("Day "+it3);
			for(int it4=9;it4<=18;it4+=2) {
				System.out.println("Time "+it4);	
			}
			
		}
		System.out.println("-----------------------\n");
		System.out.println("-----------------------");
		
	}

}
