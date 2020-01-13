package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         int max = 40;
         for(int i = 0; i<max;i++){
             System.out.println(findFibonacci(i));
         }

    }
    public static int findFibonacci(int number){
        if (number==0){
            return 0;
        }
        if(number == 1||number==2) {
            return 1;
        }

        return findFibonacci(number-1)+ findFibonacci(number-2);
    }

}
