package code;

public class Countertester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter venue = new Counter();
		
		int rValue = venue.getValue();
		
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		
		rValue = venue.getValue();
		System.out.println("Expected = " + rValue);
		System.out.println("Actual = " + venue.getValue());
		
		venue.reset();
		
		venue.click();
		venue.click();
		venue.click();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		
		rValue = venue.getValue();
		System.out.println("Expected = " + rValue);
		System.out.println("Actual = " + venue.getValue());
		
	}

}