import java.util.*;

public class orderalphabet 
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Word list separated by ,   and max length of each word is 6:");
		String word = reader.nextLine();
		System.out.print(word);
		String[] word_list = word.split(",");
		int[] decoded_list = new int[word_list.length];
		int longest = maxLength(word_list);
		for(int each_word = 0;each_word < word_list.length;each_word++)
		{
			int number = Integer.parseInt(decode(word_list[each_word],longest)); // value of number is integer type of decoded string
			decoded_list[each_word] = number;
		}
		
		word_list = bubbleSort(word_list,decoded_list);
		
		// print wordlist element, lazy af to create func
		for(String wordo : word_list)
		{
			System.out.println(wordo);
		}
		reader.close();
	}
	
	public static String decode(String words,int maxlen)
	{
		String[] alpha_list = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String code = "";
		for(int charac = 0;charac < words.length();charac++)
		{
			for(int loop = 0;loop < 26;loop++)
			{
				String letter = alpha_list[loop];
				String car = words.substring(charac, charac + 1);
				if(car.equals(letter))
				{
					int pos = loop + 1;
					String zeros = repeat(maxlen - words.length(), "0");
					code += Integer.toString(pos) + zeros;
					break;
				}
			}
		}
		return code;
	}
	
	public static String repeat(int count,String with) // repeat same string
	{
		return new String(new char[count]).replace("\0",with);
	}

	
	public static int maxLength(String[] listof_word) // find the longest string of a list
	{
		int longest = listof_word[0].length();
		for(String word : listof_word)
		{
			if(longest < word.length())
			{
				longest = word.length();
			}
		}
		return longest;
	}
	
	public static String[] bubbleSort(String[] wordList, int[] lst)
	{
		for(int passLeft = lst.length - 1; passLeft > 0;passLeft--)
		{
			for(int pos = 0; pos < passLeft;pos++)
			{
				if(lst[pos] > lst[pos + 1])
				{
					// exchange pos and pos + 1
					int c = lst[pos];
					lst[pos] = lst[pos + 1];
					lst[pos + 1] = c;
					
					// now exchange wordlist pos and pos + 1
					String e = wordList[pos];
					wordList[pos] = wordList[pos + 1];
					wordList[pos + 1] = e;
					
				}
			}
		}
		
		return wordList;
	}
	
	
	
	
	
	
}
