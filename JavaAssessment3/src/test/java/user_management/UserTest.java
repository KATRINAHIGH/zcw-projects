package user_management;

import org.junit.Before;
import org.junit.Test;
import user_management.security.Password;

import static org.junit.Assert.*;

public class UserTest {
    private User user;
    private Password password;

    @Before
    public void setUp() throws Exception {
        password = new Password("password");
        user = new User(1, "Wilhem", "wilhem@zipcodewilmington.com", password);
    }

    @Test
    public void getId() {
        assertEquals(1, user.getId());
    }

    @Test
    public void setId() {
        int expected = 2;
        user.setId(expected);
        assertEquals(expected, user.getId());
    }

    @Test
    public void getName() {
        assertEquals("Wilhem", user.getName());
    }

    @Test
    public void setName() {
        String expected = "Leon";
        user.setName(expected);
        assertEquals(expected, user.getName());
    }

    @Test
    public void getEmail() {
        assertEquals("wilhem@zipcodewilmington.com", user.getEmail());
    }

    @Test
    public void setEmail() {
        String expected = "leon@zipcodewilmington.com";
        user.setEmail(expected);
        assertEquals(expected, user.getEmail());
    }

    @Test
    public void getPassword() {
        assertEquals(password, user.getPassword());
    }

    @Test
    public void setPassword() {
        Password expected = new Password("anotherPassword");
        user.setPassword(expected);
        assertEquals(expected, user.getPassword());
        assertTrue(user.getPassword().matches("anotherPassword"));
        assertTrue(expected.matches("anotherPassword"));
    }

    @Test
    public void setPasswordWithString() {
        user.setPassword("anotherPassword");
        assertTrue(user.getPassword().matches("anotherPassword"));
    }

    @Test
    public void testToString() {
        assertEquals("Wilhem - wilhem@zipcodewilmington.com", user.toString());

    }
}