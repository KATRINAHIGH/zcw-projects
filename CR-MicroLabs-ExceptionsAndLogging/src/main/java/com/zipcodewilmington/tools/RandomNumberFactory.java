package com.zipcodewilmington.tools;
import java.awt.*;
import java.util.*;

/**
 * Created by Leon on 2/4/2017.
 */

public abstract class RandomNumberFactory {
    private static final Random random = new Random();

    /** @return a random float between the specified min and max numeric range */
    public static Float createFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }

    /** @return a random integer between the specified min and max numeric range */
    public static Integer createInteger(Integer min, Integer max) {
        return createFloat(min, max).intValue();
    }
}