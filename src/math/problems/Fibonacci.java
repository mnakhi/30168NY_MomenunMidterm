package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         int max = 40;
         for(int i = 0; i<=max;i++){
             System.out.println(findFibonacci(i));
         }

    }
    public static int findFibonacci(int num){
        if (num==0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        if (num==2){
            return 1;
        }

        return findFibonacci(num-1)+ findFibonacci(num-2);
    }

}
