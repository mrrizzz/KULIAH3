public class TesTugas2 {
    public static void main(String[] args) {
        Katak o1 = new Katak(5, "Froggy");
        Kecebong o2 = new Kecebong(2, "Junior Frog", 10);
        
        System.out.println("Objek 1:");
        System.out.println("Nama: " + o1.nama);
        System.out.println("Umur: " + o1.umur);
        System.out.println("Cara Bergerak: " + o1.caraBergerak());
        
        System.out.println("\nObjek 2:");
        System.out.println("Nama: " + o2.nama);
        System.out.println("Umur: " + o2.umur);
        System.out.println("Panjang Ekor: " + o2.panjangEkor);
        System.out.println("Cara Bergerak: " + o2.caraBergerak());
    }
}
