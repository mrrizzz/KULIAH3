import javax.swing.JOptionPane;
	public class InputPane {
		public static void main(String args[]) {
		int nilai;
		String str = JOptionPane.showInputDialog("Masukkan nilai celcius :");
		nilai = Integer.parseInt(str);
		nilai = (nilai / 5 ) * 9 + 32;
		System.out.println("Nilai farrenheit :" + nilai);
	}
}