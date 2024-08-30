import java.util.Scanner;
public class Kabisat {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
        	System.out.print("Masukkan tahun (1900 - 2005) ");
        	int n = scanner.nextInt();
        
        	tampilkanKabisat(n);
        
        	scanner.close();

	}

	public static void tampilkanKabisat(int n){
		if (n < 1900 || n > 2005){
			System.out.printf("Maaf tahun input %s %d %n", n < 1900 ? "dibawah" : "diatas", n > 2005 ? 2005 : 1900);
			return;
		}
		System.out.printf("%d %s tahun kabisat %n", n,cekKabisat(n) ? "adalah" : "bukan" );
		
	}
	public static boolean cekKabisat(int tahun){
		if (tahun % 4 == 0){
			if (tahun % 100 == 0)
				return tahun % 400 == 0;
			else
				return true;
		}
		else 
			return false;
	}
}