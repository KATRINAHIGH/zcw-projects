package io.zipcoder;

public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        //break word apart into array ...split()
        //loop through array to retrieve each word in array
        //retrieve last letter of each word charAt or endswith
        //check if last letter equals x or y ,
        //if yes add to count if no continue going through the loop
        int count = 0;
        String[] arrayWords = input.split(" ");
        for (int index = 0; index < arrayWords.length; index++) {
            if (arrayWords[index].endsWith("y") || arrayWords[index].endsWith("z")) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : withoutString("Hello there", "llo") // Should return "He there"
     * withoutString("Hello there", "e") //  Should return "Hllo thr"
     * withoutString("Hello there", "x") // Should return "Hello there"
     */
    public String withoutString(String base, String remove) {
        //replaceAll method takes string altering and replaces it with new string in this case an empty string
        return base.replaceAll(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : equalIsNot("This is not")  // Should return false
     * equalIsNot("This is notnot") // Should return true
     * equalIsNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean equalIsNot(String input) {
        if (countSubString(input, "is") == countSubString(input, "not")) {
            return true;
        }
        return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        if (countSubString(input, "gg") > 0) {
            return true;
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        //started loop at index 2 because will never have a triple b4 then
        int triplesCount = 0;
        for (int i = 2; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1) && input.charAt(i) == input.charAt(i - 2)) {
                triplesCount++;
            }
        }
        return triplesCount;
    }

    /**Count the number of instances of substring within a string.
    indexOf(String str, int fromIndex) Returns the index within this
     string of the first occurrence of the specified substring, starting at the specified index.*/
    public static int countSubString(String string, String substring) {
        int count = 0;
        int index = 0;
        /**indexOF finds the index of the first time a substring appears, we start at index 0 the first time through
        the loop, if the substring is there it will add to the counter and we go back thgourhg the loop to the next
         index where indexOf will check for the substring again, if it finds it will assign the substrings
         index to index and then come back through the loop if it doesn't find another substring the method
        returns -1 and stops.*/
        while ((index = string.indexOf(substring, index)) != -1) {
            index++;
            count++;
        }

        return count;
    }

    //Count the number of instances of character within a string.
    //Didn't need for this lab but keeping for future reference
    public static int countChar(final String string, final char c) {
        return countSubString(string, String.valueOf(c));
    }

}


