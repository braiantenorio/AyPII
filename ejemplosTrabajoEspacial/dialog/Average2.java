// Fig. 4.9: Average2.java
// Class-average program with sentinel-controlled repetition.
import java.text.DecimalFormat;  // class to format numbers
import javax.swing.JOptionPane;

public class Average2 {

   public static void main( String args[] )
   {
      int total;           // sum of grades
      int gradeCounter;    // number of grades entered
      int grade;           // grade value

      double average;  // number with decimal point for average

      String gradeString;  // grade typed by user

      // initialization phase
      total = 0;         // initialize total
      gradeCounter = 0;  // initialize loop counter
      
      // processing phase
      // get first grade from user
      gradeString = JOptionPane.showInputDialog(
         "Enter Integer Grade or -1 to Quit:" );

      // convert gradeString to int
      grade = Integer.parseInt( gradeString );

      // loop until sentinel value read from user
      while ( grade != -1 ) {  
         total = total + grade;            // add grade to total
         gradeCounter = gradeCounter + 1;  // increment counter

         // get next grade from user
         gradeString = JOptionPane.showInputDialog(
            "Enter Integer Grade or -1 to Quit:" );

         // convert gradeString to int
         grade = Integer.parseInt( gradeString );

      } // end while

      // termination phase
      DecimalFormat twoDigits = new DecimalFormat( "0.00" );

      // if user entered at least one grade...
      if ( gradeCounter != 0 ) {

         // calculate average of all grades entered
         average = (double) total / gradeCounter;  

         // display average with two digits of precision
         JOptionPane.showMessageDialog( null, 
            "Class average is " + twoDigits.format( average ), 
            "Class Average", JOptionPane.INFORMATION_MESSAGE );

      } // end if part of if...else

      else // if no grades entered, output appropriate message
         JOptionPane.showMessageDialog( null, "No grades were entered", 
            "Class Average", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminate application

   } // end main

} // end class Average2

/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
