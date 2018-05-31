public class convertisseur
{
	public static void main(String[] args)
	{
		
	}
}

class Convert
{
	String[] values;
	
	Convert(String[] values)
	{
		this.values = values;
	}
	
	public String[] get()
	{
		String my_string;
		String[] shit, result;
		float value;

		for(int x = 0; x < values.length; x++)
		{
			my_string = values[x];
			shit = my_string.split(" ");
			value = Float.parseFloat(shit[0]);
			char unit = my_string.charAt(my_string.length() - 1);
			
			if(unit == 'g')
			{
				
			}
		}
	}

}
