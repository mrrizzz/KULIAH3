public class Tabungan{
	private int saldo;
	public Tabungan(int initsaldo) {
		saldo = initsaldo;	
	}
	public int getSaldo(){
		return this.saldo;
	}	

  public void setSaldo(int saldo){
    this.saldo = saldo;
  }

	public int simpanUang(int jumlah){
		return this.saldo += jumlah;
	}

	public boolean ambilUang(int jumlah) {
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
