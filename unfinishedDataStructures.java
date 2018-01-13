import java.util.*;

class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) 
      {
          String input=sc.next();
          //Complete the code
          String[] open = {"[","{","("};
          String[] close = {"]","}",")"};
          String output = "false";
          String copyString = input;
          int pos;
          for(int charac = 0; charac < input.length() / 2; charac++)
          {
              if (input.length() / 2 != Math.round(input.length() / 2)) // check if input's length is even or not
              {
                  break;
              }
              
              pos = checkL(copyString.substring(charac, charac + 1),open);
              if (pos == -1)
              {
                  output = "false";
                  break;
              }
              if(close[pos].equals(copyString.substring(copyString.length() - 1, copyString.length() )))
              {
                  output = "true";
                  copyString = copyString.substring(1,copyString.length() - 1);
              }
              
              else if(close[pos].equals(copyString.substring(1,2)))
              {
                  output = "true";
                  copyString = copyString.substring(2,copyString.length());
              }

              else
              {
                  output = "false";
                  break;
              }
          }
          System.out.println(output);
      }
   }
   
    public static int checkL(String word, String[] open)
    {
        for(int pos = 0; pos < 3; pos++)
        {
            if(word.equals(open[pos]))
            {
                return pos;
            }
        }
        return -1;
    }
}
