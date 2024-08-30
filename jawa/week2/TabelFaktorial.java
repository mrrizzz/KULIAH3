import java.util.Scanner;

public class TabelFaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan faktorial: ");
        int n = scanner.nextInt();
        
        tampilkanTabelFaktorial(n);
        
        scanner.close();
    }
    
    public static void tampilkanTabelFaktorial(int n) { 
        int maksLebar = String.valueOf(hitungFaktorial(n)).length();
	System.out.printf("n  %" + maksLebar + "s%n", "n!");
        System.out.println("---------------------------");        
        for (int i = 1; i <= n; i++) {
            long hasil = hitungFaktorial(i);
            System.out.printf("%2d %"+maksLebar+"d%n", i, hasil);
        }
        
        System.out.println("--------------------------");
    }
    
    public static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}