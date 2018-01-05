import java.util.Scanner;
// algorithm: 1.ask how many number to calculate -> n number
// 2. loop n times: ask each number and ask plus, minux, multiply or divide, then calculate
// 3. print result and ask to do it again

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

	public static int askNumber() // method that ask how many number the user wants to calculate
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers: ");
		int nu;
		nu = input.nextInt();
		input.close(); // close the input (scanner) to avoid any bugs
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
			System.out.print("Enter the number: ");
			number = input1.nextInt();
			// Now choose the operator: plus minus divide or shit idk
			System.out.println("a.+\nb.-\nc.*\nd./");
			input1.nextLine(); // since scanner ignore one scan when switch from nextInt to nextLine
			operator = input1.nextLine();

			result = check(operator,result,number);
		}
		
		input1.close();
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

