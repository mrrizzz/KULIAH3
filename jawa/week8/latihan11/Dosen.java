class Dosen extends User {
    private String key;

    public Dosen(String username, String password, String key) {
        super(username, password);
        this.key = key;
    }

    @Override
    public boolean login(String username, String password) {
        return super.login(username, password);
    }

    public boolean login(String username, String password, String key) {
        return this.key.equals(key) && super.login(username, password);
    }
}
