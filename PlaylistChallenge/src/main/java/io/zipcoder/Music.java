package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        //Create an arrayList from the array to utilize methods
        ArrayList<String> musicSelections = new ArrayList<String>(Arrays.asList(this.playList));
        int forwardCt = Math.abs(musicSelections.indexOf(selection) - startIndex);
        int BackwardCt = Math.abs((musicSelections.size() + startIndex) - musicSelections.lastIndexOf(selection));
        return Math.min(forwardCt, BackwardCt);
    }
}
/**
 * I have an array of strings
 * have a startIndex that can be anywhere in the array
 * Given another string that is gaurenteed to be in the array
 * We can go forwards and backwards
 * We want to find out many indexes between the start index and the given string.
 * We will return the smallest count
 *
 * Look into casting the array as a list so that you may leverage list methods
 * Does array list have an indexOf method?
 *
 *
 * Index:        0|1|2|3|4|5|6|7
 * Indexstart:     1
 * SongPos:      0|1|2|3|4|5|X|X     song at position 6 and 7
 * ForwardCt:   5 jumps               indexOf will return first index position (songPos-indexStart) (6-1) = 5
 * BackwardCt:  2 jumps                lastIndexOf guarentees last index position
 * BackwardCt: I want to take the distance between 0 index and start index which is the value of start index and add
 * that distance to the end of the array(meaning total length of the array).
 * array. Then I want to check the distance between the last index and the
 *  If song listed 3 times entire equation blows up
 *
 *  //anything prior to start postion will be negative cast as absolute value cus just need count
 *   If song listed 3 times entire equation blows up
 *
 *
 * Index:        0|1|2|3|4|5|6|7
 * Indexstart:          3
 * SongPos:       X|1|2|3|4|5|6|X     song at position 0 and 7
 * ForwardCt:   4 jumps               indexOf will return first index position (songPos-indexStart) (6-1) = 5
 * BackwardCt:  3 jumps                lastIndexOf guarentees last index position
 *
 *   forwardCt = (0-3) absolute value |-3|
 *
 *
 *
 *  int forwardCt = Math.abs(musicSelections.indexOf(selection) - startIndex);
 int BackwardCt = Math.abs((musicSelections.size() + startIndex) - musicSelections.lastIndexOf(selection));
 return Math.min(forwardCt, BackwardCt);

 Overcomplicated it
 ArrayList<String> musicSelections = new ArrayList<String>(Arrays.asList(this.playList));
 int firstIndex = Math.abs(musicSelections.indexOf(selection) - startIndex);
 int lastIndex = Math.abs((musicSelections.lastIndexOf(selection)-startIndex));
 return Math.min(firstIndex, lastIndex);
 Overcomplicated it
 * */