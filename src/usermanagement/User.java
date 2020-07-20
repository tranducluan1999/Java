package usermanagement;

public class User {
    private int id;
    private String name;
    private String password;
    private String displayName;
    private String email;

    public User() {
    }

    public User(int id, String name, String password, String displayName, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.displayName = displayName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
