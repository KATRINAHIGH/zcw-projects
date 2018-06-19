package user_management;

import user_management.security.Password;

public class User {

    private Integer id;
    private String name, email;
    private Password password;


    public User(Integer id, String name, String email, Password password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(Integer id, String name, String email, String password) {
        this(id, name, email, new Password(password));
    }

    @Override
    public String toString() {
        return this.name + " - " + this.email;
    }

    @Override
    public boolean equals(Object obj) {
        User u = (User)obj;
        return this.id.equals(u.id) && this.name.equals(u.name) && this.email.equals(u.email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = new Password(password);
    }
}


