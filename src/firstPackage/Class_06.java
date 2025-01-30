package firstPackage;

public class Class_06 {

	public static void main(String[] args) {
		// Array
		int arr1[] = {3,4,5,2,3};
		System.out.println(arr1); //prints the memory location
		System.out.println(arr1[2]);
		arr1[2] = 90; //reassigning or Updating the values
		System.out.println(arr1[2]);
		
		
		//Dynamic array
		int arr2[] = new int[6];
		System.out.println("Since we didn't assigned values to this array, by default the values would be zero's");
		System.out.println(arr2[3]);
		
		arr2[0] = 9;
		arr2[1] = 18;
		arr2[2] = 27;
		
		
		System.out.println("Multi Dimensional arrays");
		int arr3[][] = new int[3][4];
		
		for(int i =0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}
		
		//Math.random() -- returns decimal values
		int tempVar = 0;
		for(int i =0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				tempVar = (int)(Math.random()*10);
				System.out.print(tempVar+" ");
				arr3[i][j] = tempVar;
			}
			System.out.println();
		}
		
		
		System.out.println("No of rows in an array is retrived by using arrayName.length. For arr3 lenght is : "+arr3.length);
		System.out.println();
		System.out.println("Jagged Array --- Elements size is different inside an Array -- if we have different size of elements");
		
		int arr4[][] = new int[3][];
		
		arr4[0] = new int[4];
		arr4[1] = new int[2];
		arr4[2] = new int[3];
		
		for(int i = 0;i<arr4.length;i++) {
			for(int j = 0;j<arr4[i].length;j++) {
				arr4[i][j] = (int)(Math.random() *10);
			}
		}
		
		for(int i = 0;i<arr4.length;i++) {
			for(int j = 0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("3-D array");
		int arr5[][][] = new int[3][4][5];
		
		
		/*
		 [[[  |    |    ]] | [[  |    |   ]] | [[  |    |   ] ] | [[  |     |    ]]]
		 */
		
		
		System.out.println("Drawbacks of Arrays");
		
		/*
		 * Only if we have fixed number of values then arrays are the first preference 
		 *Drawbacks of Arrays:
		 *Size is Fixed
		 *Time to search the elements which we have to traverse through all the elements
		 *Only limited to Single data type -- we can use data type as object(Object arr6[] = new Object[4];)
		 */
		
		// All the above drawbacks can be overcome  by collections
		
		
		
		
		
		
	}

}
