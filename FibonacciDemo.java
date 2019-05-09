public class FibonacciDemo {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int n = 90;
        //System.out.println(f.fibonacci(90));
        //long fibNum = f.fibRec(n);
        //System.out.println("The " + n + "th fibonacci number is " + fibNum);
        //System.out.println("It took " + f.nAdditions + " additions to compute.");
        System.out.println(f.fibMemoization(n));
    }
}
