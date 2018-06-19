package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ParenCheckerTest {

    private ParenChecker checker;

    @Before
    public void setup() {
        this.checker = new ParenChecker();
    }

    @Test //happyPath
    public void checkBaseCase() {
        boolean result = this.checker.check("()");
        Assert.assertTrue(result);
    }

    @Test
    public void checkBraceBaseCase() {
        boolean result = this.checker.check("[[<'cats'>''''][{}][()]]");
        Assert.assertTrue(result);
    }

    @Test //happy path even quote
    public void checkDoubleQuoteBaseCase() {
        boolean result = this.checker.check("\"\"\"\"\"\"");
        Assert.assertTrue(result);
    }

    @Test //happy path even single quote
    public void checkSingleQuoteBaseCase() {
        boolean result = this.checker.check("\'\'\'\'\'\'");
        Assert.assertTrue(result);
    }

    @Test //happy path even mixed quote
    public void checkMixedQuoteBaseCase() {
        boolean result = this.checker.check("\"\'\'\'\'\'\'\"\"\"\"\"");
        Assert.assertTrue(result);
    }

    @Test
    public void checkExtraBraceBaseCase() {
        boolean result = this.checker.check("[[<cats>>][{}][()]]");
        Assert.assertFalse(result);
    }
    @Test //left char left paren, final check checks to see if stack is empty
    public void checkFailingBaseCase() {
        boolean result = this.checker.check("()(");
        Assert.assertFalse(result);
    }

    @Test //tried to pop a second time on an emptyStack
    public void checkExceptionCaughtAndThrowsFalseBaseCase() {
        boolean result = this.checker.check("())");
        Assert.assertFalse(result);
    }

    @Test //ignore other char checks
    public void checkOtherCharsIgnoredBaseCase() {
        boolean result = this.checker.check("(jklm86&)");
        Assert.assertTrue(result);
    }
}


