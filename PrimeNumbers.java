import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        // A prime number is a whole number greater than 1
        //      that has only two factors: 1 and the number itself.
        //      This means that these numbers cannot be divided by any
        //      number other than 1 and the number itself without leaving any remaining.

        System.out.println("Please input the maximum number of values to check for prime numbers: ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        // Find all prime numbers between 1 and 100 (or max if using user-input)
        //      we don't need to check 0 or 1 because a prime number is greater than 1
        for (int numberToCheck = 2; numberToCheck <= max; numberToCheck++) {
            boolean isPrime = true;
            // Check if a value divides evenly into a number we are checking
            for (int value = 2; value <= numberToCheck / 2; value++) {
                if (numberToCheck % value == 0) {       // we know this won't be a prime number
                    isPrime = false;                    // then set isPrime to false
                    break;                              // break out of the loop
                }
            }

            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }
        System.out.println("Prime numbers from 1 to max are: ");
        for (int number : primeNumbers) {
            System.out.println(number);
        }
    }
}
