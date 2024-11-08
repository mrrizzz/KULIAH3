class User {
    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public boolean login(String input, String password) {
        if (input.matches("\\d+")) {
            return this.phone.equals(input) && this.password.equals(password);
        } else {
            return this.username.equals(input) && this.password.equals(password);
        }
    }
}
