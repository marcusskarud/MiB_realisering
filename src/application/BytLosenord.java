/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author MarcusSkarud
 */
public class BytLosenord extends javax.swing.JFrame {

    private String entitetsID;
    private boolean status;
    private static InfDB db;
    private String entitetstyp;
    private String entitetstypID;
    /**
     * Creates new form BytLosenord
     */
    public BytLosenord(InfDB db, String entitetsID, boolean status) {
        this.entitetsID = entitetsID;
        this.status = status;
        this.db = db;
        initComponents();
        checkEntityIdentity(status);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        mibPortalLabel = new javax.swing.JLabel();
        sidLabel = new javax.swing.JLabel();
        skiljeStreck1 = new javax.swing.JSeparator();
        bodyPanel = new javax.swing.JPanel();
        bytLosenordPanel = new javax.swing.JPanel();
        gammaltLosenordLabel = new javax.swing.JLabel();
        nyttLosenord1Label = new javax.swing.JLabel();
        nyttLosenord2Label = new javax.swing.JLabel();
        gammaltLosenordPasswordField = new javax.swing.JPasswordField();
        nyttLosenord1PasswordField = new javax.swing.JPasswordField();
        nyttLosenord2PasswordField = new javax.swing.JPasswordField();
        bytLosenordButton = new javax.swing.JButton();
        avbrytButton = new javax.swing.JButton();
        skiljeStreck2 = new javax.swing.JSeparator();
        skiljeStreck3 = new javax.swing.JSeparator();
        skiljeStreck4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

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
        sidLabel.setText("Byt L�senord");

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
                        .addContainerGap(34, Short.MAX_VALUE))))
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

        bodyPanel.setBackground(new java.awt.Color(40, 40, 40));
        bodyPanel.setForeground(new java.awt.Color(100, 100, 100));

        bytLosenordPanel.setBackground(new java.awt.Color(160, 160, 160));
        bytLosenordPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bytLosenordPanel.setPreferredSize(new java.awt.Dimension(360, 180));

        gammaltLosenordLabel.setForeground(new java.awt.Color(0, 0, 0));
        gammaltLosenordLabel.setText("Gammalt l�senord:");

        nyttLosenord1Label.setForeground(new java.awt.Color(0, 0, 0));
        nyttLosenord1Label.setText("Nytt l�senord:");

        nyttLosenord2Label.setForeground(new java.awt.Color(0, 0, 0));
        nyttLosenord2Label.setText("L�senord:");

        gammaltLosenordPasswordField.setText("123");

        nyttLosenord1PasswordField.setText("123");

        nyttLosenord2PasswordField.setText("123");
        nyttLosenord2PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nyttLosenord2PasswordFieldKeyPressed(evt);
            }
        });

        bytLosenordButton.setText("Byt l�senord");
        bytLosenordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytLosenordButtonActionPerformed(evt);
            }
        });

        avbrytButton.setText("Avbryt");
        avbrytButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytButtonActionPerformed(evt);
            }
        });

        skiljeStreck2.setForeground(new java.awt.Color(180, 180, 180));

        skiljeStreck3.setForeground(new java.awt.Color(180, 180, 180));

        javax.swing.GroupLayout bytLosenordPanelLayout = new javax.swing.GroupLayout(bytLosenordPanel);
        bytLosenordPanel.setLayout(bytLosenordPanelLayout);
        bytLosenordPanelLayout.setHorizontalGroup(
            bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bytLosenordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(skiljeStreck2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bytLosenordPanelLayout.createSequentialGroup()
                        .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bytLosenordPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gammaltLosenordLabel)
                                    .addComponent(nyttLosenord1Label)
                                    .addComponent(nyttLosenord2Label))
                                .addGap(18, 18, 18)
                                .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nyttLosenord2PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(nyttLosenord1PasswordField)
                                    .addComponent(gammaltLosenordPasswordField)))
                            .addComponent(skiljeStreck3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bytLosenordPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(bytLosenordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avbrytButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        bytLosenordPanelLayout.setVerticalGroup(
            bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bytLosenordPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gammaltLosenordLabel)
                    .addComponent(gammaltLosenordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljeStreck2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyttLosenord1PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nyttLosenord1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyttLosenord2Label)
                    .addComponent(nyttLosenord2PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skiljeStreck3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bytLosenordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bytLosenordButton)
                    .addComponent(avbrytButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        skiljeStreck4.setBackground(new java.awt.Color(0, 0, 0));
        skiljeStreck4.setForeground(new java.awt.Color(255, 255, 255));
        skiljeStreck4.setToolTipText("");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skiljeStreck4, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bytLosenordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(skiljeStreck4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bytLosenordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bytLosenordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytLosenordButtonActionPerformed
        // metod som byter l�senrod f�r b�de agent och alien. Denna metod kollar v�rdena som skickas in och vad de matchar. samt
        // om l�senrodet �r inom kraven f�r det som �r angivet.
        try{
            if(new String(gammaltLosenordPasswordField.getPassword()).equals(db.fetchSingle("SELECT LOSENORD FROM " + entitetstyp + " WHERE " + entitetstypID + " = " + entitetsID))){ 
                if (Validering.passwordNotEmpty(nyttLosenord1PasswordField)
                && Validering.passwordNotEmpty(nyttLosenord2PasswordField)
                && Validering.passwordLengthCheck(nyttLosenord1PasswordField)
                && Validering.newPasswordMatch(nyttLosenord1PasswordField, nyttLosenord2PasswordField)){
                    db.update("UPDATE " + entitetstyp + " SET LOSENORD=\'" + new String(nyttLosenord1PasswordField.getPassword()) + "\' WHERE " + entitetstypID +"=" + entitetsID);
                    JOptionPane.showMessageDialog(null, "Nytt l�senord satt!");
                    BytLosenord.this.dispose();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Fel l�senord!");
                gammaltLosenordPasswordField.requestFocus();
            }
        }
        catch(InfException undantag){
            JOptionPane.showMessageDialog(null, "N�gonting gick fel!");
            System.out.println(undantag.getMessage());
        } 
    }//GEN-LAST:event_bytLosenordButtonActionPerformed

    private void avbrytButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytButtonActionPerformed
        // TODO add your handling code here:
        BytLosenord.this.dispose();
    }//GEN-LAST:event_avbrytButtonActionPerformed

    private void nyttLosenord2PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nyttLosenord2PasswordFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            bytLosenordButton.doClick();
        }
    }//GEN-LAST:event_nyttLosenord2PasswordFieldKeyPressed

    //H�r �ndras variabler som k�rs i en SQL fr�ga beroende p� om det �r en alien eller en agent som loggar in.
    private void checkEntityIdentity(boolean status){
        if (status){
            entitetstyp = "AGENT";
            entitetstypID = "AGENT_ID";
        }
        else{
            entitetstyp = "ALIEN";
            entitetstypID = "ALIEN_ID";
        }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbrytButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton bytLosenordButton;
    private javax.swing.JPanel bytLosenordPanel;
    private javax.swing.JLabel gammaltLosenordLabel;
    private javax.swing.JPasswordField gammaltLosenordPasswordField;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel mibPortalLabel;
    private javax.swing.JLabel nyttLosenord1Label;
    private javax.swing.JPasswordField nyttLosenord1PasswordField;
    private javax.swing.JLabel nyttLosenord2Label;
    private javax.swing.JPasswordField nyttLosenord2PasswordField;
    private javax.swing.JLabel sidLabel;
    private javax.swing.JSeparator skiljeStreck1;
    private javax.swing.JSeparator skiljeStreck2;
    private javax.swing.JSeparator skiljeStreck3;
    private javax.swing.JSeparator skiljeStreck4;
    // End of variables declaration//GEN-END:variables
}
