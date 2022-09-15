/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package eightpuzzle.view;

import eightpuzzle.EightPuzzle;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author icaro
 */
public class GameWindow extends javax.swing.JPanel {
    private String trader;

    
    public JButton getB1() {
        return B1;
    }

    public JButton getB2() {
        return B2;
    }

    public JButton getB3() {
        return B3;
    }

    public JButton getB4() {
        return B4;
    }

    public JButton getB5() {
        return B5;
    }

    public JButton getB6() {
        return B6;
    }

    public JButton getB7() {
        return B7;
    }

    public JButton getB8() {
        return B8;
    }

    /**
     * Creates new form GameWindow
     */
    public JButton getB9() {    
        return B9;
    }

    public GameWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B1.getText().equals("")){
                trader = B1.getText();
                if(B2.getText().equals("")){
                    B1.setText("");
                    B2.setText(trader);
                }else if(B4.getText().equals("")){
                    B1.setText("");
                    B4.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B4.getText().equals("")){
                trader = B4.getText();
                if(B1.getText().equals("")){
                    B4.setText("");
                    B1.setText(trader);
                }else if(B5.getText().equals("")){
                    B4.setText("");
                    B5.setText(trader);
                }else if(B7.getText().equals("")){
                    B4.setText("");
                    B7.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B7.getText().equals("")){
                trader = B7.getText();
                if(B4.getText().equals("")){
                    B7.setText("");
                    B4.setText(trader);
                }else if(B8.getText().equals("")){
                    B7.setText("");
                    B8.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B2.getText().equals("")){
                trader = B2.getText();
                if(B1.getText().equals("")){
                    B2.setText("");
                    B1.setText(trader);
                }else if(B3.getText().equals("")){
                    B2.setText("");
                    B3.setText(trader);
                }else if(B5.getText().equals("")){
                    B2.setText("");
                    B5.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B3.getText().equals("")){
                trader = B3.getText();
                if(B2.getText().equals("")){
                    B3.setText("");
                    B2.setText(trader);
                }else if(B6.getText().equals("")){
                    B3.setText("");
                    B6.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B5.getText().equals("")){
                trader = B5.getText();
                if(B2.getText().equals("")){
                    B5.setText("");
                    B2.setText(trader);
                }else if(B4.getText().equals("")){
                    B5.setText("");
                    B4.setText(trader);
                }else if(B6.getText().equals("")){
                    B5.setText("");
                    B6.setText(trader);
                }else if(B8.getText().equals("")){
                    B5.setText("");
                    B8.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B6.getText().equals("")){
                trader = B6.getText();
                if(B3.getText().equals("")){
                    B6.setText("");
                    B3.setText(trader);
                }else if(B5.getText().equals("")){
                    B6.setText("");
                    B5.setText(trader);
                }else if(B9.getText().equals("")){
                    B6.setText("");
                    B9.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que vai mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B8.getText().equals("")){
                trader = B8.getText();
                if(B5.getText().equals("")){
                    B8.setText("");
                    B5.setText(trader);
                }else if(B7.getText().equals("")){
                    B8.setText("");
                    B7.setText(trader);
                }else if(B9.getText().equals("")){
                    B8.setText("");
                    B9.setText(trader);
                }else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que quer mover esta peça?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(!B9.getText().equals("")){
                trader = B9.getText();
                if(B6.getText().equals("")){
                    B9.setText("");
                    B6.setText(trader);
                }else if(B8.getText().equals("")){
                    B9.setText("");
                    B8.setText(trader);
                }
                else{
                    JOptionPane.showMessageDialog(null, "A peça não esta adjacente a peça em Branco\n"
                            + "por favor selecione outra peça");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é possível mover a peça em branco!!!");
            }
            EightPuzzle.Test(this);
        }
    }//GEN-LAST:event_B9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    // End of variables declaration//GEN-END:variables
}