package hu.szamalk.jatekprogram;

public abstract class Jatek {
    private static int jatekDB = 0;

    public Jatek() {
        jatekDB++;
    }

    public static int getJatekDB(){
        return -1;
    }

    public void kezd(){}

    public void ment(){}

    public void vege(){}
}
