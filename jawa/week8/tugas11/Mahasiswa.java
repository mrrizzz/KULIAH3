class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;

    public Mahasiswa(String username, String password, String phone, String kelas, Dosen dosenWali) {
        super(username, password, phone);
        this.kelas = kelas;
        this.dosenWali = dosenWali;
    }

    @Override
    public boolean login(String input, String password) {
        return super.login(input, password);
    }
}
