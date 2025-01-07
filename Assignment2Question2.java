
/************************************************************
* How to find distance 3D plane
*
* @Author Emmanuel Adeyemi-Kings
* @Date 30th September 2024
* @Version Fall CS 1073 Assignment#2
********************************************************** */
import java.util.Scanner;

public class Assignment2Question2
{
   public static void main (String[] args)
   {
      //Question 2
      //Declaration section
      Scanner input = new Scanner(System.in);
      double x1;
      double y1;
      double z1;
      double x2;
      double y2;
      double z2;
      double dt;
      double d;
      
      //user input
      //first point
      System.out.println("What is x1");
      x1 = input.nextDouble();
      
       System.out.println("What is y1");
      y1 = input.nextDouble();
      
       System.out.println("What is z1");
      z1 = input.nextDouble();
      
      //second point
       System.out.println("What is x2");
      x2 = input.nextDouble();
      
       System.out.println("What is y2");
      y2 = input.nextDouble();
      
       System.out.println("What is z2");
      z2 = input.nextDouble();

      //calculation section
      dt = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1);
      d = Math.sqrt(dt);
     
      
      //output section (error)
      System.out.format("distance = %f\n",d);

    }
}