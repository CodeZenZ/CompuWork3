/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantalla;

/**
 *
 * @author Tecnologia
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        btnCrear = new javax.swing.JButton("Crear Empleado");
btnEliminar = new javax.swing.JButton("Eliminar Empleado");
btnActualizar = new javax.swing.JButton("Actualizar Empleado");
btnListar = new javax.swing.JButton("Listar Empleados");
btnSalir = new javax.swing.JButton("Salir");

setTitle("Menú Principal - CompuWork");
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setLayout(null); // Layout absoluto para ubicar botones con coordenadas

// Posicionamiento de botones
btnCrear.setBounds(100, 30, 200, 30);
btnEliminar.setBounds(100, 70, 200, 30);
btnActualizar.setBounds(100, 110, 200, 30);
btnListar.setBounds(100, 150, 200, 30);
btnSalir.setBounds(100, 190, 200, 30);

// Agregar botones al frame
add(btnCrear);
add(btnEliminar);
add(btnActualizar);
add(btnListar);
add(btnSalir);

// Acción: Crear empleado
btnCrear.addActionListener(e -> {
    String nombre = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el nombre del empleado:");
    if (nombre != null && !nombre.trim().isEmpty()) {
        empleados.add(nombre.trim());
        javax.swing.JOptionPane.showMessageDialog(this, "Empleado creado exitosamente.");
    }
});

// Acción: Eliminar empleado
btnEliminar.addActionListener(e -> {
    String nombre = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el nombre del empleado a eliminar:");
    if (empleados.remove(nombre)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Empleado eliminado.");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
    }
});

// Acción: Actualizar empleado
btnActualizar.addActionListener(e -> {
    String actual = javax.swing.JOptionPane.showInputDialog(this, "Nombre actual del empleado:");
    if (empleados.contains(actual)) {
        String nuevo = javax.swing.JOptionPane.showInputDialog(this, "Nuevo nombre:");
        empleados.set(empleados.indexOf(actual), nuevo);
        javax.swing.JOptionPane.showMessageDialog(this, "Empleado actualizado.");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
    }
});

// Acción: Listar empleados
btnListar.addActionListener(e -> {
    if (empleados.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay empleados registrados.");
    } else {
        StringBuilder lista = new StringBuilder("Empleados:\n");
        for (String emp : empleados) {
            lista.append("- ").append(emp).append("\n");
        }
        javax.swing.JOptionPane.showMessageDialog(this, lista.toString());
    }
});

// Acción: Salir
btnSalir.addActionListener(e -> {
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Salir", javax.swing.JOptionPane.YES_NO_OPTION);
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        dispose();
    }
});

setSize(420, 300);
setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
private javax.swing.JButton btnCrear;
private javax.swing.JButton btnEliminar;
private javax.swing.JButton btnActualizar;
private javax.swing.JButton btnListar;
private javax.swing.JButton btnSalir;
private java.util.List<String> empleados = new java.util.ArrayList<>();

}
