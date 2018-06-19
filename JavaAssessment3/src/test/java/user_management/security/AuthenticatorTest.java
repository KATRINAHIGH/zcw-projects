package user_management.security;

import org.junit.Test;
import user_management.User;
import user_management.UserCollectionInitializer;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static user_management.security.Authenticator.authenticate;

public class AuthenticatorTest {

    @Test
    public void testAuthenticate() throws IOException {
        User user = UserCollectionInitializer.generate().findByEmail("apolon0@weebly.com");

        assertTrue(authenticate(user, "apolon0@weebly.com"));
    }
}