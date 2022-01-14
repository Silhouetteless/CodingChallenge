public class Students {
  public static void main (String [] args) {
   
      StudentProfile firstStudent = new StudentProfile("Ann", "Mayer", 2024, 4.5, "Maths");
      StudentProfile secondStudent = new StudentProfile("Tom", "Gray", 2024, 2.5, "Arts");

      System.out.print(secondStudent.incrementExpectedGraduationYear());
   
  }
}

public class StudentProfile {

    String firstName;
    String lastName;
    int expectedYearToGrafuate;
    double gPA;
    String declaredMajor;

    public StudentProfile(String firstName, String lastName, int expectedYearToGrafuate, double gPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGrafuate = expectedYearToGrafuate;
        this.gPA = gPA;
        this.declaredMajor = declaredMajor;
    }
  

  public int incrementExpectedGraduationYear(){

      if (this.gPA < 3.0) {
       this.expectedYearToGrafuate = this.expectedYearToGrafuate + 1;
      }
      return expectedYearToGrafuate;
  }
}