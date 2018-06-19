package io.zipcoder;

import java.util.*;

public class Problem1 {

    /**
     * Replace certain characters from a string using iteration
     *
     * @param inputString string to be altered
     * @param swapMap   contains char represented by key and it's corresponding replacement value
     * @return a String with any character represented by a key in the map replaced with its corresponding value.
     */
    public String withIteration(String inputString, Map<String, String> swapMap) {
        String outPutString = "";
        for (HashMap.Entry<String, String> val : swapMap.entrySet()) {
            String pattern = "(?i)" + val.getKey();
            //http://cephas.net/blog/2006/02/09/javalangillegalargumentexception-illegal-group-reference-replaceall-and-dollar-signs/
            String replace = "\\" + val.getValue(); //some of the replacements were regular expression operators, if escape them will be fine
            outPutString = inputString.replaceAll(pattern, replace);
            inputString = outPutString;
        }
        return outPutString;
    }

    /**
     * Replace certain characters from a string using recursion
     *
     * @param inputString string to be altered
     * @param swapMap   contains char represented by key and it's corresponding replacement value
     * @return a String with any character represented by a key in the map replaced with its corresponding value.
     */
    public String withRecursion(String inputString, Map<String, String> swapMap) {
        //law of recursion have a condition to stop, empty string gets appended known as non-function
        if(inputString.length() == 0){
            return "";
        }
        String current = inputString.substring(0,1);
        if (swapMap.containsKey(current.toLowerCase())) {
            current = swapMap.get(current.toLowerCase());
        }
        return current + withRecursion(inputString.substring(1),swapMap);
    }
}

