package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    private Integer[] output;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        output = new Integer[0];
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }

    protected Integer countNumberOfOccurences(Integer indexValue){
        Integer count = 0;
        for (Integer value: this.array) {
            if(value.equals(indexValue)) count++;
        }
        return count;
    }

    public Integer[] getOutput() {
        return output;
    }

    protected void extractIndexValueAndAppendToOutput(Integer indexValue){
        // Getting value from Input array at index
        Integer value = this.array[indexValue];

        // create a new array that is one size bigger than current output
        Integer[] tempArray = new Integer[this.output.length + 1];

        //Copy all of the contents from the original output array into our temp array
        System.arraycopy(this.output, 0, tempArray, 0, this.output.length);

        // new value and place in the last slot of temp array
        tempArray[tempArray.length -1 ] = value;

        // no longer point to original array point to temparray
        this.output = tempArray;
    }
}
