package hu.szamalk.jatekprogram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this(1, szin);
    }

    public Babu(int ero, String szin) {
        if(ero > 0 && ero < 10){
            this.ero = ero;
        }
        this.szin = szin;
    }
}
