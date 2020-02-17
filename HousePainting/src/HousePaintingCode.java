
import java.util.Scanner;

public class HousePaintingCode {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter the length of the house: ");
	int length = scan.nextInt();
	System.out.print("Please enter the width of the house: ");
	int width = scan.nextInt();
	System.out.print("Please enter the height of the house: ");
	int height = scan.nextInt();
	
	System.out.print("Please enter the number of windows on the house: ");
	int windows = scan.nextInt();
	System.out.print("Please enter the length of the windows on the house: ");
	int windowLength = scan.nextInt();
	System.out.print("Please enter the width of the windows on the house: ");
	int windowWidth = scan.nextInt();
	
	System.out.print("Please enter the number of doors on the house: ");
	int doors = scan.nextInt();
	System.out.print("Please enter the length of the doors on the house: ");
	int doorLength = scan.nextInt();
	System.out.print("Please enter the width of the doors on the house: ");
	int doorWidth = scan.nextInt();
	
	System.out.print("How much does it cost per SqFt: ");
	int costPerSqFt = scan.nextInt();
	
	
	int windowSqFt = windows * (windowLength * windowWidth);
	int doorSqFt = doors * (doorLength * doorWidth);
	int sideSqFt = (2 * (length * width)); 
	double peaksideSqFt = (2 * (length * width + ((0.5 * (length * (height - width))))));
	double houseSqFt = (sideSqFt + peaksideSqFt);
	
	System.out.println("The square footage of the house is: " + houseSqFt);
	System.out.println("The square footage of the doors is: " + doorSqFt);
	System.out.println("The square footage of the windows is: " + windowSqFt);
	
	double totalSqFt = (houseSqFt - (windowSqFt + doorSqFt));
	double totalCost = (totalSqFt * costPerSqFt);
	
	
	System.out.println("The total amount of square footage of everything is: " + totalSqFt);
	
	System.out.println("The total amount of cost to paint is: $" + totalCost);
	

	}
	
	
	
}
