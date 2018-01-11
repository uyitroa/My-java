import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         //Complete the code
          String[] open = {"[","{","("};
          String[] close = {"]","}",")"};
          for(int passLeft = 0; passLeft < input.length();passLeft++)
          {
              pos = checkL(open,input,passLeft);
              if(pos != -1)
              {
                  for(int passRight = input.length() - 1; passRight > passLeft; passRight--)
                  {
                      pos2 = checkL(close, input,passRight);
                      if
                  }
              }
          }
      }
      
   }
   
    public static int checkL(String[] list_p, String read,int pass)
    {
        for(int x = 0; x < 3; x++)
        {
            if(list_p[x].equals(read.substring(pass,pass + 1)))
            {
                return x;
            }
        }
        return -1;
    }
}

