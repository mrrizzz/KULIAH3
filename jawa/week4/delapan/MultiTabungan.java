import java.util.Scanner;
public class MultiTabungan {
    private double saldo;
    private static final double USD_TO_IDR = 9000;
    private static final double AUD_TO_IDR = 10000;

    public MultiTabungan(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void simpanUang() {
        System.out.println("simpan  UANG: ");
	Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan mata uang :");
        String mataUang = scanner.nextLine();

	System.out.print("masukkan nominal:");
        double jumlah = scanner.nextDouble();

        switch (mataUang.toUpperCase()) {
            case "USD":
                this.saldo += jumlah * USD_TO_IDR;
                break;
            case "AUD":
                this.saldo += jumlah * AUD_TO_IDR;
                break;
            case "IDR":
            default:
                this.saldo += jumlah;
                break;
        }
    }

    public boolean ambilUang() {
        System.out.println("TARIK UANG: ");
	Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan mata uang :");
        String mataUang = scanner.nextLine();

	System.out.print("masukkan nominal:");
        double jumlah = scanner.nextDouble();

        double jumlahIDR;
        switch (mataUang.toUpperCase()) {
            case "USD":
                jumlahIDR = jumlah * USD_TO_IDR;
                break;
            case "AUD":
                jumlahIDR = jumlah * AUD_TO_IDR;
                break;
            case "IDR":
            default:
                jumlahIDR = jumlah;
                break;
        }

        if (this.saldo >= jumlahIDR) {
            this.saldo -= jumlahIDR;
            return true;
        }
        return false;
    }
}
