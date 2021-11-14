import java.util.Scanner;

class AverageGrade {

   public static void main(String args[]) {
 
    int i;
 
    Scanner scan = new Scanner(System.in);

    //getting number of subjects
          System.out.println("Enter number of subjects: ");
      
          int n = scan.nextInt();
 
    //creating an Array for the grades
          int[] grades = new int[n];
 
          double currentSum = 0;
 
    //getting grades
          System.out.println("Enter grades: ");
 
          //asking for as mane grades as stated in "n"
          for(i = 0; i < n; i++) {
            grades[i]=scan.nextInt();
          }
      
          //summing grades in the array
          for(i = 0; i < n; i++) {
            currentSum = currentSum + grades[i];
            System.out.println("grade added: " + grades[i] + "; current sum: " + currentSum);
          }
 
    //prnting AverageGrade
          System.out.print("Average of (");
          
          //printing the grades
          for(i = 0; i < n-1; i++) {
            System.out.print(grades[i] + ",");
          }

          System.out.println(grades[i]+") = " + currentSum/n);
          
    scan.close();
  }


}