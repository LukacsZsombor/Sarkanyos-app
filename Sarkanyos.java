package sarkanyos;

import java.util.ArrayList;
import java.util.Scanner;



public class Sarkanyos {

    
    public static void jelenlegiAllatok (Allat allat, ArrayList<Allat> lista) {
        
        
        lista.add(allat);
        
        
    }
    
    public static void jelenlegiAllatokListabol (ArrayList<Allat> lista_hozzaadando, ArrayList<Allat> lista) {
        
        
        for (int i = 0; i < 6; i++) {
         
            lista.add(lista_hozzaadando.get(i));
            
            
        }
        
    }
        
        public static void jelenlegiAllatokKiiratas (ArrayList<Allat> lista) {
        
        
            System.out.print("Jelenlegi allatok: [");    
            
        for (int i = 0; i < lista.size(); i++) {
         
            System.out.print(lista.get(i).getNev() + "(" + lista.get(i).getTapertek() + " kcal),");
            
            
        }
        
            System.out.println("]");
        
        
        
    }
    
    
    public static void main(String[] args) {

        
        
        
        Sarkany A_Sarkanyok_Kiralya = new Sarkany("Sarkany", 2500, 5000, 15000);
        
        Birka birka1 = new Birka("Birka", 500);
        Kecske kecske1 = new Kecske("Kecske", 1000);
        
        
        Sarkany eheto_sarkany = new Sarkany("Eheto sarkany", 2000, 3000, 6000);
        
        
        ArrayList <Allat> allatok_lista = new ArrayList();
        
        allatok_lista.add(birka1);
        allatok_lista.add(birka1);
        allatok_lista.add(birka1);
        allatok_lista.add(kecske1);
        allatok_lista.add(kecske1);
        allatok_lista.add(kecske1);
        
        ArrayList<Allat> jelenlegi_allatok_lista = new ArrayList();
        
       
       Scanner sc = new Scanner(System.in); 
       int tortenes;
       int kaloria; 
        
       
       do {
        
        Sarkany.ehes(A_Sarkanyok_Kiralya);
        
        if (jelenlegi_allatok_lista.size() > 0) {    
        jelenlegiAllatokKiiratas(jelenlegi_allatok_lista);
        }
        
        
        
            System.out.println(Sarkany.energia_szint(A_Sarkanyok_Kiralya));
        System.out.println("Mi tortenjen a sarkannyal?");
        
        
        
        System.out.println("Új állat");
        
        System.out.println("Etetés");
        
        System.out.println("Etetés (mind)");
        
        System.out.println("Eltelik egy nap");
        
        System.out.println("Kilépés");
        
        
        
      
        
        tortenes = sc.nextInt();
        
        if(tortenes < 1 || tortenes > 5) {
            
             throw new IllegalArgumentException("Nem megfelelo menupontot adott meg.");
            
        }
        
        String interakcio;
        
        switch (tortenes) {
            
            case 1: interakcio =  "Új állat";
            
                System.out.println("Milyen allatot szeretnel?");
                System.out.println("1. Birka");
                System.out.println("2. Kecske");
                System.out.println("3. Sarkany");
                
                
                
                int allat = sc.nextInt();
                
                if (allat < 1 || tortenes > 3) {
            
                    throw new IllegalArgumentException("Nem megfelelo menupontot adott meg.");
            
                }
                
                
                if (allat == 1) {
                    
                    Sarkany.eszik(birka1, A_Sarkanyok_Kiralya);
                    
                    
                    jelenlegiAllatok(birka1, jelenlegi_allatok_lista);
                    
                }
                
                else 
                
                if (allat == 2){
                    
                    Sarkany.eszik(kecske1, A_Sarkanyok_Kiralya);
                    
                    jelenlegiAllatok(kecske1, jelenlegi_allatok_lista);
                    
                }
                
                else {
                    
                    Sarkany.eszik(eheto_sarkany, A_Sarkanyok_Kiralya);
                    
                    jelenlegiAllatok(eheto_sarkany, jelenlegi_allatok_lista);
                }
            
            break;
            
            case 2: interakcio =  "Etetés";
            
                        
                System.out.println("Mennyi kaloriaval?");
                
                kaloria = sc.nextInt();
                
                
                if (kaloria < 1) {
            
                    throw new IllegalArgumentException("Nem megfelelo szamot adott meg.");
            
                }
                
                
                Sarkany.etetes(kaloria, A_Sarkanyok_Kiralya);
            
            
            break;

            case 3: interakcio =  "Etetés (mind)";
            
            Sarkany.eszik(A_Sarkanyok_Kiralya, allatok_lista);
            
                jelenlegiAllatokListabol(allatok_lista, jelenlegi_allatok_lista);
            
            break;
            
            case 4: interakcio =  "Eltelik egy nap";
            
            Sarkany.egyNapEltelik(A_Sarkanyok_Kiralya);
            
            break;
            
            case 5: interakcio =  "Kilépés";
            break;
            
            
            
            
        } 
        
        }while (tortenes != 5);
        
    }
    
}
