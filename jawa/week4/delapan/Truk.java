public class Truk {
    private double muatanMaks;
    private double muatan;

    public Truk(double muatanMaks) {
        this.muatanMaks = muatanMaks;
        this.muatan = 0;
    }

    public double getMuatanMaks() {
        return this.muatanMaks;
    }

    public double getMuatan() {
        return this.muatan;
    }

    public boolean tambahMuatan(double berat) {
        double muatanBaru = this.muatan + berat; 
        if (muatanBaru <= this.muatanMaks) {
            this.muatan = muatanBaru;
            return true;
        }
        return false;
    }


}
