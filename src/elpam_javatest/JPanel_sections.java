/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elpam_javatest;

/**
 *
 * @author Matus
 */
public class JPanel_sections extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public JPanel_sections() {
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

        jPanel_section_detail = new javax.swing.JPanel();
        jLabel_tower_icon = new javax.swing.JLabel();
        jCheckBox_complete = new javax.swing.JCheckBox();
        jButton_ADD_detail = new javax.swing.JButton();
        jLabel_section_detiail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_sag_first_conductor = new javax.swing.JTextField();
        jLabel_sag_first_conductor_unit = new javax.swing.JLabel();
        jTextField_sag_second_conductor = new javax.swing.JTextField();
        jLabel_sag_first_conductor = new javax.swing.JLabel();
        jLabel_sag_second_conductor_unit = new javax.swing.JLabel();
        jLabel_sag_second_conductor = new javax.swing.JLabel();
        jLabel_CondType_detail = new javax.swing.JLabel();
        jSpinner_bundle_detail = new javax.swing.JSpinner();
        jLabel_second_conductor = new javax.swing.JLabel();
        jLabel_bundle_detail = new javax.swing.JLabel();
        jSpinner_CondType_detail = new javax.swing.JSpinner();
        jLabel_first_conductor = new javax.swing.JLabel();
        jButton_conductors_detail = new javax.swing.JButton();
        jButton_COPY_detail = new javax.swing.JButton();
        jButton_DEL_detail = new javax.swing.JButton();
        jButton_LOAD_detail = new javax.swing.JButton();
        jButton_NEW_detail = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField_sag_first_wire = new javax.swing.JTextField();
        jLabel_sag_first_wire_unit = new javax.swing.JLabel();
        jTextField_sag_second_wire = new javax.swing.JTextField();
        jLabel_sag_first_wire = new javax.swing.JLabel();
        jLabel_sag_second_wire_unit = new javax.swing.JLabel();
        jLabel_sag_second_wire = new javax.swing.JLabel();
        jLabel_WireType_detail = new javax.swing.JLabel();
        jSpinner_WireNumber_detail = new javax.swing.JSpinner();
        jLabel_second_wire = new javax.swing.JLabel();
        jLabel_WireNumber_detail = new javax.swing.JLabel();
        jSpinner_WireType_detail = new javax.swing.JSpinner();
        jLabel_first_wire = new javax.swing.JLabel();
        jButton_GroundWires_detail = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel_ground_resistane_unit = new javax.swing.JLabel();
        jLabel_length_detail = new javax.swing.JLabel();
        jTextField_length_detail = new javax.swing.JTextField();
        jLabel_length_unit = new javax.swing.JLabel();
        jTextField_ground_resistance_detail = new javax.swing.JTextField();
        jLabel_ground_resistance_detail = new javax.swing.JLabel();

