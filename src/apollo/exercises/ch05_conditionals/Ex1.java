package apollo.exercises.ch05_conditionals;

public class Ex1_FizzBuzz {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
	  // Call fizzBuzz method and verify correct output
		fizzBuzz(args);
	}
	
	// Write a method that prints the numbers from 1 to 100. 
    // But for multiples of three print �Fizz� instead of the number,
	// and for the multiples of five print �Buzz�. For numbers which 
	// are multiples of both three and five print �FizzBuzz�."
	public static void fizzBuzz(String[] args){
		for(int i = 0; i < 100; i++){
			if(i % 3 == 0){
				System.out.println("Fizz");
			}
			 else if( i % 5 == 0){
				System.out.println("Buzz");
			} else if ( i % 5 == 0 && i % 3 == 0){
			 	System.out.println("FizzBuzz");
			} else {
			 	System.out.println(i);
			}
		}
	}
}

/*
 * SAMPLE OUTPUT:
 *  
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * FizzBuzz
 * ...
 * 98
 * Fizz
 * FizzBuzz
 *  
 */