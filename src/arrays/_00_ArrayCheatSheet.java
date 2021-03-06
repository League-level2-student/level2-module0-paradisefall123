package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Wendy", "Luna", "Ashley", "Alex", "George"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Mr. Ray";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		//6. make an array of 50 integers
		int[] integers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rannum = new Random();
		//making a list of 50 random numbers
		for (int i = 0; i < integers.length; i++) {
			int r = rannum.nextInt(50);//retrieving the next random number and setting the limit to 50
			integers[i] = r;//setting the next array element to my random number and storing
		}


		//8. without printing the entire array, print only the smallest number in the array
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < integers.length; i++) { //
			int temp = integers[i]; // retrieving the variables
			if (temp < smallest) {
				smallest = temp; //replace and store
			}
		}
		System.out.println("Smallest number= " + smallest);

		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < integers.length; i++) { //
			System.out.println("Array element; "+i + ": "+integers[i]); //printing the random number stored at index i in the array integer
		}

		//10. print the largest number in the array.
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < integers.length; i++) { //
			int temp = integers[i]; // retrieving the variables
			if (temp > largest) {
				largest = temp; //replace and store
			}

		}
		System.out.println("Largest number= " + largest);
	}
}
