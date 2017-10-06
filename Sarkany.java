package sarkanyos;

import java.util.ArrayList;



public class Sarkany implements Allat {
    
    private static String nev;
    private static int mikorEhes;
    private static int energia;
    private static int tapertek;

    public Sarkany(String nev, int mikorEhes, int kcal, int tapertek) {
        this.nev = nev;
        this.mikorEhes = mikorEhes;
        this.energia = kcal;
        this.tapertek = tapertek;
    }

    
    
    
    @Override
    
    public String getNev() {
        
        return nev;
        
    }
    
    @Override
    public int getTapertek() {
        
        return tapertek;
        
    }
    
    
    public static int energia_szint (Sarkany sarkany) {
        
        
        return sarkany.energia;
        
        
    }
    
    
    public static boolean ehes (Sarkany sarkany) {
        
        if (sarkany.mikorEhes < sarkany.energia) {
            
            System.out.println("A sarkany nem ehes.");
            
            return false;
        }
        
        
        else {
            System.out.println("A sarkany ehes");
            return true ;
            
        }
        
        
    }
    
 
    
    public static void eszik (Allat allat, Sarkany sarkany) {
        
        sarkany.energia = sarkany.energia + allat.getTapertek();
        
        
        
    }
    
    public static void etetes (int kaloria, Sarkany sarkany) {
        
        sarkany.energia = sarkany.energia + kaloria;
        
        
        
    }
    
    
    
    
    public static void eszik (Sarkany sarkany, ArrayList<Allat> allatok) {
        
        for (int i = 0; i < 6; i++) {
            
            sarkany.energia += allatok.get(i).getTapertek();
            
            
        }
        
        System.out.println("A sarkany megette az osszes allatot");
        
    }
    
    
    public static void egyNapEltelik (Sarkany sarkany) {
        
        
        sarkany.energia = sarkany.energia - 3000;
        
        
        
    }
    
    
}
