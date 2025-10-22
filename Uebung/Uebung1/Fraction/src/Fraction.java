public class Fraction {
    private int numerator_;
    private int denominator_;

    public Fraction(int numerator){
        this(numerator,1);
    }

    // Erstellt die Fraction und prueft ob der Nenner 0 ist.
    public Fraction(int numerator,int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Nenner ist 0! Ungueltig!");
        }
        int teiler = Helper.ggT(numerator,denominator);
        this.numerator_ = numerator / teiler;
        this.denominator_ = denominator /teiler;


        if((this.numerator_ < 0 && this.denominator_ < 0) || this.denominator_ < 0 ){
            this.numerator_ = -this.numerator_;
            this.denominator_ = -this.denominator_;
        }
    }

    public Fraction multiply(Fraction factor){
        Fraction result = new Fraction(this.numerator_ * factor.numerator_, this.denominator_*factor.denominator_);
        return result;
    }

    // Erstellt aus dem Int eine Fraction und teilt mithilfe der Fractionsdivison
    public Fraction multiply(int factor){
        Fraction temp = new Fraction(factor);
        return multiply(temp);
    }
    // Wir multiplizieren mit dem Kehrwert um zu teilen
    public Fraction divide(Fraction divisor){
        Fraction temp = new Fraction(divisor.denominator_, divisor.numerator_);
        return multiply(temp);
    }

    
    public Fraction multiply(Fraction... factors){
        Fraction temp = new Fraction(this.numerator_,this.denominator_);
        for(int i = 0; i < factors.length; i++){
            temp = temp.multiply(factors[i]);
        }
        return temp;
    }
   
    public String toString(){
        return Integer.toString(numerator_) + "/" + Integer.toString(denominator_);
    }


    public int numerator(){
        return this.numerator_;
    }
    public int denominator(){
        return this.denominator_;
    }
}
