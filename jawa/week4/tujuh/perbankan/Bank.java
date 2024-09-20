package perbankan;

public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;
    
    public Bank() {
        nasabah = new Nasabah[100];
        jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if (jumlahNasabah < nasabah.length) {
            nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
            jumlahNasabah++;
        } else {
            System.out.println("Maaf, bank sudah penuh!");
        }
    }
    
    public int getJumlahNasabah() {
        return jumlahNasabah;
    }
    
    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0 && indeks < jumlahNasabah) {
            return nasabah[indeks];
        } else {
            return null;
        }
    }
}
