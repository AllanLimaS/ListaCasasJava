/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacasafinal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Casa {

        private int numero;
        private String cor;
        private int numAndares;
        private float area;
        private String material;
        private int janelas;
        
        
    public Casa() {
        this.numero = 0; 
        this.cor = "";
        this.numAndares = 0;
        this.area = 0;
        this.material = "";
        this.janelas = 0;
                
    }    
    
    public void SalvaCasa() throws FileNotFoundException, IOException{
        FileWriter file = new FileWriter("ListaCasas.txt",true);
        PrintWriter pw = new PrintWriter(file);
        pw.println(this.numero + ";" + this.cor + ";" + this.numAndares + ";" + this.area + ";" + this.material + ";" + this.janelas + ";" );
        pw.close();
       
    }


    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the numAndares
     */
    public int getNumAndares() {
        return numAndares;
    }

    /**
     * @param numAndares the numAndares to set
     */
    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }


   
    public int getJanelas() {
        return janelas;
    }

   
    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }
    

        
        
}
