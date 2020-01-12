package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        System.out.println(isPalindrome("MOM"));
        System.out.println(isPalindrome("DAD"));
        System.out.println(isPalindrome("MADAM"));
    }
    public static boolean isPalindrome(String word){
        String actualWord = word.toLowerCase();
        int startingPoint = 0;
        int endingPoint = actualWord.length()-1;
        while(startingPoint<endingPoint){
            if(actualWord.charAt(startingPoint) != actualWord.charAt(endingPoint)){
                return false;
            }
            startingPoint++;
            endingPoint--;
        }
        return true;
    }
}
