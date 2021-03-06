package code;

import java.text.DecimalFormat;

import java.util.Scanner;

public class GroceryDiscountVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean start = true;
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".#");

		while (start == true) {
			
			System.out.print("Please enter the cost of your groceries or '0' to quit: ");
			
			double cost = in.nextDouble();
			
			if (cost == 0)
			{
				break;
			}
			
			if (cost < 10 || cost > 1000)
			{
				System.out.println("You are not eligible for a coupon at this time.");
				System.out.println("Please enter the cost of your groceries or '0' to quit: ");
			}
			else if (cost >= 10 && cost <= 60)
			{
				System.out.println("You win a discount coupon of $" + df.format(0.08 * cost) + "0. (8% of your purchase)");
			}
			else if (cost > 60 && cost <= 150)
			{
				System.out.println("You win a discount coupon of $" + df.format(0.1 * cost) + "0. (10% of your purchase)");
			}
			else if (cost > 150 && cost <= 210)
			{
				System.out.println("You win a discount coupon of $" + df.format(0.12 * cost) + "0. (12% of your purchase)");
			}
			else if (cost > 210)
			{
				System.out.println("You win a discount coupon of $" + df.format(0.14 * cost) + "0. (14% of your purchase)");
			}
			else
			{
				System.out.println("Error, non double input was entered therefore the program will end.");
			}
			
		}
			
	}

}
