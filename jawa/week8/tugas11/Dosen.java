class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen(String username, String password, String phone, String pangkat, String golongan, String key) {
        super(username, password, phone);
        this.pangkat = pangkat;
        this.golongan = golongan;
        this.key = key;
    }

    public boolean login(String input, String password, String key) {
        return super.login(input, password) && this.key.equals(key);
    }

    @Override
    public boolean login(String input, String password) {
        return super.login(input, password);
    }
}
