public class FactorialProgram{

public static void main(String[] args) {

  /*
  factorial is a number multipied by each of its proceeding numbers:
  e.g. 5! = 5 * 4 * 3 *2 * 1 =120
  */
  System.out.println(factorial(5));



}

public static int factorial(int n) {

  if(n == 1) {
      return 1; //basecase
  } else {
      return n * factorial(n -1);
  }

  

}

}