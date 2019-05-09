public class Fibonacci {
    private final int ARRAY_LENGTH = 91;
    public static long nAdditions = 0;
    public long[] fibMemoiz = new long[101];

    public Fibonacci(){
        fibMemoiz[0] = 0;
        fibMemoiz[1] = 1;
    }

    public long fibonacci(int n){
        long[] fib = new long[n + 1];
        int i;
        fib[0] = 0;
        fib[1] = 1;
        for(i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public long fibRec(int n){
        long result;
        if(n == 0) {
            result = 0;
        }
        else if(n == 1){
            result = 1;
        }
        else{
            System.out.println("n = " + n);
            result = fibRec(n - 1) + fibRec(n - 2);
            nAdditions ++;
        }
        return result;
    }

    public long fibMemoization(int n){

        if((n == 0) || fibMemoiz[n] > 0){
            return fibMemoiz[n];
        }
        else{
            fibMemoiz[n] = fibMemoization(n - 1) + fibMemoization(n - 2);
            return fibMemoiz[n];
        }
    }
}
