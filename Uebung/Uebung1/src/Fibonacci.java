public class Fibonacci {
    public static void main(int n){

        fib(n);
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
