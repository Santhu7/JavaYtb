package firstPackage;

public class Class_08 {

	public static void main(String[] args) {
		System.out.println("************** String ****************");
		/*
		 * String in Java is a class
		 */
		
		String s1 = "Hello";
		System.out.println(s1);
		
		String strObj = new String("My name"); // string Object
		System.out.println(strObj);
		
		System.out.println("Hash code .hashCode()");
		System.out.println(strObj.hashCode());
		
		System.out.println("Hi "+strObj);
		System.out.println(strObj.charAt(1));
		System.out.println("String is Immutable");
		
		strObj = strObj + " concatenated and changed";
		System.out.println(strObj);
		
		String s2 = "Hello";
		
		System.out.println("Both s1 and s2 have same value so in heap memory, both s1, s2 will point out to same address, i.e, two Objects will not get created in heap, in heap we have 'String Constant pool'");
		System.out.println(s1==s2);
		
		System.out.println("But for strObj we will have a new Object : "+strObj+", i.e, a new object will get created with same key and value with the latest Updated one, first address is eligible for garbage collection");
		
		System.out.println("String is Immutable, but we have Strings which are mutable if we create using String Buffer/ String Builder");
		
		
		System.out.println();
		System.out.println("******** String BUffer *********");
		System.out.println("Using String Buffer we can have String which are Mutable");
		StringBuffer str2 = new StringBuffer();
		System.out.println("Capacity str2 : "+str2.capacity());
		System.out.println("Length : "+str2.length());
		System.out.println("String buffer gives us an extra space of 16");
		
		StringBuffer str3 = new StringBuffer("My initial name");
		System.out.println("Capacity str3 : "+str3.capacity());
		/*
		 * StringBuffer and StringBuilder both are same, except fot
		 * StrignBuffer is thread safe and StringBuilder is not thread safe
		 */
		
	}

}
