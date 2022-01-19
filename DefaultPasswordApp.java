/*DefaultPasswordApp
@JPCavalcante
05/01/22*/

import javax.swing.JOptionPane;

public class DefaultPasswordApp
{
	public static void main (String args[])
	{
		//Declare variables
		String text = "";
		String password;
		int number;

		//Create object
		DefaultPassword myD = new DefaultPassword(text);

		//Input
		text = JOptionPane.showInputDialog(null, "Please enter 'firstname surname' all lowcase");

		do
		{
			number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a number 3, 4 OR 5"));
			if ((number < 3) ||(number > 5))
			{
				JOptionPane.showMessageDialog(null, "Sorry " + number + " is not a valid entry");
			}
			else
			{
				continue;
			}
		} while ((number < 3) ||(number > 5));

		myD.setText(text);
		myD.setNumber(number);

		//Process
		myD.compute(text);
		myD.passwordExpired()

		//Output
		password = myD.getPassword();
		JOptionPane.showMessageDialog(null, "The password created is: " + password);
		System.out.println(text);
		System.out.println(password);
	}
}