public class LuasLingkaran{
	public static void main(String[] args){
		double r = 5;
		double luas = Math.PI * r * r;
		double keliling = 2 * Math.PI * r;
		System.out.println("Luas = " + luas);
		System.out.println("Keliling = " + keliling);
	}
}

/*error yang terjadi adalah : C:\jawa>java LuasKubus
Error: Main method not found in class LuasKubus, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application*/

//Nama class harusnya luas lingkaran
//kurang static dalam public static void main