package user_management;

import com.google.gson.Gson;
import user_management.security.Password;
import user_management.security.UserAuthenticationFailedException;
import user_management.validation.EmailNotAvailableException;
import user_management.validation.InvalidEmailException;
import user_management.validation.PasswordTooSimpleException;

import java.util.ArrayList;

public class UserCollection extends ArrayList<User> {
    // http://emailregex.com/
    private final static String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    // https://stackoverflow.com/a/3802238
    private final static String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\<\\>\\?])(?=\\S+$).{8,}$";

    /**
     *
     * @param json
     * @return
     */
    public static UserCollection fromJSONString(String json) {
        Gson gson = new Gson();
        User[] users = gson.fromJson(json, User[].class);
        UserCollection output = new UserCollection();

        for (User u : users) {
            output.add(u);
        }

        return output;
    }


    /**
     *
     * @param id
     * @return
     */
    public User findById(int id) {
        for (User u : this) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    /**
     *
     * @param email
     * @return
     */
    public User findByEmail(String email) {
        for (User u : this) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    private Integer nextId() {
        Integer out = 0;
        for (User u : this) {
            if (u.getId() > out) {
                out = u.getId();
            }
        }

        return out + 1;
    }

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public User attemptLogin(String email, String password) throws UserAuthenticationFailedException {

        User u = this.findByEmail(email);
        if (u == null) {
            throw new UserAuthenticationFailedException();
        }

        String hash = Password.hashPassword(password);
        if (!hash.equals(u.getPassword().getHash())) {
            throw new UserAuthenticationFailedException();
        }

        return u;
    }

    /**
     *
     * @param name
     * @param email
     * @param password
     * @return
     */
    public Integer createUser(String name, String email, String password) throws EmailNotAvailableException, InvalidEmailException, PasswordTooSimpleException {
        for (User u : this) {
            if (u.getEmail().equals(email)) {
                throw new EmailNotAvailableException();
            }
        }

        if (!email.matches(emailRegex)) {
            throw new InvalidEmailException();
        }

        if (!password.matches(passwordRegex)) {
            throw new PasswordTooSimpleException();
        }

        Integer newUserId = this.nextId();
        User u = new User(newUserId, name, email, password);
        this.add(u);

        return newUserId;
    }
}


