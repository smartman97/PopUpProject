package popup.controller;

import popup.model.Thingy;
import popup.view.PopupDisplay;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thingy myTestThingy;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String myName = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("You typed in: " + myName);
		
		String age = myPopups.grabAnswer("Type in your age");
		int myAge;
		
		while(!isInteger(age))
		{
			age = myPopups.grabAnswer("Type in a positive integer for your age!");
		}
		
		if(isInteger(age))
		{
			myAge = Integer.parseInt(age);
		}
		else
		{
			myAge = -999999;
		}
		
		myPopups.showResponse("You typed in: " + myAge);

		String weight = myPopups.grabAnswer("Type in your weight");
		double myWeight;
		
		while(!isDouble(weight))
		{
			weight = myPopups.grabAnswer("Type in a positive double for your weight!");
		}
		
		if(isDouble(weight))
		{
			myWeight = Double.parseDouble(weight);
		}
		else
		{
			myWeight = -9999.99;
		}
		
		myPopups.showResponse("You typed in: " + myWeight);
		
		myTestThingy = new Thingy(myName, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int age = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not a valid Int.");
		}
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double weight = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not a valid Double.");
		}
		return isDouble;
	}
}
