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
public class player {
    
    int pontosUP = 0;
    private int classe = 0; // CLASSE 1 GUERREIRO / CLASSE 2 MAGO / CLASSE 3 ARQUEIRO
    private int forca =0;
    private int defesa = 0;
    private int vida = 10;
    private int xp = 0;
    private int lvl = 0;
    private int gold = 100;

    public int getPontosUP() {
        return pontosUP;
    }

    public void setPontosUP(int pontosUP) {
        this.pontosUP = pontosUP;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
 
    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }
    
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
   
}
