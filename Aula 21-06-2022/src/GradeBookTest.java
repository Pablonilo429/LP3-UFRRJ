import java.util.Scanner;


// Fig. 7.15: GradeBookTest.java
// GradeBookTest creates a GradeBook object using an array of grades, 
// then invokes method processGrades to analyze them.
public class GradeBookTest
{ 
   // main method begins program execution
   public static void main(String[] args)
   {
      // one-dimensional array of student grades
      int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
      int[] notaslp3 = {10, 9, 9, 8, 7};
      int[] notasbd1 = {8, 7, 6, 5, 8};
      int[] notasweb1 = {8,10,10,10,6};
      Scanner s = new Scanner(System.in);
      int opcaomateria;
      
      GradeBook myGradeBook = new GradeBook(
         "CS101 Introduction to Java Programming", gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n",
         myGradeBook.getCourseName());
      myGradeBook.processGrades();


      GradeBook[] materias = new GradeBook[3];


      materias[0] = new GradeBook("LP3", notaslp3);

      materias[1] = new GradeBook("BD1", notasbd1);

      materias[2] = new GradeBook("WEB1", notasweb1);

      System.out.printf("Selecione 1 para LP3, 2 para BD1 e 3 para WEB1 \n");
      opcaomateria = s.nextInt();

      if(opcaomateria == 1){
         materias[0].processGrades();
      }
      if(opcaomateria == 2){
         materias[1].processGrades();
      }
      if(opcaomateria == 3){
         materias[2].processGrades();
      }

   System.out.printf("\n Code by Nilopolitana");


   } 
} // end class GradeBookTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
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
