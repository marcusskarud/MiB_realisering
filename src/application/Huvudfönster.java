package application;

import oru.inf.InfDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarcusSkarud
 */
public class Huvudf�nster extends javax.swing.JFrame {

    private static InfDB db;
    /**
     * Creates new form NewJFrame
     */
    public Huvudf�nster(InfDB db) {
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

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        mibPortalLabel = new javax.swing.JLabel();
        skiljeStreck1 = new javax.swing.JSeparator();
        bodyPanel = new javax.swing.JPanel();
        v�lkommenLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        agentLoginButton = new javax.swing.JButton();
        alienLoginButton = new javax.swing.JButton();
        skiljeStreck2 = new javax.swing.JSeparator();
        creditsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        headerPanel.setBackground(new java.awt.Color(40, 40, 40));
        headerPanel.setPreferredSize(new java.awt.Dimension(1095, 100));

        headerLabel.setBackground(new java.awt.Color(120, 120, 120));
        headerLabel.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(180, 180, 180));
        headerLabel.setText("Men in Black - Sektor Skandinavien");

        mibPortalLabel.setBackground(new java.awt.Color(120, 120, 120));
        mibPortalLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        mibPortalLabel.setForeground(new java.awt.Color(180, 180, 180));
        mibPortalLabel.setText("MiB-Portalen");

        skiljeStreck1.setForeground(new java.awt.Color(80, 80, 80));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(headerLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(mibPortalLabel))
                            .addComponent(skiljeStreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljeStreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mibPortalLabel)
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(80, 80, 80));
        bodyPanel.setForeground(new java.awt.Color(100, 100, 100));

        v�lkommenLabel.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        v�lkommenLabel.setForeground(new java.awt.Color(255, 255, 255));
        v�lkommenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v�lkommenLabel.setText("V�lkommen till Men in Black-portalen");

        infoLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Logga in nedan");

        agentLoginButton.setBackground(new java.awt.Color(150, 150, 150));
        agentLoginButton.setForeground(new java.awt.Color(0, 0, 0));
        agentLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agentIkon.png"))); // NOI18N
        agentLoginButton.setText("Agent");
        agentLoginButton.setIconTextGap(0);
        agentLoginButton.setOpaque(false);
        agentLoginButton.setPreferredSize(new java.awt.Dimension(200, 200));
        agentLoginButton.setSize(new java.awt.Dimension(200, 200));
        agentLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentLoginButtonActionPerformed(evt);
            }
        });

        alienLoginButton.setBackground(new java.awt.Color(150, 150, 150));
        alienLoginButton.setForeground(new java.awt.Color(0, 0, 0));
        alienLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alienIkon.png"))); // NOI18N
        alienLoginButton.setText("Alien");
        alienLoginButton.setIconTextGap(0);
        alienLoginButton.setOpaque(false);
        alienLoginButton.setPreferredSize(new java.awt.Dimension(200, 200));
        alienLoginButton.setSize(new java.awt.Dimension(200, 200));
        alienLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienLoginButtonActionPerformed(evt);
            }
        });

        skiljeStreck2.setBackground(new java.awt.Color(0, 0, 0));
        skiljeStreck2.setForeground(new java.awt.Color(255, 255, 255));
        skiljeStreck2.setToolTipText("");

        creditsButton.setForeground(new java.awt.Color(0, 0, 0));
        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(agentLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alienLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addComponent(v�lkommenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addComponent(skiljeStreck2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(creditsButton)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(skiljeStreck2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(v�lkommenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addGap(50, 50, 50)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alienLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(creditsButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
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
    // �ppnar en ny jFrame "Login" d�r du uppmanas att skriva in ID och L�senrod f�r agenter.
    private void agentLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentLoginButtonActionPerformed
        new Login(db, true).setVisible(true);
    }//GEN-LAST:event_agentLoginButtonActionPerformed
// �ppnar en ny jFrame "Login" d�r du uppmanas att skriva in ID och L�senrod f�r alien.
    private void alienLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienLoginButtonActionPerformed
        new Login(db, false).setVisible(true);
    }//GEN-LAST:event_alienLoginButtonActionPerformed
// �ppnar en ny jFrame "Credits" d�r den visar utvecklarna f�r systemet.
    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        new Credits().setVisible(true);
    }//GEN-LAST:event_creditsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agentLoginButton;
    private javax.swing.JButton alienLoginButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton creditsButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel mibPortalLabel;
    private javax.swing.JSeparator skiljeStreck1;
    private javax.swing.JSeparator skiljeStreck2;
    private javax.swing.JLabel v�lkommenLabel;
    // End of variables declaration//GEN-END:variables
}
