public class Fibonacci {
    public static void main(String[] args) throws Exception {
        
        fib(10);
    }


    public static void fib(int n) {
        int a = 0;
        int b = 1;

        while(n > 1){
            int temp = b;
            b = a+b;
            a = temp;
            n--;
        }
        System.out.println("Die gesuchte fibonacci Zahl lautet: " + b);
    }
}
