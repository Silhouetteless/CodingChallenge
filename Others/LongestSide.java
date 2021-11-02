import java.util.Scanner;

class LongestSide {

	public static void main(String arg[])	{

      int max; 

	    Scanner scan = new Scanner(System.in);

	    System.out.println("Enter 3 edges of a tringle: ");
	    int edge1 = scan.nextInt();
      int edge2 = scan.nextInt();
      int edge3 = scan.nextInt();

      if(edge1 == edge2 && edge2 == edge3) {
        System.out.println("All 3 egdes of this triangle are equal, so the longest side is: " + edge1 + ".");
      }

      if(edge1 != edge2) {
           if(edge1 >= edge2) {
	      	if(edge1 >= edge3){
             max = edge1;      
          }	else {
             max = edge3;
            }
	    } else if(edge2 >= edge3) {
        max = edge2;
        } else {
         max = edge3;
          }

	    System.out.println("The longest side of a triangle of 3 edges (" + edge1 + " " + edge2 + " " + edge3 + ") is: " + max + ".");
      }
	   
     

      scan.close();
	}

}