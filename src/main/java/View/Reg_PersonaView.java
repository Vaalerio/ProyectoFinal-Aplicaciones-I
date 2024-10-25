package View;

import BaseDatos.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reg_PersonaView extends javax.swing.JFrame {

    public Reg_PersonaView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private boolean validateFields() {
        if (txtNombre.getText().trim().isEmpty() || txtDNI.getText().trim().isEmpty() ||
            txtNacimiento.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty() ||
            snpEdad.getValue() == null) {
            showError("Por favor, complete todos los campos.");
            return false;
        }
        return true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private Connection getConnection() throws SQLException {
        return ConexionBD.getConnection();
    }

    private void cargarDatosTabla() {
        String sql = "SELECT * FROM Personas";
        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) tabla_Personas.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("IDPersona"),
                    rs.getString("Nombre"),
                    rs.getString("DNI"),
                    rs.getDate("FechaNacimiento"),
                    rs.getString("Telefono"),
                    rs.getInt("Edad")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showError("Error al cargar los datos: " + e.getMessage());
        }
    }

    private void clearFields() {
        txtNombre.setText("");
        txtDNI.setText("");
        txtNacimiento.setText("");
        txtTelefono.setText("");
        snpEdad.setValue(0); // or set it to a default value
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        snpEdad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        btnCumpleaños = new javax.swing.JButton();
        btnRegalo = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Personas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Nombre");

        jLabel2.setText("Fecha Nacimiento");

        jLabel3.setText("Teléfono");

        jLabel4.setText("Edad");

        jLabel5.setText("DNI");

        btnCumpleaños.setText("Cumpleaños");
        btnCumpleaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumpleañosActionPerformed(evt);
            }
        });

        btnRegalo.setText("Regalo");
        btnRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegaloActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(174, 198, 255));
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel6.setText("Ingrese los datos de la Persona");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tabla_Personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Persona", "Nombre", "DNI", "Fecha de Nacimiento", "Teléfono", "Edad"
            }
        ));
        jScrollPane2.setViewportView(tabla_Personas);

        btnAgregar.setBackground(new java.awt.Color(204, 255, 204));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(204, 255, 204));
        btnActualizar.setText("Editar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 197, 197));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegalo)
                                .addGap(18, 18, 18)
                                .addComponent(btnInicio)
                                .addGap(18, 18, 18)
                                .addComponent(btnCumpleaños)
                                .addGap(249, 249, 249)
                                .addComponent(btnListar)
                                .addGap(9, 9, 9))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(snpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(snpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCumpleaños)
                        .addComponent(btnRegalo)
                        .addComponent(btnInicio)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCumpleañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumpleañosActionPerformed
        new Reg_CumpleañosView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCumpleañosActionPerformed

    private void btnRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegaloActionPerformed
        new Reg_RegaloView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegaloActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new InicioView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        cargarDatosTabla();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!validateFields()) {
            return;
        }

        String sql = "INSERT INTO Personas (Nombre, DNI, FechaNacimiento, Telefono, Edad) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, txtNombre.getText().trim());
            pst.setString(2, txtDNI.getText().trim());
            pst.setString(3, txtNacimiento.getText().trim());
            pst.setString(4, txtTelefono.getText().trim());
            pst.setInt(5, (Integer) snpEdad.getValue());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Registro de persona agregado exitosamente.");
                cargarDatosTabla();
                clearFields();
            }
        } catch (SQLException e) {
            showError("Error al agregar la persona: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int selectedRow = tabla_Personas.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un registro para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String idPersona = tabla_Personas.getValueAt(selectedRow, 0).toString(); // Obtener ID

        StringBuilder sql = new StringBuilder("UPDATE Personas SET ");
        boolean first = true;

        if (!txtNombre.getText().trim().isEmpty()) {
            if (!first) {
                sql.append(", ");
            }
            sql.append("Nombre = ?");
            first = false;
        }
        if (!txtDNI.getText().trim().isEmpty()) {
            if (!first) {
                sql.append(", ");
            }
            sql.append("DNI = ?");
            first = false;
        }
        if (!txtNacimiento.getText().trim().isEmpty()) {
            if (!first) {
                sql.append(", ");
            }
            sql.append("FechaNacimiento = ?");
            first = false;
        }
        if (!txtTelefono.getText().trim().isEmpty()) {
            if (!first) {
                sql.append(", ");
            }
            sql.append("Telefono = ?");
            first = false;
        }
        if (snpEdad.getValue() != null) {
            if (!first) {
                sql.append(", ");
            }
            sql.append("Edad = ?");
        }

        sql.append(" WHERE IDPersona = ?");

        try (Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(sql.toString())) {
            int index = 1;

            if (!txtNombre.getText().trim().isEmpty()) {
                pst.setString(index++, txtNombre.getText().trim());
            }
            if (!txtDNI.getText().trim().isEmpty()) {
                pst.setString(index++, txtDNI.getText().trim());
            }
            if (!txtNacimiento.getText().trim().isEmpty()) {
                pst.setString(index++, txtNacimiento.getText().trim());
            }
            if (!txtTelefono.getText().trim().isEmpty()) {
                pst.setString(index++, txtTelefono.getText().trim());
            }
            if (snpEdad.getValue() != null) {
                pst.setInt(index++, (Integer) snpEdad.getValue());
            }

            pst.setString(index, idPersona); // Establecer IDPersona

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Registro de persona actualizado exitosamente.");
                cargarDatosTabla();
                clearFields();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar la persona: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tabla_Personas.getSelectedRow();
        if (selectedRow < 0) {
            showError("Por favor, seleccione un registro para eliminar.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar este registro?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String idPersona = tabla_Personas.getValueAt(selectedRow, 0).toString();

            // Primero eliminamos de la tabla Cumpleaños
            String sqlCumpleaños = "DELETE FROM Cumpleaños WHERE IDPersona = ?";
            try (Connection con = getConnection(); PreparedStatement pstCumpleaños = con.prepareStatement(sqlCumpleaños)) {
                pstCumpleaños.setString(1, idPersona);
                pstCumpleaños.executeUpdate();
            } catch (SQLException e) {
                showError("Error al eliminar de Cumpleaños: " + e.getMessage());
                return;
            }

            // Ahora eliminamos de Personas
            String sqlPersonas = "DELETE FROM Personas WHERE IDPersona = ?";
            try (Connection con = getConnection(); PreparedStatement pstPersonas = con.prepareStatement(sqlPersonas)) {
                pstPersonas.setString(1, idPersona);

                if (pstPersonas.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this, "Registro de persona eliminado exitosamente.");
                    cargarDatosTabla();
                    clearFields();
                }
            } catch (SQLException e) {
                showError("Error al eliminar la persona: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCumpleaños;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegalo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner snpEdad;
    private javax.swing.JTable tabla_Personas;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
