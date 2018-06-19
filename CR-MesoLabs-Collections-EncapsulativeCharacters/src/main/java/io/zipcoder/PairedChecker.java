package io.zipcoder;
import java.util.EmptyStackException;
import java.util.Stack;

public class PairedChecker {

    /**
     * Check to see if opening and closing characters are balanced in String input
     * @param opening token
     * @param closing token
     * @param input string to scan
     * @return true if all opening tokens match all closing tokens
     * Catch exception and return false if try to pop off an empty stack
     */
    public boolean check(Character opening, Character closing, String input) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            Character value = input.charAt(i);
            if (value.equals(opening)) {
                stack.push(value);
            } else if (value.equals(closing)) {
                try {
                    stack.pop();
                }
                catch (EmptyStackException ex) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    /**
     * Specific for opening and closing chars that are the same char, ie "" and ''
     * @param quote token used for both opening and closing
     * @param input string to scan
     * @return true if the tokens are evenly distributed in the string
     */
    public boolean checkSame(Character quote, String input) {
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if( quote.equals(input.charAt(i))){
                count++;
            }
        }
        return count%2 == 0;
    }
}