package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class UnitTestingStringProblem {
    @Test
    public void testPositiveIsAnagram(){
        Assert.assertTrue(Anagram.checkIfAnagram("CAT","ACT"));
    }
    @Test
    public void testNegativeIsAnagram(){
        Assert.assertFalse(Anagram.checkIfAnagram("AIM","MAN"));
    }
    @Test
    public void testNegativeWhenDifferentWordLengthInAnagram(){
        Assert.assertFalse(Anagram.checkIfAnagram("Dog","Dogs"));
    }

    @Test
    public void testPositiveIsPalindrome(){
        Assert.assertTrue(Palindrome.isPalindrome("MOM"));
    }

    @Test
    public void testNegativeIsPalindrome(){
        Assert.assertFalse(Palindrome.isPalindrome("MAD"));
    }

}
