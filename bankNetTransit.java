import java.util.*;

public class kek
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String test = reader.nextLine();
    
        test = 0+test;
        test = test.replace(" ","");
        test = test.replace("W","D-");
        String[] mmy_list = test.split("D");
        int[] my_list = my_split(mmy_list);
        System.out.println(my_sum(my_list));
        
        reader.close();
    }
    
    public static int[] my_split(String[] list)
    {
        int[] result = new int [list.length];
        int pos = 0;
        for(String element : list)
        {
            result[pos] = Integer.parseInt(element);
            pos++;
        }
        
        return result;
    }
    
    public static int my_sum(int[] list)
    {
        int result = 0;
        for(int number : list)
        {
            result += number;
        }
        return result;
    }
}
