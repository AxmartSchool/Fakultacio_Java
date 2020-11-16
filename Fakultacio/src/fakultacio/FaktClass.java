/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultacio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Axmart
 */
public class FaktClass {
    
    private String nev;
    private String tantargy;
    private int jegy;

    public String getNev() {
        return nev;
    }

    public String getTantargy() {
        return tantargy;
    }

    public int getJegy() {
        return jegy;
    }

    public FaktClass(String nev, String tantargy, int jegy) {
        this.nev = nev;
        this.tantargy = tantargy;
        this.jegy = jegy;
    }
    
    
   
    
    static ArrayList<FaktClass> Beolvasas() throws FileNotFoundException, IOException{
        
        BufferedReader fileReader = new BufferedReader(new FileReader("fakt.txt"));
        
        ArrayList<FaktClass> output =  new ArrayList<>();
        
        String sor;
        
        String[] tempTomb;
        
        while((sor =fileReader.readLine())!= null){
            
            tempTomb = sor.split(";");
            output.add(new FaktClass(tempTomb[0],tempTomb[1], Integer.parseInt(tempTomb[2]) ));
            
        }
        
        fileReader.close();
        
        return output;
        
        
        
    }
    
    
}
