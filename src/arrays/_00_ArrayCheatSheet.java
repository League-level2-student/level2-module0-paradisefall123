package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names={"Wendy", "Luna", "Ashley", "Alex", "George"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="Mr. Ray";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] integers=new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rannum=new Random(50);
		//making a list of 50 random numbers
		for(int i=0;i<integers.length;i++){
			int r=rannum.nextInt();//retrieving the next random number
			integers[i]=r;//setting the next array element to my random number
		}


		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
