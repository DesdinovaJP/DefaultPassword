/*DefaultPassword
@JPCavalcante
05/01/22
*/

public class DefaultPassword {
	//Declare variables
	private String text;
	private String password;
	private int number;
	private String username [];
	private String passwordChange [];

	//constructor
	public DefaultPassword (String text)
	{
		this.text = text;
	}

	//compute method or encode
	public String compute(String text)
	{	StringBuffer strBuff = new StringBuffer ();
		for (int i = 0; i < text.length(); i++)
		{
			char character = text.charAt(i);
			if ((i+1) % number == 0)
			{
				strBuff.append("");
			}
			else if (character == ' ')
			{
				strBuff.append('!');

			}
			else if ((character == 'a') || (character == 'e') || (character == 'i') || (character == 'o') || (character == 'u'))
			{
				strBuff.append("R");
				strBuff.append(character);
			}
			else
			{
				strBuff.append(character);
			}
		}

		return password = strBuff.toString();
	}

	public boolean passwordExpired (String username[], String passwordChange[])
	{
		return true;
	}

	public void setText (String text)
	{
		this.text = text;
	}

	public void setNumber (int number)
	{
		this.number = number;
	}

	public String getPassword ()
	{
		return password;
	}
}