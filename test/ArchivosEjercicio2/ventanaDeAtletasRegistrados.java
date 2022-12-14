package ArchivosEjercicio2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fisher
 */
public class ventanaDeAtletasRegistrados extends javax.swing.JDialog {

    DefaultTableModel modeloTabla = new DefaultTableModel();

    public ventanaDeAtletasRegistrados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        cargarFormatoTabla();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void cargarFormatoTabla() {
        //COLUMNAS
        modeloTabla.addColumn("NOMBRE");
        modeloTabla.addColumn("EDAD");
        modeloTabla.addColumn("PESO EN KG");
        modeloTabla.addColumn("ESTATURA EN CM");
        //FILAS
        leerBinario();
    }

    private void leerBinario() {
        try {
            FileInputStream archivo = new FileInputStream("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\registroAtletas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            //LECTURA DE ARCHIVOS
            Atleta atleta;
            String nombre, edad, peso, estatura;
            while (true) {
                atleta = (Atleta) lectura.readObject();
                nombre = atleta.getNombre();
                edad = String.valueOf(atleta.getEdad());
                peso = String.valueOf(atleta.getPeso());
                estatura = String.valueOf(atleta.getEstatura());
                //Metemos todos los valores en un arreglo y lo añadimos a la fila
                String [] fila= {nombre,edad,peso,estatura};
                modeloTabla.addRow(fila);
            }
        } catch (EOFException ex) {
            return; //SE LLEGO AL FINAL DEL ARCHIVO
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR, LA RUTA DEl DE ARCHIVO DONDE SE REGISTRAN LOS ATLETAS NO SE ENCUENTRA",
                    "ARCHIVO DE REGISTRO NO ENCONTRADO",
                    JOptionPane.WARNING_MESSAGE);
            System.err.println("ERROR, EL ARCHIVO NO HA SIDO ENCONTRADO " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR, NO SE PUEDE LEER EL ARCHIVO " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("LA CLASE ATLETA NO SE ENCUENTRA EN EL PAQUETE " + ex);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistrados = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ATLETAS REGISTRADOS");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATLETAS REGISTRADOS HASTA EL MOMENTO");

        tablaRegistrados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaRegistrados.setModel(modeloTabla);
        jScrollPane1.setViewportView(tablaRegistrados);

        botonRegresar.setBackground(new java.awt.Color(0, 0, 255));
        botonRegresar.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("REGRESAR");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRegresar)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(botonRegresar)
                .addGap(20, 20, 20))
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

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();//CERRAR VENTANA
    }//GEN-LAST:event_botonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaDeAtletasRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaDeAtletasRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaDeAtletasRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaDeAtletasRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaDeAtletasRegistrados dialog = new ventanaDeAtletasRegistrados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistrados;
    // End of variables declaration//GEN-END:variables

}
