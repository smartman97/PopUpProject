package popup.view;

import javax.swing.JOptionPane;
/**
 * A popup display class
 * @author Colm Laro
 * @version 1 09/24/15
 */
public class PopupDisplay
{
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
