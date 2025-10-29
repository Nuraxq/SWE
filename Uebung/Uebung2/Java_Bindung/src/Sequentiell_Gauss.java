// Beispielklasse um eine Sequentielle Bindung zu zeigen
// Die Klassenmethode gaus_summe berechnet sehr umständlich die n-te Gaussumme.

/*
 * Es liegt eine Sequentielle Bindung vor, da die gauss_summe Methode alle anderen Methoden 
 * in fester Reihenfolge aufrufen muss um eine passende Lösung zu erhalten.  
 * Die Methoden sind private und können nur durch gauss_summe aufgerufen werden -> Aufruf hängt direkt zusammen
 * und muss immer ganz erfolgen. 
 */
public class Sequentiell_Gauss {

    // Gibt einfach nur die n-te Gaus summe auf die Konsole aus.
    public static void main(String[] args) throws Exception {
        System.out.println(Sequentiell_Gauss.gauss_summe(100));
    }

    // Berechnet die Gaussumme
    public static int gauss_summe(int n){
        int[] arr = create_array(n);
        Sequentiell_Gauss.fill_array(arr);
        int summe = Sequentiell_Gauss.berechne_summe(arr);
        return summe;
    }
    

    // Erstellt ein n-großes Array
    private static int[] create_array(int n){
        return new int[n];
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
