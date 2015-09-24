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
		
		String temp = myPopups.grabAnswer("Type in your age");
		int myAge;
		
		if(isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -999999;
		}
		
		myPopups.showResponse("You typed in: " + myAge);

		String tempW = myPopups.grabAnswer("Type in your weight");
		double myWeight;
		
		if(isDouble(temp))
		{
			myWeight = Double.parseDouble(tempW);
		}
		else
		{
			myWeight = -999999;
		}
		
		myPopups.showResponse("You typed in: " + myWeight);
		
		myTestThingy = new Thingy(myName, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double - bad value will be used");
		}
		return isDouble;
	}
}
