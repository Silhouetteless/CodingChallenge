//program for finding primes between a start and end range
//prime number: number whose multiples are the number itself and 1

import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {

      
            System.out.println(findPrimes(1, 100));
    

    }

    public static ArrayList<Integer> findPrimes(int start, int end) {

            ArrayList<Integer> primes = new ArrayList<Integer>();

            for(int n = start; n < end; n++) {

                boolean prime = true;

                 //eliminate numbers that are multiple by 2 cuz they are not primes
                    int i = 2; //because one is always gonna be a multiple
                    while(i <= n/2) {
                //to check if it's a multiple:
                        if(n % i == 0) /*if the reminded of n devided by the current number is zero > it's a multiple*/ {
                        prime = false;
                        break;
                        }
                        i++;

                    }

                if(prime) {
                        primes.add(n);
                }
            }

            return primes;
    }

}