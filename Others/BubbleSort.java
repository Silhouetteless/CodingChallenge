//Bubble sort: sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order
//bubble up - currently the biggest item moves to the last position

import java.util.Scanner; 
import java.util.Arrays; 

public class BubbleSort {
 
  public static void sorting(int array[]) { 
     
      int n = array.length;

      for (int i = 0; i < n; i++) { 
        //starting form second item so j = 1
        for (int j = 1; j < n; j++) { 
                    /*

                    at each iteration compare item at index j with the previous item
                    if array of j is smaller than the previous one it means these two items are out of order so we need to swap them
                    
                    if(array[j] < array[j - 1]) {
                      //copy j into a temporal variable
                      var temp = array[j];
                      //set array of j to the previous item
                      array[j] = array[j - 1];
                      //set the item stored in the temporal variable into the array j - 1
                      array[j - 1] = temp;
                    }
        We will switch all this with a swappingMethod:
                    */
            swappingMethod(array, j, j - 1);
        }
      }
         
  } 

  public static void swappingMethod(int[] array, int index1, int index2) {

      var temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
                          
  }

  public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
  }

  public static void main(String[] args) {

      //getting input from the user
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number of elements in an array: ");
      int n = scan.nextInt();
      int[] array = new int[n];
      System.out.println("Enter the elements of the array: ");
      for(int k = 0; k < n; k++) {  
        array[k]=scan.nextInt();  
      }  

      System.out.println("Your sorted array: ");
      printArray(array);
      //sorting array
      sorting(array);
      
      System.out.println("Your sorted array: ");
      printArray(array);

  }













}