// App Klasse hat eine Stempelkopplung zu Studentenmanager.
// App gibt ein Student Objekt an Studentenmanager als Argument
// Die Studentenmanager Klasse muss diesen Datentyp dafür ebenfalls kennen 
public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        StudentenManager.druckeNamen(student);
    }
}