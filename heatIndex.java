package code;

import java.util.Scanner;
import java.text.DecimalFormat;

public class heatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("                                    NOAA's Nation Weather Service");
		System.out.println("                                             Heat Index");
		System.out.println(" Relative Humidity(%)(Left Side)                                      Temperature in (F)");
		
		System.out.printf("     ");
		for (double h = 80; h <= 110; h+=2) 
		{
			System.out.printf("%5.0f",h);
		}
		System.out.println();
		System.out.println("__________________________________________________________________"
				+ "____________________");
		//prints the table using nested loop
		for (double r = 40; r <= 100; r+=5)
		{
			System.out.printf("%5.0f | ",r);
			
			for (double c = 80; c <= 110; c+=2)
			{
				
				double res = (-42.379 + 2.04901523*c + 10.14333127*r - .22475541*c*r - .00683783*c*c - 
						.05481717*r*r + .00122874*c*c*r + .00085282*c*r*r - .00000199*c*c*r*r);
				
				if (res < 137) 
				{
					System.out.printf("%5.0f", res);
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println(); 
		}//for loop
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		
		boolean i = true;
		
		while (i == true) {
			System.out.print("Enter the temperature or 0 to end: ");
			int temp = sc.nextInt();
			
			if (temp == 0)
			{
				break;
			}
			else
			{

			
			System.out.print("Enter relative humidity: ");
			int hum = sc.nextInt();
			
			double thi = -42.379 + 2.04901523*temp + 10.14333127*hum - .22475541*temp*hum 
					- .00683783*temp*temp - .05481717*hum*hum + .00122874*temp*temp*hum + 
					.00085282*temp*hum*hum - .00000199*temp*temp*hum*hum;
			
			
			if (thi <= 90)
			{
				System.out.println("The THI for a temperature of " + temp + " and relative humidity of " 
						+ hum + " is: " + df.format(thi) + " Advisory: Caution");
			}
			else if (thi < 105)
			{
				System.out.println("The THI for a temperature of " + temp + " and relative humidity of " 
						+ hum + " is: " + df.format(thi) + " Advisory: Extreme Caution");
			}
			else if (thi < 126)
			{
				System.out.println("The THI for a temperature of " + temp + " and relative humidity of " 
						+ hum + " is: " + df.format(thi) + " Advisory: Danger");
			}
			else if (temp == 0 || hum == 0)
			{
				break;
			}
			
			}
		}//while loop
		
		sc.close();
		
	}//main

}//class
