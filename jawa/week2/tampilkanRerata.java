class Mahasiswa {
	int nrp;
	String nama;
	int rpl;
	int pbo;
	int bd;

	public Mahasiswa(int nrp, String nama, int rpl, int pbo, int bd){
		this.nrp = nrp;
		this.nama = nama;
		this.rpl = rpl;
		this.pbo = pbo;
		this.bd = bd;
	}

	public double average(){
		return (rpl + pbo + bd) / 3;
	}

	public int getNrp(){
		return this.nrp;
	}

	public String getNama(){
		return this.nama;
	}
}

public class tampilkanRerata {
    public static void main(String[] args) {

        Mahasiswa[] mhs = new Mahasiswa[4];
        mhs[0] = new Mahasiswa(1, "Ahmad", 81, 90, 62);
        mhs[1] = new Mahasiswa(2, "Adang", 50, 83, 87);
        mhs[2] = new Mahasiswa(3, "Dani", 89, 55, 65);
        mhs[3] = new Mahasiswa(4, "Edi", 77, 70, 92);

        System.out.println("NRP\tNama\tRata-rata");
        System.out.println("--------------------------");

        for (Mahasiswa mahasiswa : mhs) {
            System.out.printf("%d\t%s\t%.2f%n", mahasiswa.getNrp(), mahasiswa.getNama(), mahasiswa.average());
        }
    }
}


