package user_management;

import org.junit.Before;
import org.junit.Test;
import user_management.security.UserAuthenticationFailedException;
import user_management.validation.EmailNotAvailableException;
import user_management.validation.InvalidEmailException;
import user_management.validation.PasswordTooSimpleException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserCollectionTest {
    private UserCollection users;

    @Before
    public void setUp() throws Exception {
        users = UserCollectionInitializer.generate();
    }

    @Test
    public void findById() {
        User actual = users.findById(1);

        User expected = new User(1, "Aprilette Polon", "apolon0@weebly.com", actual.getPassword());

        assertEquals(expected, actual);
    }

    @Test
    public void findByEmail() {
        User actual = users.findByEmail("apolon0@weebly.com");

        User expected = new User(1, "Aprilette Polon", "apolon0@weebly.com", actual.getPassword());

        assertEquals(expected, actual);
    }

    @Test
    public void attemptLogin() throws UserAuthenticationFailedException {
        User actual = users.attemptLogin("apolon0@weebly.com", "apolon0@weebly.com");

        User expected = new User(1, "Aprilette Polon", "apolon0@weebly.com", actual.getPassword());

        assertEquals(expected, actual);
    }

    @Test(expected = UserAuthenticationFailedException.class)
    public void attemptLoginFailure() throws UserAuthenticationFailedException {
        users.attemptLogin("apolon0@weebly.com", "WRONG_PASSWORD");
    }


    @Test(expected = EmailNotAvailableException.class)
    public void createUser_emailNotAvailable() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","apolon0@weebly.com", "1SecurePasswordComingUp!");
    }

    @Test(expected = InvalidEmailException.class)
    public void createUser_invalidEmailNoDomain() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","apolon", "1SecurePasswordComingUp!");
    }

    @Test(expected = InvalidEmailException.class)
    public void createUser_invalidEmailNoName() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","@gmail.com", "1SecurePasswordComingUp!");
    }

    @Test(expected = InvalidEmailException.class)
    public void createUser_invalidEmailNoTld() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","apolon0@weebly", "1SecurePasswordComingUp!");
    }

    @Test(expected = InvalidEmailException.class)
    public void createUser_invalidEmailInvalidTld() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","apolon0@weebly.thewrongtopleveldomainname", "1SecurePasswordComingUp!");
    }

    @Test(expected = PasswordTooSimpleException.class)
    public void createUser_passwordTooSimpleTooShort() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","newemail@gmail.com", "pW0!d");
    }

    @Test(expected = PasswordTooSimpleException.class)
    public void createUser_passwordTooSimpleNoUpperCase() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","newemail@gmail.com", "password123!");
    }

    @Test(expected = PasswordTooSimpleException.class)
    public void createUser_passwordTooSimpleNoLowerCase() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","newemail@gmail.com", "PASSWORD123!");
    }

    @Test(expected = PasswordTooSimpleException.class)
    public void createUser_passwordTooSimpleNoSymbol() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","newemail@gmail.com", "Password123456");
    }

    @Test(expected = PasswordTooSimpleException.class)
    public void createUser_passwordTooSimpleNoNumbers() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        users.createUser("Aprilette Polon","newemail@gmail.com", "Password!@#$%^");
    }

    @Test
    public void createUser() throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        int wilhemId = users.createUser("Wilhem Alcivar","wilhem@zipcodewilmington.com", "1SecurePasswordComingUp!");
        int leonId = users.createUser("Leon Hunter", "leon@zipcodewilmington.co.uk", "1SecurePasswordComingUp!");
        int nhuId = users.createUser("Nhu Nguyen", "nhu@zipcodewilmington.org", "1SecurePasswordComingUp!");

        assertEquals(wilhemId, 1001);
        assertEquals(leonId, 1002);
        assertEquals(nhuId, 1003);

        assertNotNull(users.findById(wilhemId));
        assertNotNull(users.findById(leonId));
        assertNotNull(users.findById(nhuId));
    }
}