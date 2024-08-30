public class Truk{
	double max;
	double muatan = 0;
	Truk(double max){
		this.max = max;	
	}

	double getMuatanMaks(){
		return this.max;
	}

	double getMuatan(){
		return this.muatan;
	}

	double tambahMuatan(double muatanTambahan){
		return this.muatan + muatanTambahan < this.max ? this.muatan += muatanTambahan : this.muatan;
	}
}