/*
 * Author: Paige Margaret Bartusiak
 * Assignment: 4.3c
 * Date: September 26, 2018
 * 
 * ReadMe: This code determines the type of triangle user inputed side lenghths. It uses ideas from the Pythagorean 
 * theorem and the Triangle Inequality theorem.(Although it wasn't required, it also determines if it is a legal triangle).
 */
import java.util.Scanner;

public class RightTriangle{
   public static void main (String [] args){
     
    Scanner reader = new Scanner(System.in); //reader used for user input
    
    //Gets user input
    System.out.println("Enter the 3 side lengths (from smallest to largest): ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    int c = reader.nextInt();
    String verdict = "a";
    
  /*Checks that side lengths can even make a triangle (Triangle Inequality Theorem).
   *if true, then it is possible to form a triangle with those side lengths. If false, there is no possible triangle.*/
    
    if (c < a + b){                  
      //performs calculations to determine type of triangle 
      if (c*c == a*a + b*b)
        verdict = "a right";
      else if (c*c < a*a + b*b)
        verdict = "an acute";
      else if (c*c > a*a + b*b)
        verdict = "an obtuse";
    }
    else{
     verdict = "not a";
    }

    //prints determined triangle type
    System.out.println("Your triangle is " + verdict + " triangle!");   
  }
}
