package View;

public class InicioView extends javax.swing.JFrame {

    public InicioView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnIrPersona = new javax.swing.JButton();
        btnIrCumpleaños = new javax.swing.JButton();
        btnIrRegalo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 245, 245));

        jLabel2.setText("El proyecto consiste en desarrollar una aplicación de escritorio para registrar y gestionar cumpleaños de personas. La aplicación permitirá agregar, modificar, eliminar y listar cumpleaños, además de almacenar información adicional sobre cada persona y regalos asociados. ");

        btnIrPersona.setBackground(new java.awt.Color(254, 252, 254));
        btnIrPersona.setText("Ingresar una Persona");
        btnIrPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPersonaActionPerformed(evt);
            }
        });

        btnIrCumpleaños.setBackground(new java.awt.Color(254, 252, 254));
        btnIrCumpleaños.setText("Ingresar un Cumpleaños");
        btnIrCumpleaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrCumpleañosActionPerformed(evt);
            }
        });

        btnIrRegalo.setBackground(new java.awt.Color(254, 252, 254));
        btnIrRegalo.setText("Ingresar un Regalo");
        btnIrRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrRegaloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel6.setText("Bienvenido a mi Aplicación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnIrPersona))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnIrCumpleaños))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnIrRegalo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnIrPersona)
                .addGap(18, 18, 18)
                .addComponent(btnIrCumpleaños)
                .addGap(18, 18, 18)
                .addComponent(btnIrRegalo)
                .addContainerGap(58, Short.MAX_VALUE))
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

    private void btnIrPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrPersonaActionPerformed
        new Reg_PersonaView().setVisible(true);
        this.dispose(); // Cierra la vista actual
    }//GEN-LAST:event_btnIrPersonaActionPerformed

    private void btnIrCumpleañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrCumpleañosActionPerformed
        new Reg_CumpleañosView().setVisible(true);
        this.dispose(); // Cierra la vista actual
    }//GEN-LAST:event_btnIrCumpleañosActionPerformed

    private void btnIrRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrRegaloActionPerformed
        new Reg_RegaloView().setVisible(true);
        this.dispose(); // Cierra la vista actual
    }//GEN-LAST:event_btnIrRegaloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrCumpleaños;
    private javax.swing.JButton btnIrPersona;
    private javax.swing.JButton btnIrRegalo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
