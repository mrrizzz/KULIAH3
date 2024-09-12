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

    public void simpanUang(double jumlah, String mataUang) {
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

    public boolean ambilUang(double jumlah, String mataUang) {
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
