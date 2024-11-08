class Mahasiswa extends User {
    private String phone;

    public Mahasiswa(String username, String password, String phone) {
        super(username, password);
        this.phone = phone;
    }

    public boolean login(String phone, String password) {
        return this.phone.equals(phone) && super.login(this.phone, password);
    }
}