        jPanel_section_detail.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));

        jLabel_tower_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matus\\Documents\\NetBeansProjects\\elpam_javatest\\src\\towers_logo_small.jpg")); // NOI18N

        jCheckBox_complete.setText("check complete");
        jCheckBox_complete.setEnabled(false);
        jCheckBox_complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_completeActionPerformed(evt);
            }
        });

        jButton_ADD_detail.setBackground(new java.awt.Color(0, 153, 0));
        jButton_ADD_detail.setText("ADD");

        jLabel_section_detiail.setText("Section 1");
        jLabel_section_detiail.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_sag_first_conductor_unit.setText("m");

        jLabel_sag_first_conductor.setText(" sag:");

        jLabel_sag_second_conductor_unit.setText("m");

        jLabel_sag_second_conductor.setText("sag:");

        jLabel_CondType_detail.setText("types of conductor");

        jSpinner_bundle_detail.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        jLabel_second_conductor.setText("Conductor 2nd type");

        jLabel_bundle_detail.setText("cond. in bundle");

        jSpinner_CondType_detail.setModel(new javax.swing.SpinnerNumberModel(1, 1, 2, 1));

        jLabel_first_conductor.setText("Conductor 1st type");

        jButton_conductors_detail.setBackground(new java.awt.Color(102, 0, 102));
        jButton_conductors_detail.setText("Conductors");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner_CondType_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_CondType_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_conductors_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner_bundle_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_bundle_detail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_sag_first_conductor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_sag_first_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_sag_first_conductor_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_first_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_second_conductor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_sag_second_conductor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_sag_second_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_sag_second_conductor_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_conductors_detail)
                            .addComponent(jLabel_first_conductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_second_conductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_sag_first_conductor)
                            .addComponent(jTextField_sag_first_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_sag_first_conductor_unit)
                            .addComponent(jLabel_sag_second_conductor)
                            .addComponent(jTextField_sag_second_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_sag_second_conductor_unit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner_CondType_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_CondType_detail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bundle_detail)
                            .addComponent(jSpinner_bundle_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jButton_COPY_detail.setBackground(new java.awt.Color(255, 153, 0));
        jButton_COPY_detail.setText("COPY");
        jButton_COPY_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_COPY_detailActionPerformed(evt);
            }
        });

        jButton_DEL_detail.setBackground(new java.awt.Color(204, 0, 0));
        jButton_DEL_detail.setText("DEL");

        jButton_LOAD_detail.setBackground(new java.awt.Color(0, 0, 153));
        jButton_LOAD_detail.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LOAD_detail.setText("LOAD TOWER");

        jButton_NEW_detail.setBackground(new java.awt.Color(51, 153, 0));
        jButton_NEW_detail.setText("NEW  TOWER");

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_sag_first_wire_unit.setText("m");

        jLabel_sag_first_wire.setText(" sag:");

        jLabel_sag_second_wire_unit.setText("m");

        jLabel_sag_second_wire.setText("sag:");

        jLabel_WireType_detail.setText("types of ground wires");

        jSpinner_WireNumber_detail.setModel(new javax.swing.SpinnerNumberModel(1, 1, 2, 1));

        jLabel_second_wire.setText("Ground Wire 2nd type");

        jLabel_WireNumber_detail.setText("number of ground wires");

        jSpinner_WireType_detail.setModel(new javax.swing.SpinnerNumberModel(1, 1, 2, 1));

        jLabel_first_wire.setText("Ground Wire 1st type");

        jButton_GroundWires_detail.setBackground(new java.awt.Color(102, 0, 102));
        jButton_GroundWires_detail.setText("Ground Wires");
        jButton_GroundWires_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GroundWires_detailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSpinner_WireType_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_WireType_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_GroundWires_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSpinner_WireNumber_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_WireNumber_detail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel_sag_first_wire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_sag_first_wire, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_sag_first_wire_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_first_wire, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_second_wire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel_sag_second_wire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_sag_second_wire, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_sag_second_wire_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_GroundWires_detail)
                            .addComponent(jLabel_first_wire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_second_wire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_sag_first_wire)
                            .addComponent(jTextField_sag_first_wire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_sag_first_wire_unit)
                            .addComponent(jLabel_sag_second_wire)
                            .addComponent(jTextField_sag_second_wire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_sag_second_wire_unit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner_WireType_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_WireType_detail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_WireNumber_detail)
                            .addComponent(jSpinner_WireNumber_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_ground_resistane_unit.setText("Ωm");

        jLabel_length_detail.setText("Length:");

        jLabel_length_unit.setText("m");

        jLabel_ground_resistance_detail.setText("Ground resistance:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_ground_resistance_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ground_resistance_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_ground_resistane_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_length_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_length_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_length_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_length_detail)
                    .addComponent(jTextField_length_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_length_unit))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ground_resistance_detail)
                    .addComponent(jTextField_ground_resistance_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ground_resistane_unit)))
        );

        javax.swing.GroupLayout jPanel_section_detailLayout = new javax.swing.GroupLayout(jPanel_section_detail);
        jPanel_section_detail.setLayout(jPanel_section_detailLayout);
        jPanel_section_detailLayout.setHorizontalGroup(
            jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_section_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_section_detiail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_NEW_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_LOAD_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_tower_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_DEL_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ADD_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_COPY_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel_section_detailLayout.setVerticalGroup(
            jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_section_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_section_detailLayout.createSequentialGroup()
                        .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_NEW_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_section_detailLayout.createSequentialGroup()
                                .addComponent(jButton_LOAD_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox_complete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel_tower_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel_section_detiail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_section_detailLayout.createSequentialGroup()
                        .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_section_detailLayout.createSequentialGroup()
                                .addComponent(jButton_ADD_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_DEL_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_section_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_COPY_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_section_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_section_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_completeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_completeActionPerformed

    private void jButton_COPY_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_COPY_detailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_COPY_detailActionPerformed

    private void jButton_GroundWires_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GroundWires_detailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_GroundWires_detailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD_detail;
    private javax.swing.JButton jButton_COPY_detail;
    private javax.swing.JButton jButton_DEL_detail;
    private javax.swing.JButton jButton_GroundWires_detail;
    private javax.swing.JButton jButton_LOAD_detail;
    private javax.swing.JButton jButton_NEW_detail;
    private javax.swing.JButton jButton_conductors_detail;
    private javax.swing.JCheckBox jCheckBox_complete;
    private javax.swing.JLabel jLabel_CondType_detail;
    private javax.swing.JLabel jLabel_WireNumber_detail;
    private javax.swing.JLabel jLabel_WireType_detail;
    private javax.swing.JLabel jLabel_bundle_detail;
    private javax.swing.JLabel jLabel_first_conductor;
    private javax.swing.JLabel jLabel_first_wire;
    private javax.swing.JLabel jLabel_ground_resistance_detail;
    private javax.swing.JLabel jLabel_ground_resistane_unit;
    private javax.swing.JLabel jLabel_length_detail;
    private javax.swing.JLabel jLabel_length_unit;
    private javax.swing.JLabel jLabel_sag_first_conductor;
    private javax.swing.JLabel jLabel_sag_first_conductor_unit;
    private javax.swing.JLabel jLabel_sag_first_wire;
    private javax.swing.JLabel jLabel_sag_first_wire_unit;
    private javax.swing.JLabel jLabel_sag_second_conductor;
    private javax.swing.JLabel jLabel_sag_second_conductor_unit;
    private javax.swing.JLabel jLabel_sag_second_wire;
    private javax.swing.JLabel jLabel_sag_second_wire_unit;
    private javax.swing.JLabel jLabel_second_conductor;
    private javax.swing.JLabel jLabel_second_wire;
    private javax.swing.JLabel jLabel_section_detiail;
    private javax.swing.JLabel jLabel_tower_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_section_detail;
    private javax.swing.JSpinner jSpinner_CondType_detail;
    private javax.swing.JSpinner jSpinner_WireNumber_detail;
    private javax.swing.JSpinner jSpinner_WireType_detail;
    private javax.swing.JSpinner jSpinner_bundle_detail;
    private javax.swing.JTextField jTextField_ground_resistance_detail;
    private javax.swing.JTextField jTextField_length_detail;
    private javax.swing.JTextField jTextField_sag_first_conductor;
    private javax.swing.JTextField jTextField_sag_first_wire;
    private javax.swing.JTextField jTextField_sag_second_conductor;
    private javax.swing.JTextField jTextField_sag_second_wire;
    // End of variables declaration//GEN-END:variables
}
