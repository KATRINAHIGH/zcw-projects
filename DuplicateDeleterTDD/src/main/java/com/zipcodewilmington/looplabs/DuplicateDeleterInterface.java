package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public interface DuplicateDeleterInterface<T> {
    T[] removeDuplicates(int maxNumberOfDuplications);
    T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}