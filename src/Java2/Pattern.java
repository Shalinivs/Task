package Java2;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[][] pattern = {
		            {"*", "*"},
		            {"*","*"},
		            {"*"},
		            {"*","*"},
		            {"*", "*"}
		        };

		        // Loop through the rows of the pattern
		        for (int i = 0; i < pattern.length; i++) {
		            // Loop through the columns of each row
		            for (int j = 0; j < pattern[i].length; j++) {
		                System.out.print(pattern[i][j] + " "); // Print each star followed by a space
		            }
		            System.out.println(); // Move to the next line after each row
		        }
		    }
		
	}


