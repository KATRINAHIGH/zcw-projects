package user_management;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class UserCollectionInitializerTest {

    @Test
    public void generate() throws IOException {
        assertEquals(1000, UserCollectionInitializer.generate().size());
    }
}