package hu.szamalk.jatekprogram;

public class LogikaiJatek extends Jatek{
    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        if(babuDb < 16 && babuDb >2){
            this.babuDb = babuDb;
        }
        this.sorrend = new int[10];
        this.tabla =new Babu[4][5];
    }

    public boolean van8felettEro(){
        return false;
    }

    @Override
    public void kezd() {
        System.out.println("Kezdés");
    }

    @Override
    public void ment() {
        System.out.println("Mentés");
    }

    @Override
    public void vege() {
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                ", babuDb=" + babuDb +
                '}';
    }
}
