package View;

import javax.swing.*;
import java.awt.*;

public class PantallaDeCarga extends javax.swing.JFrame {

    public PantallaDeCarga() {
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana
    }
    
    public void mostrarPantalla() {
        setVisible(true);
    }

    public void ocultarPantalla() {
        setVisible(false);
    }

    // Método para simular una tarea con barra de progreso
    public void cargarDatos() {
        // Mostrar la pantalla de carga
        mostrarPantalla();
        
        // Crear un nuevo hilo para no bloquear la interfaz
        new Thread(() -> {
            try {
                // Simular carga de datos
                for (int i = 0; i <= 100; i++) {
                    jProgressBar1.setValue(i); // Actualizar el valor de la barra de progreso
                    Thread.sleep(30); // Simular tiempo de carga (ajusta este valor según sea necesario)
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Ocultar la pantalla de carga
                ocultarPantalla();
            }
        }).start(); // Inicia el hilo
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Rage Italic", 0, 36)); // NOI18N
        jLabel1.setText("Programa de Valerio");

        jProgressBar1.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
