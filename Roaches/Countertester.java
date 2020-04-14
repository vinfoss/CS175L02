package code;

public class Countertester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter anotherVenue = new Counter();
		
		anotherVenue.clickMany(10);
		anotherVenue.unclickMany(5);
		
		System.out.println("Expected = 5");
		System.out.println("Actual = " + anotherVenue.getValue());
		
		anotherVenue.reset();
		
		anotherVenue.clickMany(3);
		anotherVenue.unclickMany(4);
		
		System.out.println("Expected = -1");
		System.out.println("Actual = " + anotherVenue.getValue());
		
	}

}
