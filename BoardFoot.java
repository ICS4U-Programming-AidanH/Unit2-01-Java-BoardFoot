/***

 Calculates the value to create a board foot 

* @author  Aidan

* @version 1.0

* @since   04/25/24

*/

import java.util.Scanner;
//Imports scanner

public class BoardFoot {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Creates scanner


            try {
            System.out.println("Enter the width of the board in inches:");
            double width = sc.nextDouble();
            //Allows user to input a width value

            System.out.println("Enter the height of the board in inches:");
            double height = sc.nextDouble();
            //Allows user to input a height value


            if (width < 0) {
                System.out.println("Width must be a positive value.");
                //Error message for if width < 0
                System.exit(0);
                //Closes program if invalid input is entered
            } else if (height < 0) {
                System.out.println("Height must be a positive value.");
                //Error message for if height < 0
                System.exit(0);
            }

            final double length = CalculateBoardFoot(width, height);
            System.out.println("The length needed to make a board foot is:" + length + "inches.");
            //Outputs the total
        
        } catch (Exception e) {
            System.out.println("Values must be valid numeric inputs.");
            //Error for if user inputs non numeric input
        }
            
        sc.close();
        //Closes scanner

        }

        public static double CalculateBoardFoot(double width, double height) {
            return 144.0 / (width * height); //Returns the value 
            //Function for the calculations for the board foot
    }

    }
    