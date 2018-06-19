package com.zipcodewilmington.assessment1.part5;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void solution0(){
        Palindrome palindrome = new Palindrome();
        Integer expected = palindrome.countPalindromes("aaa");
        Integer actual = 6;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution1(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer expected = palindrome.countPalindromes("abccba");
        Integer actual = 9;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution2(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer expected = palindrome.countPalindromes("daata");
        Integer actual = 7;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution3(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer expected = palindrome.countPalindromes("lrfkqyuqfj");
        Integer actual = 10;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution4(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer expected = palindrome.countPalindromes("kxyqvnrtys");
        Integer actual = 10;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution5(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer expected = palindrome.countPalindromes("ltvzkqtpvolphckcyufdqmlglimklfzktgygdttnhcvpfdfbrpzlkvshwywshtdgmbqbkkxcvgumonmwvytbytnuqhmfjaqtgngcwkuzyamnerphfmwevhwlezohyeehbrcewjxvceziftiqtntfsrptugtiznorvonzjfeacgamayapwlmbzitzszhzkosvnknberbltlkggdgpljfisyltmmfvhybljvkypcflsaqevcijcyrgmqirzniaxakholawoydvchveigttxwpukzjfhxbrtspfttotafsngqvoijxuvqbztvaalsehzxbshnrvbykjqlrzzfmlvyoshiktodnsjjpqplciklzqrxloqxrudygjtyzleizmeainxslwhhjwslqendjvxjyghrveuvphknqtsdtwxcktmwwwsdthzmlmbhjkmouhpbqurqfxgqlojmwsomowsjvpvhznbsilhhdkbdxqgrgedpzchrgefeukmcowoeznwhpiiduxdnnlbnmyjyssbsococdzcuunkrfduvouaghhcyvmlkzaajpfpyljtyjjpyntsefxiswjutenuycpbcnmhfuqmmidmvknyxmywegmtunodvuzygvguxtrdsdfzfssmeluodjgdgzfmrazvndtaurdkugsbdpawxitivdubbqeonycaegxfjkklrfkraoheucsvpiteqrswgkaaaohxxzhqjtkqaqhkwberbpmglbjipnujywogwczlkyrdejaqufowbigrsnjniegvdvotugocedktcbbufnxorixibbdfrzuqsyrfqghoyqevcuanuujszitaoaowsxyglafbwzddoznrvjqeyqignpitruijvyllsibobjltusrypanvybsfrxtlfmpdidtyozoolzslgdgowijatklvjzscizrkupmsoxftumyxifyunxucubvkfctkqlroqgzjvjwzizppvsomflvioemycnp");
        Integer actual = 1084;
        Assert.assertEquals(expected, actual);

    }
}
