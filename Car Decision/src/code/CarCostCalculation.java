package code;

import java.util.Scanner;


public class CarCostCalculation {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter the cost of the regular car: ");
	int costregular = scan.nextInt();
	System.out.print("Please enter the miles per gallon of the regular car: ");
	int mpgregular = scan.nextInt();
		
	System.out.print("Please enter the cost of the hybrid car: ");
	int costhybrid = scan.nextInt();
	System.out.print("Please enter the miles per gallon of the hybrid car: ");
	int mpghybrid = scan.nextInt();
		
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
		
	System.out.println("Cost to own after 1 year for regular car: " 
	+ oneyearcostregular + " for hybrid car: " + oneyearcosthybrid);
	
	System.out.println("Cost to own after 2 years for regular car: " 
	+ twoyearcostregular + " for hybrid car: " + twoyearcosthybrid);
	
	System.out.println("Cost to own after 3 years for regular car: " 
	+ threeyearcostregular + " for hybrid car: " + threeyearcosthybrid);
	
	System.out.println("Cost to own after 4 years for regular car: " 
	+ fouryearcostregular + " for hybrid car: " + fouryearcosthybrid);
	
	System.out.println("Cost to own after 5 years for regular car: " 
	+ fiveyearcostregular + " for hybrid car: " + fiveyearcosthybrid);
		
	if (fiveyearcostregular < fiveyearcosthybrid)
		System.out.println("The regular car pays back after 5 years.");
	
	else
		System.out.println("The hybrid car pays back after 5 years.");
		

	}

}
