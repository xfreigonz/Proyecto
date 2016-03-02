
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana_Clientes extends javax.swing.JFrame {

    Conector con = new Conector();
    private boolean modificar = false;

    public Ventana_Clientes() {
        initComponents();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        entNombre = new javax.swing.JTextField();
        entApellidos = new javax.swing.JTextField();
        entDireccion = new javax.swing.JTextField();
        entTelefono = new javax.swing.JTextField();
        entMail = new javax.swing.JTextField();
        btAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        entDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        jFrame1.setMinimumSize(new java.awt.Dimension(500, 400));
        jFrame1.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        jLabel5.setText("Mail");

        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("DNI");

        entDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                entDnicomprobarDNI(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(entApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(entDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(entMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(entTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrame1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {entApellidos, entDireccion, entDni, entMail, entNombre, entTelefono, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel7});

        jFrame1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAceptar, btnCancelar});

        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(entDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(entMail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAceptar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jFrame1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {entApellidos, entDireccion, entDni, entMail, entNombre, entTelefono, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel7});

        jFrame1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAceptar, btnCancelar});

        setMinimumSize(new java.awt.Dimension(450, 300));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de clientes"));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Direccion", "Telefono", "Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setMinimumSize(new java.awt.Dimension(100, 80));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.setEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan_left.gif"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setIconTextGap(5);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnVolver)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBorrar, btnModificar, btnNuevo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBorrar, btnModificar, btnNuevo});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        entDni.setBackground(null);
        entDni.setText("");
        entApellidos.setText("");
        entDireccion.setText("");
        entNombre.setText("");
        entMail.setText("");
        entTelefono.setText("");
        entDni.setEnabled(true);
        modificar = false;
        jFrame1.setLocationRelativeTo(this);
        jFrame1.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = tablaClientes.getSelectedRow();
        entDni.setText((String) tablaClientes.getValueAt(fila, 0));
        entDni.setEnabled(false);
        entNombre.setText((String) tablaClientes.getValueAt(fila, 1));
        entApellidos.setText((String) tablaClientes.getValueAt(fila, 2));
        entDireccion.setText((String) tablaClientes.getValueAt(fila, 3));
        entTelefono.setText("" + tablaClientes.getValueAt(fila, 4));
        entMail.setText((String) tablaClientes.getValueAt(fila, 5));
        modificar = true;
        jFrame1.setLocationRelativeTo(this);
        jFrame1.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            con.connect();
            int fila = tablaClientes.getSelectedRow();
            PreparedStatement ps = con.conect.prepareStatement("delete from Clientes WHERE  \"DNI\" = ?");
            String dni = (String) tablaClientes.getValueAt(fila, 0);
            ps.setString(1, dni);
            ps.execute();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            con.close();
        }
        actualizar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        btnBorrar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        try {
            if (!modificar) {
                if (entDni.getBackground() == Color.GREEN) {
                    String dni = entDni.getText();
                    String apellidos = entApellidos.getText();
                    String calle = entDireccion.getText();
                    String nombre = entNombre.getText();
                    String mail = entMail.getText();
                    int telefono = Integer.parseInt(entTelefono.getText());
                    if ((!nombre.isEmpty()) && (!calle.isEmpty())) {
                        con.connect();
                        String sql = "insert into Clientes(DNI,Nombre,Apellidos,Direccion,Telefono,Mail) values (?,?,?,?,?,?)";
                        PreparedStatement consulta = con.conect.prepareStatement(sql);
                        consulta.setString(1, dni);
                        consulta.setString(2, nombre);
                        consulta.setString(3, apellidos);
                        consulta.setString(4, calle);
                        consulta.setInt(5, telefono);
                        consulta.setString(6, mail);
                        consulta.execute();
                        con.close();
                        entDni.setText("");
                        entApellidos.setText("");
                        entDireccion.setText("");
                        entNombre.setText("");
                        entMail.setText("");
                        entTelefono.setText("");
                        actualizar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe introducir un nombre y una direccion", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe introducir un DNI valido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                con.connect();
                String dni = entDni.getText();
                String apellidos = entApellidos.getText();
                String calle = entDireccion.getText();
                String nombre = entNombre.getText();
                String mail = entMail.getText();
                int telefono = Integer.parseInt(entTelefono.getText());
                if ((!nombre.isEmpty()) && (!calle.isEmpty())) {
                    String sql = "UPDATE Clientes SET \"Nombre\" = ?, \"Apellidos\" = ?, \"Direccion\" = ?, \"Telefono\" = ?, \"Mail\" = ? WHERE  \"DNI\" = ?";
                    PreparedStatement consulta = con.conect.prepareStatement(sql);
                    consulta.setString(6, dni);
                    consulta.setString(1, nombre);
                    consulta.setString(2, apellidos);
                    consulta.setString(3, calle);
                    consulta.setInt(4, telefono);
                    consulta.setString(5, mail);
                    consulta.execute();
                    con.close();
                    actualizar();
                    jFrame1.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe introducir un nombre y una direccion", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El telefono debe contener solo numeros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jFrame1.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void entDnicomprobarDNI(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entDnicomprobarDNI
        String nif = entDni.getText();
        //si es NIE, eliminar la x,y,z inicial para tratarlo como nif
        if (nif.toUpperCase().startsWith("X") || nif.toUpperCase().startsWith("Y") || nif.toUpperCase().startsWith("Z")) {
            nif = nif.substring(1);
        }
        Pattern nifPattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher m = nifPattern.matcher(nif);
        if (m.matches()) {
            String letra = m.group(2);
            //Extraer letra del NIF
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int dni = Integer.parseInt(m.group(1));
            dni = dni % 23;
            String reference = letras.substring(dni, dni + 1);

            if (reference.equalsIgnoreCase(letra)) {
                entDni.setBackground(Color.green);
            } else {
                entDni.setBackground(Color.red);
            }
        } else {
            entDni.setBackground(Color.red);
        }
    }//GEN-LAST:event_entDnicomprobarDNI
    private void actualizar() {
        try {
            DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
            con.connect();
            Statement consulta = con.conect.createStatement();
            ResultSet rs = consulta.executeQuery("select * from Clientes");

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            while (rs.next()) {
                Object[] datos = new Object[6];
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getInt(5);
                datos[5] = rs.getString(6);
                model.addRow(datos);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            con.close();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolver;
    public javax.swing.JTextField entApellidos;
    public javax.swing.JTextField entDireccion;
    public javax.swing.JTextField entDni;
    public javax.swing.JTextField entMail;
    public javax.swing.JTextField entNombre;
    public javax.swing.JTextField entTelefono;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
