package code;

public class RoachPopulation 
{

		double population = 0;

	    public RoachPopulation(int amtRoaches)
	    {
	        population = amtRoaches;
	    }
	    
	    public void breed ()
	    {
	        population = population * 2;  
	    }
	    
	    public void spray(double percent)
	    { 
	    	double sizePercent = population * percent;
	        population = population - sizePercent; 
	    }
	    
	    public double getRoaches()
	    {
	    	return population;
	    }

}
