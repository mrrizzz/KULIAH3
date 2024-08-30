public class Mahasiswa{
	int NRP;
	String nama;
	Mahasiswa(int nrp, String nama){
		this.NRP = nrp;
        	this.nama = nama;  
	}
	int getNrp(){
		return NRP;
	}

	String getnama(){
		return nama;
	}
}