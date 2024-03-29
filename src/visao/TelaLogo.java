/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import com.formdev.flatlaf.FlatLightLaf;


/**
 *
 * @author pcgamergab
 */
public class TelaLogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogo() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCardapio = new javax.swing.JButton();
        jButtonGerente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo de Hamburgueria Artesanal (4).png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButtonCardapio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonCardapio.setForeground(new java.awt.Color(153, 153, 153));
        jButtonCardapio.setText("Cardápio");
        jButtonCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCardapioActionPerformed(evt);
            }
        });

        jButtonGerente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonGerente.setForeground(new java.awt.Color(153, 153, 153));
        jButtonGerente.setText("Gerente");
        jButtonGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCardapio)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCardapio)
                    .addComponent(jButtonGerente))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCardapioActionPerformed
        // TODO add your handling code here:
        TelaCardapio tela = new TelaCardapio();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonCardapioActionPerformed

    private void jButtonGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenteActionPerformed
        TelaDoGerente telag = new TelaDoGerente();
        telag.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGerenteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCardapio;
    private javax.swing.JButton jButtonGerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
