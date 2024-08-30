public class TesTugas2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "Minibus", "2000cc", "7");
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "Pickup", "1500cc", "2");
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "SUV", "1800cc", "5");
        Mobil mobil4 = new Mobil("Honda", "Merah", "Sedan", "1300cc", "5");

        mobil1.infoMobil();
        mobil2.infoMobil();
        mobil3.infoMobil();
        mobil4.infoMobil();
    }
}
