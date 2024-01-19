import java.util.Scanner;
public class DoubloonWords{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter word: ");
      String word = scan.nextLine();
      String word2 = word.toLowerCase();
      int length = word2.length();
      int count = 0;
      int count2 = 0;
      scan.close();
      for (int i = 0; i < length; i++)
        {
          char letter = word2.charAt(i);
          for (int i = 0; i < length; i++)
            {
              char letter2 = word2.charAt(i);
              if (letter == letter2)
              {
                count++;
              }
            }
          if (count == 2)
          {
            count2++;
          }
          count = 0;
        }
      if (count2 == length)
      {
        System.out.println("The word is a doubloon");
      }
      else
      {
        System.out.println("The word is not a doubloon");
      }
    }
  }