package code;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".#");
		
		System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		double cost = sc.nextDouble();
		
		if (cost < 10 && cost > 0)
		{
			System.out.println("You are not eligible for a coupon at this time.");
		}
		else if (cost >= 10 && cost <= 60)
		{
			System.out.println("You win a discount coupon of $" + df.format(0.08 * cost) + ". (8% of your purchase)");
		}
		else if (cost > 60 && cost <= 150)
		{
			System.out.println("You win a discount coupon of $" + df.format(0.1 * cost) + ". (10% of your purchase)");
		}
		else if (cost > 150 && cost <= 210)
		{
			System.out.println("You win a discount coupon of $" + df.format(0.12 * cost) + ". (12% of your purchase)");
		}
		else if (cost > 210)
		{
			System.out.println("You win a discount coupon of $" + df.format(0.14 * cost) + ". (14% of your purchase)");
		}
		else if (cost == 0)
		{
			
		}
		
	}

}