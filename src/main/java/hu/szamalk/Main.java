package hu.szamalk;

//feladatleirás:
//  - mindegyik feladatrész elkészítése után legyen egy commit
//  - három feladatrészből min 2. (f1 1 f1 2)/f1 VÉGE


import hu.szamalk.model.Tábla;

public class Main {
    public static void main(String[] args) {
        Tábla obj = new Tábla('#');
        System.out.println(obj.Megjelenit());
        System.out.println(obj.UresOszlop(2));
        System.out.println(obj.UresSor(3));
        System.out.println(obj.UresOszlopokSzama());
        System.out.println(obj.UresSorokSzama());
    }
}

