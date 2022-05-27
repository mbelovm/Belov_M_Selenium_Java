package finalproject;

public class TestUser {

    private String userName;
    private String password;

    public TestUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public TestUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
