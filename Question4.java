import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    

    for (int num = in.nextInt(); num > 0; num--)
    {
      for (int i = num; i > 0; i--)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
}
