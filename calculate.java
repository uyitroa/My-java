import java.util.Scanner;

public class calculate
{

	public static void main(String[] args)
	{
		String repeat = "y";
		Scanner read = new Scanner(System.in);
		while(repeat.equals("y"))
		{
			compute(askNumber());

			System.out.print("Again? y/n: ");
			repeat = read.nextLine();

		}
		read.close();
	}

	public static int askNumber() // function that ask how many number the user wants to "deal" with
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers: ");
		int nu;
		nu = input.nextInt();
		return nu;
	}

	public static void compute(int n)
	{
		Scanner input1 = new Scanner(System.in);
		int number;
		int result = 0;
		String operator;

		for(int x=0; x < n; x = x + 1)
		{

			System.out.print("Current result: ");
			System.out.println(result);

			// Now choose the operator: plus minus divide or shit idk
			System.out.println("a.+\nb.-\nc.*\nd./");
			operator = input1.nextLine();

			System.out.print("Enter the number: ");
			number = input1.nextInt();
			input1.nextLine(); // prevent java ignore the next input String
		
			result = check(operator,result,number);
		}
		
		System.out.println("The result is: " + result);
	}

	public static int check(String op,int res, int num) // check the operator choice and calculate
	{
		if(op.equals("a"))
		{
			return res+num;
		}
		else if(op.equals("b"))
		{
			return res-num;
		}
		else if(op.equals("c"))
		{
			return res*num;
		}
		else
		{
			return res/num;
		}
	}

}

