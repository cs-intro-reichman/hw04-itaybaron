public class Primes {
    public static void main(String[] args) {
        
        final int N = Integer.parseInt(args[0]);
        
        if (N < 2) {
            System.out.println("No prime numbers exist below 2.");
        return;
        }
        
        int num = 2;                               
        int count = 0;                    

        System.out.println("Prime numbers up to " + N + ":");

        while (num <= N) {

            if (isPrime(num)) {
                System.out.println(num);           
                count++;                         
            }

            num++;                                 
        }

        int percent = (int)((100.0 * count) / N);

        System.out.println("There are " + count + " primes between 2 and " + N +
                           " (" + percent + "% are primes)");
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } 

        int i = 2;

        while (i < n) {           
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}