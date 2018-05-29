public class Matching
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();
		System.out.println(solution.isMatch("mississippi","mis*is*p*."));
	}
}

class Solution
{
	Solution()
	{}
	
	public boolean isMatch(String s, String p)
	{
		String[] pattern = p.split("*");
		int p_pos = 0;
		
		while(s.length() > 0)
		{
			comparee = pattern[p_pos];
			my_sub = s.substring(0,comparee.length());
			if(comparee.equals(my_sub))
			{
				s = s.substring(comparee.length - 1, s.length());
			}
			else
			{
				p_pos++;
			}
		}
		
		return true;
	}
}
