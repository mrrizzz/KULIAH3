public class Tabungan{
	int saldo;
	Tabungan(int initsaldo) {
		saldo = initsaldo;	
	}
	int getSaldo(){
		return this.saldo;
	}	

	int simpanUang(int jumlah){
		return this.saldo += jumlah;
	}

	boolean ambilUang(int jumlah) {
		int saldo_tmp = this.saldo - jumlah;
		if (saldo_tmp > 0){
			this.saldo  = saldo_tmp;
			return true;
		}	
		else{
			return false;
		}
	}
}	