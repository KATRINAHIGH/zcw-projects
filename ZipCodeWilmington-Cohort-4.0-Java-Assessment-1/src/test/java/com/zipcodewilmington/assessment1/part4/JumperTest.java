package com.zipcodewilmington.assessment1.part4;

import org.junit.Assert;
import org.junit.Test;

public class JumperTest {

    @Test
    public void solution0(){
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(3,1);
        Integer actual = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution1(){
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(3,2);
        Integer actual = 2;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution2(){
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(3,3);
        Integer actual = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution3(){
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(16808,282475250);
        Integer actual = 16808;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution4(){
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(458777924,7237710);
        Integer actual = 2802257;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution5(){
        // Should assert to true
        Jumper jumper = new Jumper();
        Integer expected = jumper.jumps(823564441,115438166);
        Integer actual = 15497286;
        Assert.assertEquals(expected, actual);

    }
}
