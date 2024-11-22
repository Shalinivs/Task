package Java2;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number of month");
		         int months=sc.nextInt();
		         
		         System.out.print("Enter the room rent per month: ");
		         double rentPerMonth = sc.nextDouble();
		
		        System.out.println("Enter the number of days");
		        int days=sc.nextInt();
		
		        double totalCost = 0.0;

		        // Loop to calculate the total cost based on the number of months
		        for (int i = 1; i <= months; i++) {
		            System.out.print("Enter the month number (1 for January, 2 for February, ..., 12 for December) for month " + i + ": ");
		            int month = sc.nextInt();

		       
		            switch (month) {
		                case 4: // April
		                case 5: // May
		                case 6: // June
		                case 11: // November
		                case 12: // December
		                    totalCost += rentPerMonth * 1.2; // Apply 20% increase
		                    break;
		                default:
		                    totalCost += rentPerMonth; // No increase
		                    break;
		            }
		        }

		        // Add cost for additional days stayed (assuming the number of days is for the last month)
		        double dailyRent = rentPerMonth / 30; // Daily rent calculation
		        totalCost += (days * dailyRent);

		        // Display the total cost
		        System.out.printf("Total cost for the stay: %.2f\n", totalCost);

		        sc.close(); // Close the scanner
		    }
		
		        
		        
	}


