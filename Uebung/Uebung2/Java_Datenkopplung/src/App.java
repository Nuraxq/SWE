// Modul App hat eine Datenkopplung zu Multipliziere, und verwendet die Mult Funktion des Mulitpliziere Moduls
// Es ist kein besonderer Datentyp Nötig um auf die Funktionalität des anderen Moduls zuzugreifen
// -> Einzelne Datenelemente werden verwendet
public class App {
    // Benutzt die Multipliziere Funktion
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 2;
        int c = Rechner.mult(a, b);
    }
}
