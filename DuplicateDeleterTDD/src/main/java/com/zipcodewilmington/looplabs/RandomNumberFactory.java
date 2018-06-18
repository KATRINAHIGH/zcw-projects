package com.zipcodewilmington.looplabs;

import java.util.Random;

/**
 * @author leon.hunter
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public final class RandomNumberFactory {
    private static volatile Random random = new Random();

    private RandomNumberFactory() {
    }
    /**
     * @param min
     * @param max
     * @return a random character between the specified min and max character range
     */
    public static Character createCharacter(char min, char max) {
        return (char) createInteger((int) min, (int) max).intValue();
    }

    /**
     * @param min
     * @param max
     * @return a random float between the specified minimum and maximum numeric range
     */
    public static synchronized Float createFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }

    /**
     * @param min
     * @param max
     * @return a random integer between the specified minimum and maximum numeric range
     */
    public static Integer createInteger(Integer min, Integer max) {
        return createFloat(min, max).intValue();
    }

    /**
     * @param min
     * @param max
     * @return an array the specified length containing integers in the specified range
     */
    public static Integer[] createIntegers(int min, int max, int length) {
        Integer[] integers = new Integer[length];
        for(int i=0; i<length; i++) {
            integers[i] = createInteger(min, max);
        }
        return integers;
    }

    /**
     * @param min
     * @param max
     * @return a random string of the specified length containing characters in the specified range
     */
    public static String createString(char min, char max, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(createCharacter(min, max));
        }
        return sb.toString();
    }


    /**
     * @param min
     * @param max
     * @return an array containing arrays of specified length containing characters in the specified range
     */
    public static String[] createStrings(char min, char max, int stringLength, int arrayLength) {
        String[] array = new String[arrayLength];
        for(int i=0; i<arrayLength; i++) {
            array[i] = createString(min, max, stringLength);
        }
        return array;
    }
}
