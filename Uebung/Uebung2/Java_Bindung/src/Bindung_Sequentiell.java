// Beispielklasse um eine Sequentielle Bindung zu zeigen
// Die Klassenmethode gaus_summe berechnet sehr umständlich die n-te Gaussumme.
public class Bindung_Sequentiell {

    // Gibt einfach nur die n-te Gaus summe auf die Konsole aus.
    public static void main(String[] args) throws Exception {
        System.out.println(Bindung_Sequentiell.gauss_summe(10));
    }

    // Berechnet die Gaussumme
    public static int gauss_summe(int n){
        int[] arr = create_array(n);
        Bindung_Sequentiell.fill_array(arr);
        int summe = Bindung_Sequentiell.berechne_summe(arr);
        return summe;
    }
    

    // Erstellt ein n-großes Array
    private static int[] create_array(int n){
        return new int[5];
    }

    // Füllt ein Array mit den Zahlen 1- (length) auf.
    private static void fill_array(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
    }

    // Summiert alle Werte des Arrays auf
    private static int berechne_summe(int[] arr){
        int summe = 0;
        for(int x : arr){
            summe += x;
        }
        return summe;
    }
}
