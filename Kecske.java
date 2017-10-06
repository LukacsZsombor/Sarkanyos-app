
package sarkanyos;


public class Kecske implements Allat{
    

    private String nev;
    private int tapertek;
    

    public Kecske(String nev, int tapertek) {

        this.nev = nev;
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
    
}
