package parsing_json;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ElementCollectionInitializerTest {

    @Test
    public void generate() throws IOException {
        assertEquals(119, ElementCollectionInitializer.generate().size());
    }
}