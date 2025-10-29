// Klasse die Studentenobjekte verwalten und benutzen kann 
// Die Klasse Kom_Student stellt eine Art ADT da, die verwendet wird.
public class Kom_Studentmanager {
    public static void main(String[] args) {
        Kom_Student Niklas = new Kom_Student(21, new int[]{1,2,3});
        Kom_Studentmanager.berechne_durchschnitt(Niklas);
        Kom_Studentmanager.isAdult(Niklas);
    }

    // Gibt den Notendurchschnitt auf die Konsole aus
    public static void berechne_durchschnitt(Kom_Student student){
        int summe = 0;
        for(int note : student.getNoten()){
            summe += note;
        }
        summe = summe/student.getNoten().length;
        System.out.println("Der Notenschnitt ist: " + summe); 
    }
    // Gibt aus ob der Student über 18 ist
    public static void isAdult(Kom_Student student){
        if (student.getAlter() >= 18){
            System.out.println("Student ist Erwachsen");
        }
        else{
            System.out.println("Student ist nicht Erwachsen");
        }
    }
}
// Es liegt eine Kommunikatorische Bindung vor, da das Modul Kom_Studentmanager für seine Operationen einen 
// ADT Student verwendet und alle Funktionen des Moduls auf diesem Datentyp agieren.
