package code;

public class Counter {

	private int value;

		public int getValue() 
		{
			return value;
		}

		public void click()
		{
			value = value + 1;
		}

		public void unclick() 
		{
			value = value - 1;
		}

		public void clickMany(int number)
		{
			for (int i = 0; i <= number; i++)
			{
				click();	
			}
		}

		public void unclickMany(int number)
		{
			for (int i = 0; i <= number; i++)
			{
				unclick();	
			} 
		}

		public void reset()
		{
			value = 0;
		}

}