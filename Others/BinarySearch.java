import java.util.Scanner;
 
class BinarySearch {

  public static void main(String args[]) {
 
    int[] array;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter number of items: ");
    int n = scan.nextInt(); 
    array = new int[n];

    System.out.println("Enter " + n + " numbers: \n Note that numbers need to be in ascending order ");
 
    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }

    System.out.println("Array: " + array);
      
 
    System.out.println("Enter value to find: ");
    int search = scan.nextInt();
    
    int first = 0;
    int last = n - 1;
    int middle = (first + last) / 2;
 
    while(first <= last) {

        if (array[middle] < search) {
          first = middle + 1; 
        }   else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            } else {
                  last = middle - 1;
                  middle = (first + last)/2;
              }
          
    }

    if ( first > last ) {
      System.out.println(search + " is not in the list.\n");
    }
      
  }
}


