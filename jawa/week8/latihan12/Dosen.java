class Dosen extends Orang {
    private int nip;
    
    public Dosen(String nama) {
        super(nama);
    }
    
    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }
    
    public Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }
    
    public void info() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + (nip != 0 ? nip : "-"));
        System.out.println("Umur : " + (umur != 0 ? umur : "-"));
    }
}
