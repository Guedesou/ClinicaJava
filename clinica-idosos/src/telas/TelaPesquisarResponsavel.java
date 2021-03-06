/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.responsavel;
import model.dao.ResponsavelDAO;


/**
 *
 * @author matheuszeus
 */
public class TelaPesquisarResponsavel extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisarResponsavel
     */
    public TelaPesquisarResponsavel() {
        initComponents();
        readJTable();
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbResponsavel.getModel();
        modelo.setNumRows(0);
        ResponsavelDAO respdao = new ResponsavelDAO();

        for (responsavel r : respdao.read()) {

            modelo.addRow(new Object[]{
                r.getId(),
                r.getNome(),
                r.getIdade(),
                r.getRg(),
                r.getTelefone(),
                
                

            });

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbResponsavel = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeAtResp = new javax.swing.JTextField();
        txtIdadeAtResp = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtRgAtResp = new javax.swing.JFormattedTextField();
        txtTelefoneAtResp = new javax.swing.JFormattedTextField();

        setTitle("Respons??veis no sistema");

        tbResponsavel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do responsavel", "Idade ", "Rg ", "Telefone"
            }
        ));
        tbResponsavel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbResponsavelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbResponsavel);

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar por respons??vel: ");

        jButton1.setText("Pesquisar");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Idade: ");

        jLabel4.setText("RG: ");

        jLabel5.setText("Telefone:");

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        try {
            txtRgAtResp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefoneAtResp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 351, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeAtResp, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTelefoneAtResp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRgAtResp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdadeAtResp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeAtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdadeAtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRgAtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefoneAtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (tbResponsavel.getSelectedRow() != -1) {
            responsavel r = new responsavel();
            ResponsavelDAO rdao = new ResponsavelDAO();

            r.setNome(txtNomeAtResp.getText());
            r.setIdade(txtIdadeAtResp.getText());
            r.setRg(txtRgAtResp.getText());
            r.setTelefone(txtTelefoneAtResp.getText());
            
            r.setId((int) tbResponsavel.getValueAt(tbResponsavel.getSelectedRow(), 0));
            
            rdao.update(r);

            txtNomeAtResp.setText("");
            txtIdadeAtResp.setText("");
            txtRgAtResp.setText("");
            txtTelefoneAtResp.setText("");
            

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um respons??vel para atualizar.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (tbResponsavel.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        } else {
            responsavel r = new responsavel();
            ResponsavelDAO rdao = new ResponsavelDAO();
            r.setId((int) tbResponsavel.getValueAt(tbResponsavel.getSelectedRow(), 0));
            rdao.delete(r);
            readJTable();
            
            txtNomeAtResp.setText("");
            txtIdadeAtResp.setText("");
            txtRgAtResp.setText("");
            txtTelefoneAtResp.setText("");

            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbResponsavelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResponsavelMouseClicked
        
         if(tbResponsavel.getSelectedRow() != -1){
            txtNomeAtResp.setText(tbResponsavel.getValueAt(tbResponsavel.getSelectedRow(), 1).toString());
            txtIdadeAtResp.setText(tbResponsavel.getValueAt(tbResponsavel.getSelectedRow(), 2).toString());
            txtRgAtResp.setText(tbResponsavel.getValueAt(tbResponsavel.getSelectedRow(), 3).toString());
            txtTelefoneAtResp.setText(tbResponsavel.getValueAt(tbResponsavel.getSelectedRow(), 4).toString());
            
        }
    }//GEN-LAST:event_tbResponsavelMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbResponsavel;
    private javax.swing.JTextField txtIdadeAtResp;
    private javax.swing.JTextField txtNomeAtResp;
    private javax.swing.JFormattedTextField txtRgAtResp;
    private javax.swing.JFormattedTextField txtTelefoneAtResp;
    // End of variables declaration//GEN-END:variables
}
