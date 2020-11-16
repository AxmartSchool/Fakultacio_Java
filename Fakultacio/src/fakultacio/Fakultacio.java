/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultacio;

import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author Axmart
 */
public class Fakultacio {

    
   static ArrayList<FaktClass> tanulok ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        tanulok = FaktClass.Beolvasas();
        
        TanulokEsTantargyakKiirasa();
        OsszesJegyAtlaga();
        MatekJegyekAtlaga();
       
        
    }

    private static void TanulokEsTantargyakKiirasa() {
        
         for(FaktClass c : tanulok){
        
        System.out.println(c.getNev()+"\t"+c.getTantargy());
        
        }
        
        
    }

    private static void OsszesJegyAtlaga() {
        
        float atlag = 0;
        int osszeg = 0;
        
        for(FaktClass c : tanulok){
        
        osszeg += c.getJegy();
        
        }
        atlag = (float)osszeg / (float)tanulok.size();
        
        System.out.println("A jegyek atlaga: "+atlag);
        
        
    }

    private static void MatekJegyekAtlaga() {
        
         float atlag = 0;
        int osszeg = 0;
        int szamlalo = 0;
        
        for(FaktClass c : tanulok){
            if (c.getTantargy().equals("matematika")) {
                osszeg += c.getJegy();
                szamlalo++;
            }
        
        
        }
        atlag = (float)osszeg / (float)szamlalo;
        
        System.out.println("A matek jegyek atlaga: "+atlag);
        
        
    }
    
}
