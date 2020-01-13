package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("Missing number was: "+ findMissingNumber(array));

    }
    public static int findMissingNumber(int[] numArray){
        int expectedSum = 0;
        for(int i = 1; i<=numArray.length+1;i++){
            expectedSum+=i;
        }
        int actualSum =0;
        for(int i = 0; i<numArray.length; i++){
            actualSum += numArray[i];
        }
        return expectedSum - actualSum;
    }
}
