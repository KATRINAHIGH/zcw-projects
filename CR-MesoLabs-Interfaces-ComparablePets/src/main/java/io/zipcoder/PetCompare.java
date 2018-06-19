package io.zipcoder;

import java.util.Comparator;

public class PetCompare implements Comparator<PetClass> {

    @Override
    public int compare(PetClass pet1, PetClass pet2) {
        int equality = pet1.getClass().getSimpleName().compareTo(pet2.name.getClass().getSimpleName());
        if (equality != 0) {
            return equality;
        }
        return pet1.getName().compareTo(pet2.getName());
    }
}
/** Implementation of comparator very similar to comparable. Did enough research to make app function.
 * Need to research the difference between the 2. Still lacking some understanding here.*/