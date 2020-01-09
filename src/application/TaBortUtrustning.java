/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author MarcusSkarud
 */
public class TaBortUtrustning extends javax.swing.JFrame {

    private static InfDB db;
    /**
     * Creates new form TaBortUtrustning
     */
    public TaBortUtrustning(InfDB db) {
        this.db = db;
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

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        mibpLbl = new javax.swing.JLabel();
        sidLbl = new javax.swing.JLabel();
        skiljestreck = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        header.setBackground(new java.awt.Color(80, 80, 80));
        header.setPreferredSize(new java.awt.Dimension(1095, 100));

        headerLbl.setBackground(new java.awt.Color(120, 120, 120));
        headerLbl.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(200, 200, 200));
        headerLbl.setText("Men in Black - Sektor Skandinavien");

        mibpLbl.setBackground(new java.awt.Color(120, 120, 120));
        mibpLbl.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        mibpLbl.setForeground(new java.awt.Color(200, 200, 200));
        mibpLbl.setText("MiB-Portalen");

        sidLbl.setBackground(new java.awt.Color(120, 120, 120));
        sidLbl.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        sidLbl.setForeground(new java.awt.Color(200, 200, 200));
        sidLbl.setText("Ta bort utrustning");

        skiljestreck.setForeground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mibpLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sidLbl)
                        .addGap(39, 39, 39))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skiljestreck, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headerLbl))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljestreck, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mibpLbl)
                    .addComponent(sidLbl))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(170, 170, 170));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Namn:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Ta bort utrustning");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Avbryt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Välj utrustning:");

        jButton3.setText("Sök");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TaBortUtrustning.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    @SuppressWarnings("unchecked")    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try{
            ArrayList<HashMap<String, String>> sökResultat = db.fetchRows("SELECT * FROM UTRUSTNING WHERE BENAMNING = \'" + jTextField1.getText() + "\'");
        
            if (sökResultat == null){
                JOptionPane.showMessageDialog(null, "Det finns ingen utrustning med det namnet!");
                jTextField1.requestFocus();
            }
            else{

                DefaultComboBoxModel utrustningTillComboBox = new DefaultComboBoxModel();
                for(HashMap utrustning : sökResultat){
                    String utrustningsInfo = "ID: " + utrustning.get("UTRUSTNINGS_ID") + " | Namn: " + utrustning.get("BENAMNING");
                    String utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                    if (utrustningstyp != null){
                        utrustningsInfo += " | Kommunikation | Överföringsteknik: " + db.fetchSingle("SELECT OVERFORINGSTEKNIK FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                    }
                    utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                    if(utrustningstyp != null){
                        utrustningsInfo += " | Teknik | Kraftkälla: " + db.fetchSingle("SELECT KRAFTKALLA FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                    }
                    utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                    if(utrustningstyp != null){
                        utrustningsInfo += " | Vapen | Kaliber: " + db.fetchSingle("SELECT KALIBER FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                    }
                    
                    utrustningTillComboBox.addElement(utrustningsInfo);
                    
                    
                }
                jComboBox1.setModel(utrustningTillComboBox);
            }
        }
        catch(InfException undantag){
            
            System.out.println(undantag);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1ActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] valdUtrustning = jComboBox1.getSelectedItem().toString().split(" ");
        int utrustningsID = Integer.parseInt(valdUtrustning[1]);
        try{
            
        String utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustningsID);
        if (utrustningstyp != null){
            db.delete("DELETE FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustningsID);
        }
        utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustningsID);
        if(utrustningstyp != null){
            db.delete("DELETE FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustningsID);
        }
        utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustningsID);
        if(utrustningstyp != null){
            db.delete("DELETE FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustningsID);
        }    
        db.delete("DELETE FROM UTRUSTNING WHERE UTRUSTNINGS_ID  = " + utrustningsID);
        JOptionPane.showMessageDialog(null, "Utrustningen är borttagen!");
        TaBortUtrustning.this.dispose();
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "FEL!!!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mibpLbl;
    private javax.swing.JLabel sidLbl;
    private javax.swing.JSeparator skiljestreck;
    // End of variables declaration//GEN-END:variables
}