public class TestLogin {
    public static void main(String[] args) {
        Dosen dosenWali = new Dosen("dosen1", "passdosen1", "08123456789", "Professor", "IV", "dosenkey");
        Mahasiswa fadilah = new Mahasiswa("fadilah", "123456", "083853501388", "TI", dosenWali);

        boolean result = fadilah.login("083853501388", "123456");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        Dosen fahrul = new Dosen("fahrul", "123456", "08123456789", "Lektor", "III", "19990129");

        result = fahrul.login("fahrul", "123456", "19990129");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
}
