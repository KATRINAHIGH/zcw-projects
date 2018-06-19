import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {


    @Test
    public void testChangeHamletToLeon() {
        String inputLine = "Change Hamlet to Leon. Change Hamlet to Leon.";
        String[] searchStr = {"Hamlet"};
        String[] repStr = {"Leon"};
        String fileName = "test.txt";
        HamletParser test = new HamletParser(fileName, searchStr, repStr);
        String actual = test.getHamletData();
        String expect = "Change Leon to Leon. Change Leon to Leon.\n" +
                "Change Horatio to Tariq. Change Horatio to Tariq.\n";
        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testChangeHoratioToTariq() {
        String inputLine = "Change Horatio to Tariq. Change Horatio to Tariq.";
        String[] searchStr = {"Horatio"};
        String[] repStr = {"Tariq"};
        String fileName = "test.txt";
        HamletParser test = new HamletParser(fileName, searchStr, repStr);
        String actual = test.getHamletData();
        String expect = "Change Hamlet to Leon. Change Hamlet to Leon.\n" +
                "Change Tariq to Tariq. Change Tariq to Tariq.\n";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testChangeHoratioToTariqAndHamletToLeon() {
        String inputLine = "Change Horatio to Tariq. Change Horatio to Tariq.";
        String[] searchStr = {"Hamlet", "Horatio"};
        String[] repStr = {"Leon", "Tariq"};
        String fileName = "test.txt";
        HamletParser test = new HamletParser(fileName, searchStr, repStr);
        String actual = test.getHamletData();
        String expect = "Change Leon to Leon. Change Leon to Leon.\n" +
                "Change Tariq to Tariq. Change Tariq to Tariq.\n";
        Assert.assertEquals(expect, actual);
    }


    @Test
    public void testFindHoratio() {
        String[] searchStr = {"Hamlet", "Horatio"};
        String[] repStr = {"Leon", "Tariq"};
        String fileName = "hamlet.txt";
        HamletParser test = new HamletParser(fileName, searchStr, repStr);
        Boolean actual = test.getHamletData().contains("Horatio");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void testFindHamlet() {
        String[] searchStr = {"Hamlet", "Horatio"};
        String[] repStr = {"Leon", "Tariq"};
        String fileName = "hamlet.txt";
        HamletParser test = new HamletParser(fileName, searchStr, repStr);
        Boolean actual = test.getHamletData().contains("Hamlet");
        Assert.assertEquals(false, actual);
    }
}


