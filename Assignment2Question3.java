
/************************************************************
* Solution to mathematical problems
*
* @Author Emmanuel Adeyemi-Kings
* @Date 30th September 2024
* @Version Fall CS 1073 Assignment#2
********************************************************** */
import java.util.Scanner;

public class Assignment2Question3
{
   public static void main (String[] args)
   {
       //Question 3
      //Declaration section
      Scanner input = new Scanner(System.in);
      int length;
      int perimeter;
      int area;
      
      //user input      
       System.out.println("input length");
      length = input.nextInt();
      
      //calculation section
      //perimeter
      perimeter = 2*(length+100)-2*((70+10)+(85+25)+(70+10));
      
      //Area
      area = length*100-(70*10+85*25+70*10);
      
      //output section (error)
      System.out.format("Perimeter = %d\n",perimeter);
      System.out.format("Area = %d\n",area);

    }

}
