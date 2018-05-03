/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Form;

import br.edu.satc.Objetos.Grupo;
import br.edu.satc.Objetos.Lobo;
import br.edu.satc.Objetos.Peixe;
import br.edu.satc.Objetos.Zoologico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class TelaAnimal extends javax.swing.JFrame {
    Zoologico z = new Zoologico();
    
    void desabilitarLobo(){
        this.jTFDatadeNascimentodoLobo.setEnabled(false);
        this.jTFPesodoLobo.setEnabled(false);
        this.jTFTamanhodoLobo.setEnabled(false);
    
    
    
    }
    
    void habilitarLobo(){
        this.jTFDatadeNascimentodoLobo.setEnabled(true);
        this.jTFPesodoLobo.setEnabled(true);
        this.jTFTamanhodoLobo.setEnabled(true);


}
    
    void desabilitarPeixe(){
        this.jTFTipoPeixe.setEnabled(false);
    }
    
    void habilitarPeixe(){
        this.jTFTipoPeixe.setEnabled(true);
    
    }

    /**
     * Creates new form TelaAnimal
     */
    public TelaAnimal() {
        initComponents();
        desabilitarLobo();
        desabilitarPeixe();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTituloDoForm = new javax.swing.JLabel();
        jBCadastro = new javax.swing.JButton();
        jBConsultaCadastradas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLGrupo = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFDescricao = new javax.swing.JTextField();
        jRBPeixe = new javax.swing.JRadioButton();
        jRBLobo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLAnimal = new javax.swing.JLabel();
        jLDescricaodoAnimal = new javax.swing.JLabel();
        jLStatusdoAnimal = new javax.swing.JLabel();
        jTFDescricaoAnimal = new javax.swing.JTextField();
        jTFStatusAnimal = new javax.swing.JTextField();
        jPPaineldoLobo = new javax.swing.JPanel();
        jLTituloLobo = new javax.swing.JLabel();
        jLPesoLobo = new javax.swing.JLabel();
        jLTamanhoLobo = new javax.swing.JLabel();
        jLDataNascimentoLobo = new javax.swing.JLabel();
        jTFPesodoLobo = new javax.swing.JTextField();
        jTFTamanhodoLobo = new javax.swing.JTextField();
        jTFDatadeNascimentodoLobo = new javax.swing.JTextField();
        jPPaineldoPeixe = new javax.swing.JPanel();
        jLTituloPeixe = new javax.swing.JLabel();
        jLTipodoPeixe = new javax.swing.JLabel();
        jTFTipoPeixe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTituloDoForm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLTituloDoForm.setText("Cadastro de Animais");

        jBCadastro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBCadastro.setText("Cadastro");
        jBCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroActionPerformed(evt);
            }
        });

        jBConsultaCadastradas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBConsultaCadastradas.setText("Consulta Cadastradas");
        jBConsultaCadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultaCadastradasActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLGrupo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLGrupo.setText("Grupo");

        jLNome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLNome.setText("Nome");

        jLDescricao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLDescricao.setText("Descrição");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(jTFDescricao))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLGrupo)
                .addGap(26, 26, 26)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jRBPeixe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRBPeixe.setText("Peixe");
        jRBPeixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPeixeActionPerformed(evt);
            }
        });

        jRBLobo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRBLobo.setText("Lobo");
        jRBLobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLoboActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLAnimal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLAnimal.setText("Animal");

        jLDescricaodoAnimal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLDescricaodoAnimal.setText("Descrição");

        jLStatusdoAnimal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLStatusdoAnimal.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLStatusdoAnimal)
                    .addComponent(jLDescricaodoAnimal)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFStatusAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFDescricaoAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLAnimal)
                .addGap(18, 18, 18)
                .addComponent(jLDescricaodoAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFDescricaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLStatusdoAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFStatusAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPPaineldoLobo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLTituloLobo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLTituloLobo.setText("Lobo");

        jLPesoLobo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLPesoLobo.setText("Peso");

        jLTamanhoLobo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLTamanhoLobo.setText("Tamanho");

        jLDataNascimentoLobo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLDataNascimentoLobo.setText("Data de Nascimento");

        jTFPesodoLobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesodoLoboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPaineldoLoboLayout = new javax.swing.GroupLayout(jPPaineldoLobo);
        jPPaineldoLobo.setLayout(jPPaineldoLoboLayout);
        jPPaineldoLoboLayout.setHorizontalGroup(
            jPPaineldoLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPaineldoLoboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPaineldoLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFPesodoLobo)
                    .addGroup(jPPaineldoLoboLayout.createSequentialGroup()
                        .addGroup(jPPaineldoLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPesoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPPaineldoLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLTamanhoLobo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLTituloLobo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLDataNascimentoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(jTFTamanhodoLobo)
                    .addComponent(jTFDatadeNascimentodoLobo))
                .addContainerGap())
        );
        jPPaineldoLoboLayout.setVerticalGroup(
            jPPaineldoLoboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPaineldoLoboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloLobo)
                .addGap(18, 18, 18)
                .addComponent(jLPesoLobo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPesodoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLTamanhoLobo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTamanhodoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLDataNascimentoLobo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDatadeNascimentodoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPPaineldoPeixe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLTituloPeixe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLTituloPeixe.setText("Peixe");

        jLTipodoPeixe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLTipodoPeixe.setText("Tipo");

        javax.swing.GroupLayout jPPaineldoPeixeLayout = new javax.swing.GroupLayout(jPPaineldoPeixe);
        jPPaineldoPeixe.setLayout(jPPaineldoPeixeLayout);
        jPPaineldoPeixeLayout.setHorizontalGroup(
            jPPaineldoPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPaineldoPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPaineldoPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTipoPeixe)
                    .addGroup(jPPaineldoPeixeLayout.createSequentialGroup()
                        .addGroup(jPPaineldoPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTituloPeixe)
                            .addComponent(jLTipodoPeixe))
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPPaineldoPeixeLayout.setVerticalGroup(
            jPPaineldoPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPaineldoPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloPeixe)
                .addGap(14, 14, 14)
                .addComponent(jLTipodoPeixe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTipoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTituloDoForm, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBPeixe)
                                .addGap(29, 29, 29)
                                .addComponent(jRBLobo))
                            .addComponent(jBCadastro)
                            .addComponent(jBConsultaCadastradas)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPPaineldoLobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPPaineldoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLTituloDoForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBPeixe)
                            .addComponent(jRBLobo))
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBConsultaCadastradas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPPaineldoLobo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPPaineldoPeixe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroActionPerformed
        if (jRBLobo.isSelected()){
       
          float pesoLobo = 0;
          float tamanhoLobo = 0;
          Date dataNascimentoLobo = null;
          String descricaoGrupoLobo,nomeGrupoLobo, descricaoAnimalLobo;
          char statusLobo= ' ';
          try{
          pesoLobo =Float.parseFloat(jTFPesodoLobo.getText());
           }catch (NumberFormatException sioobe){
              JOptionPane.showMessageDialog(this, sioobe);
          
          }
          try{
          tamanhoLobo = Float.parseFloat(jTFTamanhodoLobo.getText());
           }catch (NumberFormatException nfe){
              JOptionPane.showMessageDialog(this, nfe);
          
          }
          
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         
         
              try{
                dataNascimentoLobo = sdf.parse(jTFDatadeNascimentodoLobo.getText());
              }catch(ParseException pe){
                  JOptionPane.showMessageDialog(this, pe);
                  return;
              }
               
           
          descricaoGrupoLobo = jTFDescricao.getText();
          nomeGrupoLobo = jTFNome.getText();
          descricaoAnimalLobo = jTFDescricaoAnimal.getText();
          try{
          statusLobo = jTFStatusAnimal.getText().toUpperCase().charAt(0);
          }catch(StringIndexOutOfBoundsException sioobe){
              JOptionPane.showMessageDialog(this, sioobe);
              return;
          
          }
          z.getAnimais().add(new Lobo(pesoLobo,tamanhoLobo,dataNascimentoLobo,new Grupo(nomeGrupoLobo,descricaoGrupoLobo),descricaoAnimalLobo,statusLobo));
    
               
            
        
        }else if (jRBPeixe.isSelected()){
            String descricaoAnimal, nomeGrupo, descricaoGrupo,tipo;
            char status= ' ';
            descricaoAnimal = jTFDescricaoAnimal.getText();
            nomeGrupo = jTFNome.getText();
            descricaoGrupo = jTFDescricao.getText();
            tipo = jTFTipoPeixe.getText();
            try{
            status = jTFStatusAnimal.getText().toUpperCase().charAt(0);
            }catch(StringIndexOutOfBoundsException sioobe){
                JOptionPane.showMessageDialog(this, sioobe);
                return;
            
            }
            z.getAnimais().add(new Peixe(tipo,new Grupo(nomeGrupo, descricaoGrupo), descricaoAnimal, status));
            
        }else{
            JOptionPane.showMessageDialog(this,"Favor selecionar uma das opções \"Lobo ou peixe");
        
        }
    }//GEN-LAST:event_jBCadastroActionPerformed

    private void jTFPesodoLoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesodoLoboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesodoLoboActionPerformed

    private void jRBPeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPeixeActionPerformed
        if(jRBLobo.isSelected()){
            jRBLobo.setSelected(false);
            desabilitarLobo();
        
        
        }
        habilitarPeixe();
    }//GEN-LAST:event_jRBPeixeActionPerformed

    private void jRBLoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLoboActionPerformed
        if(jRBPeixe.isSelected()){
            jRBPeixe.setSelected(false);
            desabilitarPeixe();
        
        }
        habilitarLobo();
    }//GEN-LAST:event_jRBLoboActionPerformed

    private void jBConsultaCadastradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultaCadastradasActionPerformed
        JOptionPane.showMessageDialog(this, z.toString());
    }//GEN-LAST:event_jBConsultaCadastradasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastro;
    private javax.swing.JButton jBConsultaCadastradas;
    private javax.swing.JLabel jLAnimal;
    private javax.swing.JLabel jLDataNascimentoLobo;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLDescricaodoAnimal;
    private javax.swing.JLabel jLGrupo;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPesoLobo;
    private javax.swing.JLabel jLStatusdoAnimal;
    private javax.swing.JLabel jLTamanhoLobo;
    private javax.swing.JLabel jLTipodoPeixe;
    private javax.swing.JLabel jLTituloDoForm;
    private javax.swing.JLabel jLTituloLobo;
    private javax.swing.JLabel jLTituloPeixe;
    private javax.swing.JPanel jPPaineldoLobo;
    private javax.swing.JPanel jPPaineldoPeixe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRBLobo;
    private javax.swing.JRadioButton jRBPeixe;
    private javax.swing.JTextField jTFDatadeNascimentodoLobo;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFDescricaoAnimal;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesodoLobo;
    private javax.swing.JTextField jTFStatusAnimal;
    private javax.swing.JTextField jTFTamanhodoLobo;
    private javax.swing.JTextField jTFTipoPeixe;
    // End of variables declaration//GEN-END:variables
}