package code;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoachPopulation bugs = new RoachPopulation(10);
        System.out.println("The initial roach population is " + bugs.getRoaches());
        
        bugs.breed();
        System.out.println("The roach population after cycle 1 is " + bugs.getRoaches());
        bugs.spray(.5);
        System.out.println("The roach population after cycle 1 50 percent spraying is " + bugs.getRoaches());
       
        bugs.breed();
        System.out.println("The roach population after cycle 2 is " + bugs.getRoaches());
        bugs.spray(.6);
        System.out.println("The roach population after cycle 2 60 percent spraying is " + bugs.getRoaches());
        
        bugs.breed();
        System.out.println("The roach population after cycle 3 is " + bugs.getRoaches());
        bugs.spray(.7);
        System.out.println("The roach population after cycle 3 70 percent spraying is " + bugs.getRoaches());
        
        bugs.breed();
        System.out.println("The roach population after cycle 4 is " + bugs.getRoaches());
        bugs.spray(.8);
        System.out.println("The roach population after cycle 4 80 percent spraying is " + bugs.getRoaches());
        
	}

}