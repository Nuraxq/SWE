public class App {
    public static void main(String[] args) throws Exception {

        try{
            Fraction test1 = new Fraction(5,2);
            Fraction test2 = new Fraction(30,3);
            Fraction test3 = new Fraction(-20,2);

            
            System.out.println("Test fürs Erstellen:");
            System.out.println(test1.toString());
            System.out.println(test2.toString());
            System.out.println(test3.toString());



            System.out.println("Test fürs Multiplizieren und Dividieren");
            Fraction test4 = test1.multiply(2);
            System.out.println(test4.toString());

            Fraction test5 = test1.multiply(test2);
            System.out.println(test5.toString());

            Fraction test6 = test2.divide(test1);
            System.out.println(test6.toString());

            Fraction[] frac_arr = {test2,test3,test4};
            Fraction test7 = test1.divide(frac_arr);
            System.out.println(test7.toString());


        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }
}
