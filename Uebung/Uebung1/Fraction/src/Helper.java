public class Helper {

    public static int ggT(int a, int b) {
        if (a < 0 ){ a = -a;}
        if (b < 0) { b = -b;}

        // Komische Fehler abgreifen
        if(a == 0 && b == 0){return 1;}
        if(a == 0){return b;}
        if(b == 0){return a;}
        

        while (a != b) {
            if (b > a) {
                int temp = b;
                b = a;
                a = temp;
            }
            a = a - b;
        }
        return a;
    }

    
}
