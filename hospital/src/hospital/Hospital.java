
package hospital;

import Login.Login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hospital extends javax.swing.JFrame {
    private JFrame frame;
            

    
    public Hospital() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        txtRefuerzo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Turno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 3, 24), new java.awt.Color(204, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Servicio:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 190, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Turno:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Refuerzo:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 190, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tiempo:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 190, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Especialidad-Día:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Electiva:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 190, 30));

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 190, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("How to use medication:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 190, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Patient ID:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NHS Number:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Patient Name:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date of Birth:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Patient Address:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 190, -1));

        txtTiempo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cédula:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, -1));

        txtCedula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer año", "Segundo año", "Tercer año" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año de Residencia:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtTurno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 190, -1));

        txtRefuerzo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtServicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Código residente:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Día:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255), 3));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 190, -1));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Neumologia", "Infectologia", "Urgencias", "Neonatos", "Consulta Externa", "Neurologia", "UCI", "Cardiologia", "Hemato Oncologia", "Nefrologia", "CX Pediatrica", "Medicina Infantil" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 190, -1));

        si.setText("Si");
        jPanel3.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        no.setText("No");
        jPanel3.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255), 3));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Reset");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Prescription");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Login");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Print");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jButton2)
                .addGap(102, 102, 102)
                .addComponent(jButton6)
                .addGap(110, 110, 110)
                .addComponent(jButton7)
                .addGap(52, 52, 52)
                .addComponent(jButton8)
                .addGap(31, 31, 31)
                .addComponent(jButton9)
                .addGap(31, 31, 31)
                .addComponent(jButton10)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton2, jButton6, jButton7, jButton8, jButton9});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Tablet", "Reference nº", "Number of tablets", "Dose (mg)", "LOT", "Issue Date", "Exp Date", "Daily Dose", "Possible side effects", "Futher information", "Storage advice", "Driving and using machines", "How to use  medicatin", "Patient ID", "NHS Number", "Patient Name", "Date of birth", "Patient Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(1818, 1818, 1818))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String Qty1 = (txtNombre.getText());
       String Qty2 = (txtApellido.getText());
       String Qty3 = (txtCedula.getText());
       String Qty4 = (txtCodigo.getText());
       String Qty5 = (txtRefuerzo.getText());
       String Qty6 = (txtTurno.getText());
       String Qty7 = (txtTiempo.getText());
       String Qty8 = (jTextField12.getText());
       String Qty9 = (jTextField13.getText());
       String Qty10 = (jTextField15.getText());
       String Qty11 = (jTextField16.getText());
       String Qty12 = (jTextField17.getText());
       String Qty13 = "";
       
        if (jComboBox2.getSelectedItem().equals("Lunes")){
            
            Qty13 = "Ibuprofen";
            
        }
        else if (jComboBox1.getSelectedItem().equals("Co-codamol")){
            
            Qty13 = "Co-codamol";
            
        }
        else if (jComboBox1.getSelectedItem().equals("Paracetamol")){
            
            Qty13 = "Paracetamol";
            
        }
        else if (jComboBox1.getSelectedItem().equals("Amlodipine")){
            
            Qty13 = "Amlodipine";
            
        }
       
       jTextArea1.setText("");
       jTextArea1.append("\t\n\tCuadro de Turnos Residentes\n"
       +"\nPatient Name:\t\t" + Qty1
       +"\nDate of Birth:\t\t" + Qty2
       +"\nPatient Address:\t" + Qty3
       +" \nPrescription:\t\t" + Qty4
       +" \n\nReference Nº:\t\t" + Qty5
       +" \nDose (mg):\t\t" + Qty2
       +"\nNumber of Tablets:\t\t" + Qty3
       +" \nLOT:\t\t" + Qty4
       +"  \nDaily Dose:\t\t" + Qty5
       +"\nPossible side Effects:\t\t" + Qty6
       +" \nFurther Information:\t\t" + Qty7
       +"  \nHow to use Medication:\t\t" + Qty8
       +"\nPatient ID:\t\t" + Qty9
       +"\n\nPatient Instruction we have introduced a \n\tfree text confirmation\n\t"
                   + "TEXT REMINDERS FOR APPOINTMENT");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "System of Cuadro de Turnos ",
                JOptionPane.YES_NO_OPTION) ==  JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try{
            jTextArea1.print();
        }catch (PrinterException ex){
            Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Primer año"))
        {
            txtServicio.setText("Urgencias");
            txtRefuerzo.setText(" 3 Horas de refuerzo");
            txtTurno.setText("8 horas");
           
        }
        else if (jComboBox1.getSelectedItem().equals("Segundo año"))
        {
           
            txtServicio.setText("Unidad Neonatal");
            txtRefuerzo.setText("3h");
            txtTurno.setText("8 horas");
               
        }
        else if (jComboBox1.getSelectedItem().equals("Tercer año"))
        {
            
            txtServicio.setText("UCI Pediatrico");
            txtRefuerzo.setText("Sin refuerzo");
            txtTurno.setText("8 horas");
  
        }
       
        else if (jComboBox1.getSelectedItem().equals("Make a Selection"))
        {
         
            txtServicio.setText("");
            txtRefuerzo.setText("");
            txtTurno.setText("");
           
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextArea1.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtCodigo.setText("");
        
        txtServicio.setText("");
        txtRefuerzo.setText("");
            
        txtTurno.setText("");
        txtTiempo.setText("");
        
//        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        
        jComboBox1.getModel().setSelectedItem("Make a Selection");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Login iLogin = new Login();
        iLogin.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{jComboBox1.getSelectedItem().toString(),
        txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtCodigo.getText(), jComboBox2,
        txtServicio.getText(), txtRefuerzo.getText(), txtTurno.getText(), txtTiempo.getText(),
//        jTextField11.getText(), jTextField12.getText(), jTextField13.getText(), jTextField14.getText(), jTextField15.getText(),
        jTextField16.getText(), jTextField17.getText()});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        if (jTable1.getSelectedRow() == -1){
            if (jTable1.getRowCount() == 0){
                
                JOptionPane.showMessageDialog(null, "No data to delete", "Cuadro de Turnos",
                        JOptionPane.OK_OPTION);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Cuadro de Turnos",
                        JOptionPane.OK_OPTION);
            }
        }
        else 
        {
            model.removeRow(jTable1.getSelectedRow());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         if (jComboBox2.getSelectedItem().equals("Lunes"))
        {
            txtTiempo.setText("7pm a 7am");
//            txtRefuerzo.setText(" 3 Horas de refuerzo");
//            txtTurno.setText("8 horas");
           
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       
        if(si.isEnabled()){
            jComboBox3.setEnabled(false);
        }else{
           if(no.isEnabled()){
            jComboBox2.setEnabled(true);
           }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRefuerzo;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
