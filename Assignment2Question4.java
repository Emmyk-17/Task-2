/************************************************************
* Solution to mathematical problems
*
* @Author Emmanuel Adeyemi-Kings
* @Date 30th September 2024
* @Version Fall CS 1073 Assignment#2
********************************************************** */
import java.util.Scanner;

public class Assignment2Question4
{
   public static void main (String[] args)
   {
        //Question 4
      //Declaration section
      Scanner input = new Scanner(System.in);
      int total;
      int green;
      int ag;
      int cg;
      int sbl;
      int abl;
      int cbl;
      int blue;
      int ts;
      
      //user input      
       System.out.println("input Green Adults");
       ag = input.nextInt();
       
       System.out.println("input Green Children");
       cg = input.nextInt();
       
       System.out.println("input Blue seniors");
       sbl = input.nextInt();
       
       System.out.println("input Blue Adults");
       abl = input.nextInt();
       
       System.out.println("input Blue Children");
       cbl = input.nextInt();
      
      //calculation section
      //Total number of people in green family
      //(adults + the children under each adult)
      green = ag + (ag*cg);
      
      //total number of people in blue family
      //(seniors with their spouses+adult children of each senior(plus their spouses)+the children of each adult child)
      blue = 2*sbl + 2*(sbl*abl) + (1/4*(sbl*abl*cbl)) + (1/3*(sbl*abl*2));
      
      //total number of people in the town including Emilus brown
      total = 1+green+blue;
      
      //total number of candies
      ts= total*12;
      
      //output section (error)
      System.out.format("Total number of candy = %d\n",ts);
    }
}
