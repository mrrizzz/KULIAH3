import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan? ");
        int number = scanner.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " adalah bilangan prima");
        } else {
            System.out.println(number + " bukan termasuk bilangan prima");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
