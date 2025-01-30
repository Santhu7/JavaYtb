package firstPackage;

public class Class_01 {
	
	
	/*
	 * Camel case
	 * Naming convention
	 * class and Interface -- capital letter  e.g : IsEven, OddOrEven
	 * constructor -- capital e.g : Human()
	 * variables and methods -- marks e.g : num, alpha, isAlpha(), badVision()
	 * constants -- all capital e.g : PIE, LAMBDA, MY_DATA
	 * 
	 */

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
         
		 we an use jshell use directly in cmd
		 to compile the code that we wrote in a file run the command 'javac filename.java' 
		 after compiling byte code (.class) file will get automatically generated
		 
		 JDK = JRE + JVM
		 
		 JDk --- is platform independent
		 JRE --- is platform independent
		 JVM --- is platform dependent
		 
		 JVM with Libraries is a part of JRE
		 
		 Data Base is for storing permanent purpose
		 Variable --- stores data in this Variable -- and this will have a type(int,char, string)
		 variables will have values assigned to that
		 
		 
		 Data Types:
		 Primitive:
		 Numeric
		 	Integer
		 		byte  -- 1 byte   --- Range = -2**(8-1) to 2**(8-1)-1
		 		short -- 2 bytes   --- Range = -2**(16-1) to 2**(16-1)-1
		 		int  -- 4 bytes   --- Range = -2**(32-1) to 2**(32-1)-1
		 		long  -- 8 bytes   --- Range = -2**(64-1) to 2**(64-1)-1 , if we define long we need to add l at the end of the value
		 	Floating Point
		 		float -- 4 bytes, if we define float we need to add f at the end of the value
		 		double -- 8 bytes  default is double, hence no need of adding d at the end
		 Boolean : True/False
		 Char   -- 2 bytes
		 Non Primitive:
		 	String,
		 
		 
		 */
		
		int n1 =5;
		int n2 = 7_0; //Under score are allowed in Java while defining the number
		int res = n1+n2;
		boolean hj = true;
		System.out.println(hj);
		System.out.println(res);
		System.out.println("Jshell can be used from CMD and we can write code directly");
		
		System.out.println("Source to Byte Code is converted by Java Compiler, then this byte code is given to JVM");
		System.out.println("Byte code to Machine Code is converted by Java Virtual Machine, this machine code is then given to JRE");
		
		System.out.println("---------------------------------");
		System.out.println("Type conversion");
		byte b1 = 2;
		int i1 = (byte)b1;
		System.out.println(i1);

		int i2 =127;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		System.out.println("If range is exceeded, we will get the modulo result, i.e., divide by range of data type that we wanted, in below example tried converting int to byte, since number is not in range of byte hence divide by 256(range of byte numbers)");
		int i3 =257;
		byte b3 = (byte)i3;
		System.out.println(b3);
		
		System.out.println("-----------------------------------");
		System.out.println("Type promotion");
		byte b4 = 20;
		byte b5 = 120;
		int res_byt_mul = b4*b5;
		System.out.println("Byte multiplied by byte we are getting int, since it got promoted");
		System.out.println(res_byt_mul);
		System.out.println("-----------------------------------");
		
		
	}

}
