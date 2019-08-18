/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import static combate.main.Jogador;
import static combate.main.Textos;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class frameMain extends javax.swing.JFrame implements ActionListener{

   int parteAtual = 0; // SERVE PARA SABER QUE PARTE ESTÁ DA AVENTURA E PARA DETERMINAR A PROXIMA
   
   private ImageIcon imagem;

   
    public frameMain() {
        setBounds(600, 250, WIDTH, WIDTH);
        initComponents(); 
        Timer timer = new Timer(50 , this);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        frameUpgrade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        barraXp = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        quantXp = new javax.swing.JLabel();
        lvl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barraVida = new javax.swing.JProgressBar();
        quantVida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelTexto = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        botãoProximo = new javax.swing.JButton();
        op1 = new javax.swing.JButton();
        op2 = new javax.swing.JButton();
        op3 = new javax.swing.JButton();
        classe = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameUpgrade.setText("UPGRADES");
        frameUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameUpgradeActionPerformed(evt);
            }
        });

        jLabel2.setText("VIDA");

        barraXp.setForeground(new java.awt.Color(0, 0, 102));

        jLabel3.setText("XP");

        quantXp.setText("0/100");

        lvl.setText("0");

        jLabel4.setText("Lvl :");

        barraVida.setForeground(new java.awt.Color(255, 0, 0));

        quantVida.setText("0/50");

        painelTexto.setEditable(false);
        painelTexto.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(painelTexto);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botãoProximo.setText("PRÓXIMO");
        botãoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoProximoActionPerformed(evt);
            }
        });

        op1.setText("OPÇÃO 1");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setText("OPÇÃO 2");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setText("OPÇÃO 3");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        classe.setText("Classe: ");

        gold.setText("Gold:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantXp))
                            .addComponent(barraXp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(lvl)
                        .addGap(39, 39, 39)
                        .addComponent(classe)
                        .addGap(83, 83, 83)
                        .addComponent(gold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(frameUpgrade))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantVida)
                            .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(op1)
                        .addGap(18, 18, 18)
                        .addComponent(op2)
                        .addGap(18, 18, 18)
                        .addComponent(op3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botãoProximo)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botãoProximo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(op1)
                            .addComponent(op2)
                            .addComponent(op3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(quantVida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quantXp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraXp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(frameUpgrade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lvl)
                        .addComponent(jLabel4)
                        .addComponent(classe)
                        .addComponent(gold)))
                .addGap(12, 12, 12))
        );

        barraXp.getAccessibleContext().setAccessibleParent(barraXp);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frameUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameUpgradeActionPerformed

        frameUP Upgrade = new frameUP();
        Upgrade.setLocationRelativeTo(null);
        Upgrade.setVisible(true);
        Upgrade.setPtsUP(Jogador.pontosUP);
        Upgrade.UpdateDados();
    }//GEN-LAST:event_frameUpgradeActionPerformed

    private void botãoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoProximoActionPerformed
        
        switch(parteAtual){
            case 3: case 4: case 5:
                parteAtual = 6;
            break;
            
            case 24: case 29:
                parteAtual = 30;
            break;
                
            default:
                parteAtual = parteAtual + 1;
            break;
        }
    }//GEN-LAST:event_botãoProximoActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        
        if(parteAtual == 2){
            Jogador.setClasse(1);
            parteAtual = 3;
        }
        
        if(parteAtual == 8){
            parteAtual = 9;
        }
        
        if(parteAtual == 10){
            parteAtual = 11;
        }
        
        if(parteAtual == 12){
            parteAtual = 13;
        }
        
        if(parteAtual == 15){
            Jogador.setGold(Jogador.getGold() - 10);
            parteAtual = 16;// 16 eh um combate 
        }
        
        
        if(parteAtual == 19){
            parteAtual = 20;
        }
        
        if(parteAtual == 22){
            parteAtual = 23;
        }
        
        if(parteAtual == 27){
            parteAtual = 28;
        }
        
        
        
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        if(parteAtual == 2){
            Jogador.setClasse(2);
            parteAtual = 4;
        }
        if(parteAtual == 8){
            parteAtual = 9;
        }
        
        if(parteAtual == 10){
            parteAtual = 11;
        }    

        if(parteAtual == 12){
            parteAtual = 13;
        }
        
        if(parteAtual == 15){
            parteAtual = 16;// 16 eh um combate 
        }
        
        if(parteAtual == 19){
            parteAtual = 25;
        }
        
        if(parteAtual == 22){
            parteAtual = 23;
        }
        
        if(parteAtual == 27){
            parteAtual = 28;
        }
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        if(parteAtual == 2){
            Jogador.setClasse(3);
            parteAtual = 5;
        }
        if(parteAtual == 8){
            parteAtual = 9;
        }
        
        if(parteAtual == 10){
            parteAtual = 11;
        }
        
        if(parteAtual == 12){
            parteAtual = 13; 
        }
        
        if(parteAtual == 15){
            parteAtual = 16;// 16 eh um combate 
        }

        if(parteAtual == 19){
            parteAtual = 25;
        }
        
        if(parteAtual == 22){
            parteAtual = 23;
        }
        
        if(parteAtual == 27){
            parteAtual = 28;
        }
    }//GEN-LAST:event_op3ActionPerformed
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        painelTexto.setText(Textos.getTxt(parteAtual));
        barraXp.setValue(Jogador.getXp());
        barraVida.setValue(Jogador.getVida() * 2);
        quantXp.setText(Integer.toString(Jogador.getXp()) + "/100");
        quantVida.setText(Integer.toString(Jogador.getVida()) + "/50");
        lvl.setText(Integer.toString(Jogador.getLvl()));
        gold.setText("Gold: "+ Jogador.getGold());
        
        if(Jogador.getClasse() == 1){
            classe.setText("Classe: Guerreiro");
        }
        else if(Jogador.getClasse() == 2){
            classe.setText("Classe: Mago");       
        }
        else if(Jogador.getClasse() == 3){
            classe.setText("Classe: Arqueiro");   
        }
        
        if(Jogador.getXp() == 100){
            Jogador.setLvl(Jogador.getLvl() + 1);
            Jogador.setPontosUP(Jogador.getPontosUP() + 1);
            Jogador.setXp(0);
        }
        
        //AKI OS BOTÕES SOMEM E APARECEM DEPENDENDO DA FASE
        if(parteAtual == 2 || parteAtual == 8 || parteAtual == 10 || parteAtual == 12 || parteAtual == 15 || parteAtual == 19 || parteAtual == 22 || parteAtual == 27){
            botãoProximo.setVisible(false);
            op1.setVisible(true);
            op2.setVisible(true);
            op3.setVisible(true);
        } else {
            botãoProximo.setVisible(true);
            op1.setVisible(false);
            op2.setVisible(false);
            op3.setVisible(false);
        }
        
        if(parteAtual %2 == 0){
            imagem = new ImageIcon(getClass().getResource("Images\\teste1.jpg"));
            jLabel5.setIcon(imagem);
        }else{
            imagem = new ImageIcon(getClass().getResource("Images\\teste2.jpg"));
            jLabel5.setIcon(imagem);
        }
        repaint();
    }
    
    
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraVida;
    private javax.swing.JProgressBar barraXp;
    private javax.swing.JButton botãoProximo;
    private javax.swing.JLabel classe;
    private javax.swing.JButton frameUpgrade;
    private javax.swing.JLabel gold;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lvl;
    private javax.swing.JButton op1;
    private javax.swing.JButton op2;
    private javax.swing.JButton op3;
    private javax.swing.JTextPane painelTexto;
    private javax.swing.JLabel quantVida;
    private javax.swing.JLabel quantXp;
    // End of variables declaration//GEN-END:variables
}

