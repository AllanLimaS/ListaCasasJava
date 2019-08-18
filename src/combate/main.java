/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate;

/**
 *
 * @author 6462340
 */

public class main {
public static player Jogador = new player(); // SETA JOGADOR COMO UM GLOBAL
public static Textos Textos = new Textos(); // SETA TEXTOS COMO UM GLOBAL
   
    public static void main(String[] args){
  
    inimigo Inimigo = new inimigo();
    Jogador.setPontosUP(10);
    
    frameMain MainFrame = new frameMain();
    MainFrame.setVisible(true);
        
        
    }
 
}
