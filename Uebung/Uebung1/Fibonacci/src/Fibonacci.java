import java.util.InputMismatchException;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        
        fib(-1);
    }


    public static void fib(int n) {
        try{
            if(n < 0){ throw new InputMismatchException("Negative n sind nicht erlaubt!");}
            int a = 0;
            int b = 1;
            if(n <= 1)
            {
                System.out.println("Die gesuchte fibonacci Zahl lautet: " + n); 
                return;
            }
            while(n > 1){
                int temp = b;
                b = a+b;
                a = temp;
                n--;
            }
            System.out.println("Die gesuchte fibonacci Zahl lautet: " + b);
            }catch(InputMismatchException e)
            {
                System.out.println(e.getMessage());
            }
    }
}