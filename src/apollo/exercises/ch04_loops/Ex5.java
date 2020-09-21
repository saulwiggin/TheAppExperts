package apollo.exercises.ch04_loops;

import java.nio.ByteBuffer;

public class Ex5 {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
	  // Call shiftLeft and print out the result with a few different arrays.
		int[] myargs = {6, 2, 5, 3};
		shiftLeft(myargs);
	}
	
	// Create a method called shiftLeft
    // Return an array that is "left shifted" by one -- 
	// so {6, 2, 5, 3} returns {2, 5, 3, 6}. Y
	// You may modify and return the given array, or return a new array. 
	public static void shiftLeft(int[] args){
		byte[] bytesArray;
		int[] shiftedArray;
		String[] tempArray;
		String out;
		int temp;
		int length;
		int max;
		int leftshift;

		shiftedArray = args;
		length = args.length;
		tempArray = new String[length];
		bytesArray = new byte[length];

		try{
			ByteBuffer bytes = ByteBuffer.wrap(args.toString().getBytes("ASCII"));
			// create byte array
			for(int i = 0; i < length; i++){
				out = Integer.toBinaryString(args[i]);
				System.out.println(out);
				byte b = (byte) args[i];
				// bit bit = ~b[0];
				leftshift = b >> 4;
				bytesArray[i-1] = b;
			}
			// print result
			System.out.println(bytesArray);
		} catch (Exception e){
			System.out.println("Exception occurred"+ e);
		}


	}
	// int a = {6, 2, 5, 3};
	// shiftLeft(a); // => {2, 5, 3, 6}
	// int b = {1, 2};
	// shiftLeft(b); // => {2, 1}
	// int c = {1};
	// shiftLeft(c); // => {1}

}

/*
 * SAMPLE OUTPUT:
 *  
 * {2, 5, 3, 6}
 * {2, 1}
 * {1}
 *  
 */