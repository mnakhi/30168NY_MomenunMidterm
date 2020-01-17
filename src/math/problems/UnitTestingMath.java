package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingMath {

        //Apply Unit testing into each classes and methods in this package.
        @Test
        public void testPositiveLowestDifference () {
            int actualOutcome = FindLowestDifference.minDiffElements(new int[]{30, 12, 5, 9, 2, 20, 33, 1}, new int[]{18, 25, 41, 47, 17, 36, 14, 19});
            int expectedOutcome = 1;
            Assert.assertEquals(actualOutcome,expectedOutcome);
        }

        @Test
        public void testPositiveFindmissingNumber(){
            int actualOutcome = FindMissingNumber.findMissingNumber(new int[]{1,2,5,3,6,7});
            int expectedOutcome = 4;
            Assert.assertEquals(actualOutcome,expectedOutcome);
        }
         @Test
        public void testLowestNumber(){
            int actualOutcome = LowestNumber.getLowestNumber(new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45},13);
            int expectedOutcome = 34;
            Assert.assertEquals(actualOutcome,expectedOutcome);
        }
        @Test
        public void negativeTestPrimeNumber(){
            boolean actualOutcome = PrimeNumber.isPrime(10);
            boolean expectedOutcome = false;
            Assert.assertEquals(actualOutcome,expectedOutcome);
        }
        @Test
        public void positiveTestFctorial(){
            int actualOutcome = Factorial.findFactorialUsingIteration(6);
            int expectedOutcome = 720;
            Assert.assertEquals(actualOutcome,expectedOutcome);
        }
        @Test
        public void negativeTestFctorial(){
            int actualOutcome = Factorial.findFactorialUsingIteration(6);
            int expectedOutcome = 700;
            Assert.assertNotEquals(actualOutcome,expectedOutcome);
        }
        @Test
        public void positiveFibonacci(){
            int actualOutcome = Fibonacci.findFibonacci(4);
            int expectedOutcome = 3;
            Assert.assertEquals(actualOutcome,expectedOutcome);
        }



}
