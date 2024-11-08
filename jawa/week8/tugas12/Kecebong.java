class Kecebong extends Katak {
    protected double panjangEkor;
    
    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }
    
    @Override
    public String caraBergerak() {
        return "berenang";
    }
}
