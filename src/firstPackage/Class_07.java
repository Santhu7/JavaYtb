package firstPackage;

class Student{
	int rollNumber;
	char section;
	String name;
}

//Exceptions are Runtime errors

public class Class_07 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Student 1";
		s1.rollNumber = 10;
		s1.section = 'A';
		
		Student s2 = new Student();
		s2.name = "Student 2";
		s2.rollNumber = 14;
		s2.section = 'B';
		
		Student s3 = new Student();
		s3.name = "Student 3";
		s3.rollNumber = 12;
		s3.section = 'B';
		
		//creating an array of type Student
		Student studentsArray1[] = new Student[3];
		studentsArray1[0] = s1;
		studentsArray1[1] = s2;
		studentsArray1[2] = s3;
		
		for(int i = 0;i<studentsArray1.length;i++) {
			System.out.println(studentsArray1[i].name+", "+studentsArray1[i].rollNumber+", "+studentsArray1[i].section);
		}
		System.out.println();
		
		//for each loop
		System.out.println("*********** For Each Loop ************");
		int arr3[] = new int[6];
		for(int i =0 ;i< arr3.length;i++) {
			arr3[i] = (int)(Math.random()*10);
		}
		
		System.out.println();
		for(int o : arr3) {
			System.out.print(o+" ");
		}
		
		System.out.println();
		for (Student student : studentsArray1) {
			System.out.println(student.name+", "+student.rollNumber+", "+student.section);
		}
		System.out.println("********************************");
	}

}
