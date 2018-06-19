package parsing_json;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ElementCollectionTest {
    private ElementCollection elements;

    @Before
    public void setUp() throws Exception {
        elements = ElementCollectionInitializer.generate();
    }

    @Test
    public void findByAtomicNumber() {
        Element expected = new Element(
                "Hydrogen",
                "colorless gas",
                1.008,
                20.271,
                "diatomic nonmetal",
                "colorless",
                0.08988,
                "Henry Cavendish",
                13.99,
                28.836,
                "Antoine Lavoisier",
                1,
                1,
                "Gas",
                "https://en.wikipedia.org/wiki/Hydrogen",
                "https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg",
                "Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.",
                "H",
                1,
                1,
                new ArrayList<Integer>() {{add(1);}}
        );

        assertEquals(expected.getName(), this.elements.findByAtomicNumber(1).getName());
    }

    @Test
    public void findByName() {
        Element expected = new Element(
                "Hydrogen",
                "colorless gas",
                1.008,
                20.271,
                "diatomic nonmetal",
                "colorless",
                0.08988,
                "Henry Cavendish",
                13.99,
                28.836,
                "Antoine Lavoisier",
                1,
                1,
                "Gas",
                "https://en.wikipedia.org/wiki/Hydrogen",
                "https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg",
                "Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.",
                "H",
                1,
                1,
                new ArrayList<Integer>() {{add(1);}}
        );

        assertEquals(expected.getName(), this.elements.findByName("Hydrogen").getName());

    }

    @Test
    public void where() {
        ElementCollection expected = new ElementCollection() {{add(new Element(
                "Hydrogen",
                "colorless gas",
                1.008,
                20.271,
                "diatomic nonmetal",
                "colorless",
                0.08988,
                "Henry Cavendish",
                13.99,
                28.836,
                "Antoine Lavoisier",
                1,
                1,
                "Gas",
                "https://en.wikipedia.org/wiki/Hydrogen",
                "https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg",
                "Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.",
                "H",
                1,
                1,
                new ArrayList<Integer>() {{add(1);}}
        ));
        add(new Element(                "Helium",
                "colorless gas, exhibiting a red-orange glow when placed in a high-voltage electric field",
                4.0026022,
                4.222,
                "noble gas",
                null,
                0.1786,
                "Pierre Janssen",
                0.95,
                Double.NaN,
                null,
                2,
                1,
                "Gas",
                "https://en.wikipedia.org/wiki/Helium",
                "https://en.wikipedia.org/wiki/File:Helium_spectrum.jpg",
                "Helium is a chemical element with symbol He and atomic number 2. It is a colorless, odorless, tasteless, non-toxic, inert, monatomic gas that heads the noble gas group in the periodic table. Its boiling and melting points are the lowest among all the elements.",
                "He",
                18,
                1,
                new ArrayList<Integer>() {{add(2);}}
        ));}};

        assertEquals(expected.get(0).getName(), this.elements.where("name", "Hydrogen").get(0).getName());
        assertEquals(1, this.elements.where("name", "Hydrogen").size());

        assertEquals(expected.get(1).getName(), this.elements.where("number", 2).get(0).getName());
        assertEquals(1, this.elements.where("number", 2).size());

        assertEquals(12, this.elements.where("phase", "Gas").size());
    }
}