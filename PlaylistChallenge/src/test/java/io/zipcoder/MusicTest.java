package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MusicTest {

   @Test
    public void selectionTest1(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){

        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }
}
