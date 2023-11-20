public class FlipACoin {

    public static void main(String[] args);

    int h = 2;
    int t = 1;
  
    int count = 0;
    int result;

      while (count<=4)
      {
   
        result = (int)Math.random()*2;
        if (result == 2)
        {
        count++;
        System.out.print("H ");
        }
        else if (result == 1)
        {
        count=0;
        System.out.print("T ");
        }
