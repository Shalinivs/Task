package Java2;

public class Number4pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4; // Number of rows
        int number = 1; // Starting number

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns
                System.out.print(number + " "); // Print the current number
                number++; // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
	
		
	}

// i need to understand this logic 
