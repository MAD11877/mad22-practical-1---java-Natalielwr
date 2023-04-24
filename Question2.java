import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    //System.out.print("Enter height in m: ");
    double height = in.nextDouble();

    //System.out.print("Enter weight in kg: ");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);
    //System.out.println(height);
    //System.out.println(weight);
    System.out.println(bmi);
  }
}
