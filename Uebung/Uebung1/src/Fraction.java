public class Fraction {
    int numerator;
    int denominator;

    Fraction(int numerator){
        this(numerator,1);
    }

    // Erstellt die Fraction und prueft ob der Nenner 0 ist.
    Fraction(int numerator,int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Nenner ist 0! Ungueltig!");
        }
        int teiler = Helper.ggT(numerator,denominator);
        this.numerator = numerator / teiler;
        this.denominator = denominator /teiler;

    }

    Fraction multiply(Fraction factor){
        Fraction result = new Fraction(this.numerator * factor.numerator, this.denominator*factor.denominator);
        return result;
    }

    // Erstellt aus dem Int eine Fraction und teilt mithilfe der Fractionsdivison
    Fraction multiply(int factor){
        Fraction temp = new Fraction(factor);
        return multiply(temp);
    }
    // Wir multiplizieren mit dem Kehrwert um zu teilen
    Fraction divide(Fraction divisor){
        Fraction temp = new Fraction(divisor.denominator, divisor.numerator);
        return multiply(temp);
    }

    
    Fraction divide(Fraction[] fractions){
        Fraction temp = new Fraction(this.numerator,this.denominator);
        for(int i = 0; i < fractions.length; i++){
            temp = temp.divide(fractions[i]);
        }
        return temp;
    }
   
    public String toString(){
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);
    }
}
