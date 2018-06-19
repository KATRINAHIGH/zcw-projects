## Palindrome Counter

* Complete the `countPalindromes` function in your editor.
* It has 1 parameter: a string, `s`.
* It must return an integer denoting the number of palindromic substrings of `s`.

**Output Format**

* Your function must return an integer denoting the number of different palindromic substrings of s.


**Sample Input 0**

```
Palindrome palindrome = new Palindrome();
Integer expected = palindrome.countPalindromes("aaa");
Integer actual = 6;
Assert.assertEquals(expected, actual);
```

***Explanation***

* There are 6 possible substrings of `s`: {"a", "a", "a", "aa", "aa", "aaa"}.
* All of them are palindromes, so we return 6.

**Sample Input 1**

```
Palindrome palindrome = new Palindrome();
Integer expected = palindrome.countPalindromes("abccba");
Integer actual = 9;
Assert.assertEquals(expected, actual);
```

***Explanation***

* There are 21 possible substrings of `s`, the following 9 of which are palindromes: {"a", "a", "b", "b", "c", "c", "cc", "bccb", "abccba"}.
* Thus, we return 9.
 
**Sample Input 2**

```
Palindrome palindrome = new Palindrome();
Integer expected = palindrome.countPalindromes("daata");
Integer actual = 7;
Assert.assertEquals(expected, actual);
```

***Explanation***
* There are 15 possible substrings of s, the following 7 of which are palindromes: {"a", "a", "a", "aa", "ata", "d","t"}.
* Thus, we return 7.
