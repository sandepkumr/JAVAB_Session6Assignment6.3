/**
 * 
 */
package assignment6_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to search Array using binary search algorithm
 * 
 * @author Sandeep
 *
 */
public class Assignment6_3 {								// Class to search an Array using binary search

	static int[] arrayN; 									// Declaring Array
	
	/**
	 * Perform binary search on Array arrayN, and return the index position of the number
	 * 
	 * @param numberSearch
	 * @return String 
	 */
	static String binarySearchNumber(int numberSearch) {    // Method to perform binary search operation on an Array
		
		int first=0;										// Local variable to first index position
		int last=arrayN.length-1;							// Local variablle to last index position
		int mid;											// Local variable for mid
		
		while(first<=last) {								// Looping 
			mid=(first+last)/2;								// Calculating mid value of from first and last for every loop
			if(arrayN[mid]<numberSearch) {					// if value of element in mid index is less than number search then number is present in second half of array
				first=mid+1;								// Changing first variable to search after mid
			}
			else if(arrayN[mid]>numberSearch) {				// if value of element in mid index is greater than number search then number is present in first half of array
				last=mid-1;									// Changing last variable to index before mid ( that is search till mid )
			}
			else {
				return "Element found in the Array, And its index is :"+mid;// Return position if found
			}
		}
		return "Number not found in Array";					// If nothing returned , return number not found
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {				// main method
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);			// Creating scanner object
		
		System.out.println("Enter size of Array :");		// Size of the Array you want to initialize
		int size= scanner.nextInt();						// assigning size to local variable
		
		arrayN= new int[size];								// Initializing array with size  
		
		
		for (int number=1;number<=size;number++) {			// Loop to all numbers from 1 into array
			arrayN[number-1]=number;						// Assigning the value into Array
		}
		
		Arrays.sort(arrayN);								// Sort the array before performing binary search
		System.out.println(" Your array is "+Arrays.toString(arrayN)); // Print the sorted Array

		
		System.out.println(" Enter the number you want to search in Array :"); 	// Ask your input to enter the number to search for the Array
		System.out.println(binarySearchNumber(scanner.nextInt()));				// Call binary search method to return the result and print it
		
		scanner.close();									// close scanner object
		
		
	}

} // class closed
