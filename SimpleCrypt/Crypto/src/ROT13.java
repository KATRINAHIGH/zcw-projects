import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        /**Split alphabet in half. Add 13 to chars before middle of alphabet. Subtracting 13 will rotate
         to the begining of the alphabet. ASCII chars are in order so adding to ascii value will get next
         alphabet*/
        StringBuilder shiftStr = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char charToShift = text.charAt(i);
            if (charToShift >= 'a' && charToShift <= 'm') {
                charToShift += 13;
            } else if (charToShift >= 'A' && charToShift <= 'M') {
                charToShift += 13;
            } else if (charToShift >= 'n' && charToShift <= 'z') {
                charShift -= 13;
            } else if (charToShift >= 'N' && charToShift <= 'Z') {
                charToShift -= 13;
            }
        }
        shiftStr.append(charToShift);
    }
        return shiftStr.toString();
}

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        StringBuilder rotated = StringBuilder();
        //substring: when given one index will slice at that index until length of string
        String rightHalf = s.substring(s.indexOf(c));
        //substring: second param is exclusive and won't include indexOf c
        String leftHalf =s.substring(0, s.indexOf(c));
        return rotated;
    }

}
