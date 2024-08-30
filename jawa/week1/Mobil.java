public class Mobil {
    String merk, warna, jenis, ccmesin, seat;

    Mobil(String merk, String warna, String jenis, String ccmesin, String seat) {
        this.merk = merk;
        this.warna = warna;
        this.jenis = jenis;
        this.ccmesin = ccmesin;
        this.seat = seat;
    }

    void infoMobil() {
        System.out.println("Merk = " + this.merk);
        System.out.println("Warna = " + this.warna);
        System.out.println("Jenis = " + this.jenis);
        System.out.println("Kapasitas Mesin = " + this.ccmesin);
        System.out.println("Kapasitas Penumpang = " + this.seat);
        System.out.println();
    }
}
