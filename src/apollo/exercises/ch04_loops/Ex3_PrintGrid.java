package apollo.exercises.ch04_loops;

// Prints battleship coordinates
public class Ex3_PrintGrid {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		// A battleship board is a 2-dimensional grid with coordinates
		// like (0,0), (0,1), (0,2), etc.

		// Create a method called PrintCoordinates(int x, int y)
		// where x and y define the size of the board.  Print
		// all the possible coordinates in the board.
		//
		// Hint: loops can contain loops
		PrintCoordinates(10, 10);
	}

	public static void PrintCoordinates(int x, int y){
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				System.out.println("("+i+","+j+")");
			}
		}
	}
}


/*
 * SAMPLE OUTPUT (9, 9):
 *  
 *  (0, 0)
 *  (0, 1)
 *  (0, 2)
 *  (0, 3)
 *  ...
 *  (0, 9)
 *  (1, 0)
 *  (1, 2)
 *  (1, 3)
 *  ...
 *  (1, 9)
 *  
 */