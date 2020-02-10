package code;

import java.util.Scanner;

public class CarCostCalculationVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the make and model, cost of the regular car, and the miles per gallon: ");
		String makeregular = scan.nextLine();
		String costregularStr = scan.nextLine();
		int costregular = Integer.parseInt(costregularStr);
		String mpgregularStr = scan.nextLine();
		int mpgregular = Integer.parseInt(mpgregularStr);
		
		System.out.print("Please enter the make and model, cost of the hybrid car, and the miles per gallon: ");
		String makehybrid = scan.nextLine();
		String costhybridStr = scan.nextLine();
		int costhybrid = Integer.parseInt(costhybridStr);
		String mpghybridStr = scan.nextLine();
		int mpghybrid = Integer.parseInt(mpghybridStr);
			
		System.out.print("Please enter the miles traveled in a year: ");
		int milestraveled = scan.nextInt();
		System.out.print("Please enter the cost per gallon of gas: ");
		double costgas = scan.nextDouble();
		
				
		
		double gascostregular = (milestraveled / mpgregular) * costgas;
		double gascosthybrid = (milestraveled / mpghybrid) * costgas;
		
		double oneyearcostregular = costregular + gascostregular;
		double oneyearcosthybrid = costhybrid + gascosthybrid;
		
		double twoyearcostregular = (costregular + (2 * gascostregular));
		double twoyearcosthybrid = (costhybrid + (2 * gascosthybrid));
		
		double threeyearcostregular = (costregular + (3 * gascostregular));
		double threeyearcosthybrid = (costhybrid + (3 * gascosthybrid));
		
		double fouryearcostregular = (costregular + (4 * gascostregular));
		double fouryearcosthybrid = (costhybrid + (4 * gascosthybrid));
		
		double fiveyearcostregular = (costregular + (5 * gascostregular));
		double fiveyearcosthybrid = (costhybrid + (5 * gascosthybrid));
			
		System.out.println("Cost to own " + makeregular + " after 1 year: " 
		+ oneyearcostregular + " for " + makehybrid + " : " + oneyearcosthybrid);
		
		System.out.println("Cost to own " + makeregular + "after 2 years: " 
		+ twoyearcostregular + " for " + makehybrid + " : " + twoyearcosthybrid);
		
		System.out.println("Cost to own " + makeregular + " after 3 years: " 
		+ threeyearcostregular + " for " + makehybrid + " : " + threeyearcosthybrid);
		
		System.out.println("Cost to own " + makeregular + " after 4 years: " 
		+ fouryearcostregular + " for " + makehybrid + " : " + fouryearcosthybrid);
		
		System.out.println("Cost to own " + makeregular + " after 5 years: " 
		+ fiveyearcostregular + " for " + makehybrid + " : " + fiveyearcosthybrid);
			
		if (fiveyearcostregular < fiveyearcosthybrid)
			System.out.println("The " + makeregular + " pays back after 5 years.");
		
		else
			System.out.println("The " + makehybrid + " pays back after 5 years.");
			
		
	}

}
