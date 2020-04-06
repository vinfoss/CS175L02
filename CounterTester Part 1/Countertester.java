package code;

public class Countertester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter venue = new Counter();
		
		for (int i = 0; i <= 10; i++)
		{
			venue.click();	
		}
		
		for (int i = 0; i <= 5; i++)
		{
			venue.unclick();
		}
		
		System.out.println("Expected = 5");
		System.out.println("Actual = " + venue.getValue());
		
		venue.reset();
		
		for (int i = 0; i <= 3; i++)
		{
			venue.click();
		}
		
		for (int i = 0; i <= 4; i++)
		{
			venue.unclick();
		}
		
		System.out.println("Expected = -1");
		System.out.println("Actual = " + venue.getValue());
				
	}

}