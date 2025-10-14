public class Fraction {
    int numerator;
    int denominator;


    Fraction(int numerator){
        this(numerator,1);
    }
    Fraction(int numerator,int denominator){
        int teiler = ggT(numerator,denominator);

        this.numerator = numerator / teiler;
        this.denominator = denominator /teiler;

    }

    public int ggT(int a, int b){
        while(a != b){
            if (b > a){
                int temp = b;
                b = a;
                a = temp;
            }
            a = a -b;
        }
        return a;
    }
}
