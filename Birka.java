
package sarkanyos;


public class Birka implements Allat{
    
    
    private String nev;
    private int tapertek;

    public Birka(String nev, int tapertek) {

        
        this.nev = nev;
        this.tapertek = tapertek;
    }
    
    
    
    public String getNev() {
        
        return nev;
        
    }
    
    
    @Override
    public int getTapertek() {
        
        return tapertek;
        
    }
    
}
