import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
        	System.out.print("Masukkan berapa deret Fibonacci? ");
        	int n = scanner.nextInt();
        
        	tampilkanDeretFibonacci(n);
        
        	scanner.close();

	}

	public static void tampilkanDeretFibonacci(int n){
		System.out.println(n + " deret Fibonacci =");
		int a = 1;	
		int b = 1;
		for (int i=0; i<n; i++){
			System.out.print(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}