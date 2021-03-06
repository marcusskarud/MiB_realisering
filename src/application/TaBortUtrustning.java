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

        sidPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        mibPortalLabel = new javax.swing.JLabel();
        sidLabel = new javax.swing.JLabel();
        skiljeStreck1 = new javax.swing.JSeparator();
        bodyPanel = new javax.swing.JPanel();
        utrustningNamnLabel = new javax.swing.JLabel();
        valjUtrustningLabel = new javax.swing.JLabel();
        utrustningNamnTextField = new javax.swing.JTextField();
        valjUtrustningBox = new javax.swing.JComboBox<>();
        sokUtrustningButton = new javax.swing.JButton();
        taBortUtrustningButton = new javax.swing.JButton();
        avbrytButton = new javax.swing.JButton();
        skiljeStreck2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sidPanel.setBackground(new java.awt.Color(40, 40, 40));

        headerPanel.setBackground(new java.awt.Color(80, 80, 80));
        headerPanel.setPreferredSize(new java.awt.Dimension(1095, 100));

        headerLabel.setBackground(new java.awt.Color(120, 120, 120));
        headerLabel.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(200, 200, 200));
        headerLabel.setText("Men in Black - Sektor Skandinavien");

        mibPortalLabel.setBackground(new java.awt.Color(120, 120, 120));
        mibPortalLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        mibPortalLabel.setForeground(new java.awt.Color(200, 200, 200));
        mibPortalLabel.setText("MiB-Portalen");

        sidLabel.setBackground(new java.awt.Color(120, 120, 120));
        sidLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        sidLabel.setForeground(new java.awt.Color(200, 200, 200));
        sidLabel.setText("Ta bort utrustning");

        skiljeStreck1.setForeground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mibPortalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sidLabel)
                        .addGap(39, 39, 39))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skiljeStreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headerLabel))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljeStreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mibPortalLabel)
                    .addComponent(sidLabel))
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(170, 170, 170));
        bodyPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        utrustningNamnLabel.setForeground(new java.awt.Color(0, 0, 0));
        utrustningNamnLabel.setText("Namn:");

        valjUtrustningLabel.setForeground(new java.awt.Color(0, 0, 0));
        valjUtrustningLabel.setText("V�lj utrustning:");

        utrustningNamnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningNamnTextFieldActionPerformed(evt);
            }
        });

        valjUtrustningBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));

        sokUtrustningButton.setText("S�k");
        sokUtrustningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokUtrustningButtonActionPerformed(evt);
            }
        });

        taBortUtrustningButton.setText("Ta bort utrustning");
        taBortUtrustningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortUtrustningButtonActionPerformed(evt);
            }
        });

        avbrytButton.setText("Avbryt");
        avbrytButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(taBortUtrustningButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avbrytButton)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(skiljeStreck2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valjUtrustningBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(valjUtrustningLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(utrustningNamnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(utrustningNamnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sokUtrustningButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utrustningNamnLabel)
                    .addComponent(utrustningNamnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sokUtrustningButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(skiljeStreck2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valjUtrustningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valjUtrustningBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avbrytButton)
                    .addComponent(taBortUtrustningButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout sidPanelLayout = new javax.swing.GroupLayout(sidPanel);
        sidPanel.setLayout(sidPanelLayout);
        sidPanelLayout.setHorizontalGroup(
            sidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addGroup(sidPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sidPanelLayout.setVerticalGroup(
            sidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avbrytButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytButtonActionPerformed
        TaBortUtrustning.this.dispose();
    }//GEN-LAST:event_avbrytButtonActionPerformed

    @SuppressWarnings("unchecked")    
        // hittar vapnet med det �verenst�mmande namnet som angivs i s�kf�ltet och yfller ut information i comboboxen beroende p� vilket vapen som s�ks.
        // om inget vapen med ett namn finns s� angivs �ven det.
    private void utrustningNamnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningNamnTextFieldActionPerformed
        if (Validering.textNotEmpty(utrustningNamnTextField)){
            try{
                ArrayList<HashMap<String, String>> s�kResultat = db.fetchRows("SELECT * FROM UTRUSTNING WHERE BENAMNING = \'" + utrustningNamnTextField.getText() + "\'");

                if (s�kResultat == null){
                    JOptionPane.showMessageDialog(null, "Det finns ingen utrustning med det namnet!");
                    utrustningNamnTextField.requestFocus();
                }
                else{

                    DefaultComboBoxModel utrustningTillComboBox = new DefaultComboBoxModel();
                    for(HashMap utrustning : s�kResultat){
                        String utrustningsInfo = "ID: " + utrustning.get("UTRUSTNINGS_ID") + " | Namn: " + utrustning.get("BENAMNING");
                        String utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        if (utrustningstyp != null){
                            utrustningsInfo += " | Kommunikation | �verf�ringsteknik: " + db.fetchSingle("SELECT OVERFORINGSTEKNIK FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        }
                        utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        if(utrustningstyp != null){
                            utrustningsInfo += " | Teknik | Kraftk�lla: " + db.fetchSingle("SELECT KRAFTKALLA FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        }
                        utrustningstyp = db.fetchSingle("SELECT UTRUSTNINGS_ID FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        if(utrustningstyp != null){
                            utrustningsInfo += " | Vapen | Kaliber: " + db.fetchSingle("SELECT KALIBER FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrustning.get("UTRUSTNINGS_ID"));
                        }

                        utrustningTillComboBox.addElement(utrustningsInfo);


                    }
                    valjUtrustningBox.setModel(utrustningTillComboBox);
                }
            }
            catch(InfException undantag){

                System.out.println(undantag);
            }
        }
    }//GEN-LAST:event_utrustningNamnTextFieldActionPerformed

    private void sokUtrustningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokUtrustningButtonActionPerformed
        utrustningNamnTextFieldActionPerformed(evt);
    }//GEN-LAST:event_sokUtrustningButtonActionPerformed
        
    // funktion f�r att ta bort vald utsutning i comboboxf�ltet.
    private void taBortUtrustningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortUtrustningButtonActionPerformed
        if (Validering.textNotEmpty(utrustningNamnTextField) && Validering.JComboBoxNotEmpty(valjUtrustningBox)){
            String[] valdUtrustning = valjUtrustningBox.getSelectedItem().toString().split(" ");
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
                db.delete("DELETE FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID  = " + utrustningsID);
                db.delete("DELETE FROM UTRUSTNING WHERE UTRUSTNINGS_ID  = " + utrustningsID);

                JOptionPane.showMessageDialog(null, "Utrustningen �r borttagen!");
                TaBortUtrustning.this.dispose();
            }
            catch (InfException undantag){
                JOptionPane.showMessageDialog(null, "FEL!!!!!");
            }
        }
    }//GEN-LAST:event_taBortUtrustningButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbrytButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel mibPortalLabel;
    private javax.swing.JLabel sidLabel;
    private javax.swing.JPanel sidPanel;
    private javax.swing.JSeparator skiljeStreck1;
    private javax.swing.JSeparator skiljeStreck2;
    private javax.swing.JButton sokUtrustningButton;
    private javax.swing.JButton taBortUtrustningButton;
    private javax.swing.JLabel utrustningNamnLabel;
    private javax.swing.JTextField utrustningNamnTextField;
    private javax.swing.JComboBox<String> valjUtrustningBox;
    private javax.swing.JLabel valjUtrustningLabel;
    // End of variables declaration//GEN-END:variables
}
