package proyectoelecciones.gui;

import proyectoelecciones.Controller.CrudAll;


public class MenuPrincipal extends javax.swing.JFrame {
    private CrudAll ca;
    
    public MenuPrincipal(CrudAll ca) {
        this.ca = ca;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbRegisE = new javax.swing.JButton();
        jbRegisP = new javax.swing.JButton();
        jbRegisMe = new javax.swing.JButton();
        jbRegisMi = new javax.swing.JButton();
        jbRegisC = new javax.swing.JButton();
        jbRegisA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Electoral");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("Elecciones:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("Candidatos:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setText("Mesas:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("Partidos:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setText("Actas:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setText("Miembros:");

        jbRegisE.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbRegisE.setText("Menu");
        jbRegisE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisEActionPerformed(evt);
            }
        });

        jbRegisP.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbRegisP.setText("Menu");
        jbRegisP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisPActionPerformed(evt);
            }
        });

        jbRegisMe.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbRegisMe.setText("Menu");
        jbRegisMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisMeActionPerformed(evt);
            }
        });

        jbRegisMi.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbRegisMi.setText("Menu");
        jbRegisMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisMiActionPerformed(evt);
            }
        });

        jbRegisC.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbRegisC.setText("Menu");
        jbRegisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisCActionPerformed(evt);
            }
        });

        jbRegisA.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbRegisA.setText("Menu");
        jbRegisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbRegisC)
                            .addComponent(jbRegisMe)
                            .addComponent(jbRegisMi)
                            .addComponent(jbRegisA)
                            .addComponent(jbRegisE)
                            .addComponent(jbRegisP)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRegisE, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jbRegisC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jbRegisP))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jbRegisMe))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jbRegisMi))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegisA)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisCActionPerformed
        CandidatoM ventana = new CandidatoM(ca);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbRegisCActionPerformed

    private void jbRegisPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisPActionPerformed
        PartidoPoliticoM ventana = new PartidoPoliticoM(ca);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbRegisPActionPerformed

    private void jbRegisEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisEActionPerformed
        EleccionesM ventana = new EleccionesM(ca);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbRegisEActionPerformed

    private void jbRegisMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisMeActionPerformed
        MesasElectoralesM ventana = new MesasElectoralesM(ca);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbRegisMeActionPerformed

    private void jbRegisMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisMiActionPerformed
        MiembrosM ventana = new MiembrosM(ca);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbRegisMiActionPerformed

    private void jbRegisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisAActionPerformed
        ActaElectoralM ventana = new ActaElectoralM(ca);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbRegisAActionPerformed


 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbRegisA;
    private javax.swing.JButton jbRegisC;
    private javax.swing.JButton jbRegisE;
    private javax.swing.JButton jbRegisMe;
    private javax.swing.JButton jbRegisMi;
    private javax.swing.JButton jbRegisP;
    // End of variables declaration//GEN-END:variables
}
