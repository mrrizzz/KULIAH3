
public class TesMultiTabungan {
    public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan(1000000); 

	tabungan.simpanUang();
        System.out.println("saldo sekarang : " + tabungan.getSaldo() + " IDR");

        boolean success = tabungan.ambilUang();
        if (success) {
            System.out.println("penarikan sukses. saldo sekarang: " + tabungan.getSaldo() + " IDR");
        } else {
            System.out.println("penarikan gagal. saldo tidak cukup");
        }
    }
}

