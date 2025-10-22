// Simple Studenten Klasse, dient als ADT für den Studentenmanager
public class Kom_Student {
    // Alter und Noten des Studenten
    private int alter;
    private int[] noten; 
    // Konstruktor
    public Kom_Student(int alter, int[] noten){
        this.alter = alter;
        this.noten = noten;
    }
    // Getter und Setter für Alter und Noten
    public void setAlter(int alter){
        this.alter = alter;
    }
    public int getAlter(){
        return this.alter;
    }

    public int[] getNoten(){
        return this.noten;
    }
    public void setNoten(int[] noten){
        this.noten = noten;
    }
    
    
}
