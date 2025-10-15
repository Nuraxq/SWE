public class Test {
    public static void main(String[] args) throws Exception {

        try{
            Fraction test1 = new Fraction(32,2);
            Fraction test2 = new Fraction(5,10);
            Fraction test3 = new Fraction(20,-2);


            System.out.println("Test fürs Erstellen:");
            if(test1.denominator() == 1 && test1.numerator() == 16){
                System.out.println( "Test 1 ist gelungen");
            }



            System.out.println("Test fürs Multiplizieren und Dividieren");
            Fraction test4 = test1.multiply(2);
            if(test4.numerator() == 32 && test4.denominator() == 1){
                System.out.println("Test 2 ist gelungen");
            }

            Fraction test5 = test1.multiply(test2);
            if(test5.numerator() == 8 && test5.denominator() == 1){
                System.out.println( "Test 3 ist gelungen");
            }

            Fraction test6 = test2.divide(test1);
            if(test6.numerator() == 1 && test6.denominator() == 32){
                System.out.println("Test 4 ist gelungen");
            }

            
            Fraction test7 = test1.multiply(test2,test3,test4);
            if(test7.numerator() == -2560 && test7.denominator() == 1){
                System.out.println("Test 5 ist gelungen");
            }


        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }
}
