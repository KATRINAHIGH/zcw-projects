package io.zipcoder;

import java.util.Arrays;
import java.util.Iterator;

/**
 * We're using this as an abstract base class since both the safe and unsafe copiers will implement it.
 */
public abstract class Copier implements Runnable {
    // We use an iterator so each monkey / thread can copy an individual word.
    public Iterator<String> stringIterator;
    public String copied;

    public Copier(String toCopy) {
        // Take the input string, split it on spaces, turn that array to an arraylist, and then grab its iterator.
        this.stringIterator = Arrays.asList(toCopy.split(" ")).iterator();
        this.copied = "";
    }

    public abstract void run();
}

/**Runnable is a interface,
 * to implement runnable there is a method called run that gets implemented in the background
 * and the copier class is abstract but it has a run method stubbed out which all of the
 * subclasses have to implement. Unsafe and safe copier both have their own run method which are
 * both slightly different.
 */
