package proyectoelecciones.gui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoelecciones.Controller.CrudAll;
import proyectoelecciones.Logica.ActaElectoral;
import proyectoelecciones.Logica.Candidato;
import proyectoelecciones.Logica.MesaElectoral;
import proyectoelecciones.Logica.MiembroMesa;

public class ActaElectoralM extends javax.swing.JFrame {

    private CrudAll ca;
    private int ale;
    private Map<Candidato, Integer> votosPorCandidato = new HashMap<>();
    private Map<Candidato, Integer> votosPreferenciales = new HashMap<>();

    public ActaElectoralM(CrudAll ca) {
        this.ca = ca;
        initComponents();
        rellenarMesa();
        cargarResultadosCandidatos();
        this.ale = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCandidatos = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFirmas = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        txtSelloOficial = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txtActa = new javax.swing.JTextField();
        txtVotosNulos = new javax.swing.JTextField();
        txtVotosBlanco = new javax.swing.JTextField();
        txtObservaciones = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblMiembrosMesa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbvr = new javax.swing.JLabel();
        jbve = new javax.swing.JLabel();
        txte = new javax.swing.JTextField();
        txtre = new javax.swing.JTextField();
        jbR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel16.setText("Registro De Acta Electoral");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel17.setText("Lugar");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel18.setText("Titulo Del Documento");

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel19.setText("Fecha");

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel20.setText("Hora");

        jLabel21.setText("----------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel22.setText("Miembros de Mesa");

        jLabel23.setText("----------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel24.setText("Mesa Electoral");

        cmbMesa.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cmbMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel25.setText("Numero De Acta");

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel26.setText("Estadisticas de Voto");

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel27.setText("Votantes Efectivos");

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel28.setText("Votantes Registrados");

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel29.setText("Votos Blancos");

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel30.setText("Votos Nulos");

        jLabel31.setText("----------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel32.setText("Observaciones");

        tblCandidatos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tblCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Candidato", "Partido", "Votos", "Votos Pref", "Votos Totales", "Porcentaje %"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCandidatos);

        jLabel33.setText("----------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel34.setText("Estadisticas de Voto Por Candidato");

        jLabel35.setText("----------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel36.setText("Firmas");

        tblFirmas.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tblFirmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Miembro", "Cargo", "Firma", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblFirmas);

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel37.setText("Sello Oficial");

        jLabel38.setText("----------------------------------------------------------------------------------------------------------------------------------------------------");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar Acta");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblMiembrosMesa.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tblMiembrosMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Miembro", "Cargo", "Dni"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblMiembrosMesa);

        jbvr.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jbve.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        txtre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreActionPerformed(evt);
            }
        });

        jbR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbR.setText("R");
        jbR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel19)
                        .addGap(32, 32, 32)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel17)
                        .addGap(35, 35, 35)
                        .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtActa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel37)
                                        .addGap(63, 63, 63)
                                        .addComponent(txtSelloOficial))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addComponent(jLabel16))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(32, 32, 32)
                                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(245, 245, 245)
                                    .addComponent(jLabel22))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(276, 276, 276)
                                    .addComponent(jLabel32))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(325, 325, 325)
                                    .addComponent(jLabel36))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(btnGuardar)
                                    .addGap(31, 31, 31)
                                    .addComponent(btnLimpiar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel28)
                                                .addComponent(jLabel27))
                                            .addGap(44, 44, 44)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jbve)
                                                    .addComponent(txtVotosBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jbvr))
                                                    .addGap(210, 210, 210)
                                                    .addComponent(txtVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(247, 247, 247)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel26)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel29)
                                                        .addComponent(jLabel30))))))
                                    .addGap(56, 56, 56)
                                    .addComponent(jbR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(15, 15, 15)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cmbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtActa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30)
                            .addComponent(txtVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jbvr)
                            .addComponent(txtre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVotosBlanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jbve)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(9, 9, 9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addGap(24, 24, 24)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSelloOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnVolver)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jbR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(573, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void rellenarMesa() {
        List<MesaElectoral> listamesas = ca.getMesas();
        for (MesaElectoral mesa : listamesas) {
            cmbMesa.addItem(mesa.getNumeroMesa());
        }

    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String titulo = txtTitulo.getText();
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();
        String lugar = txtLugar.getText();
        String numeromesa = (String) cmbMesa.getSelectedItem();
        MesaElectoral mesaSeleccionada = ca.buscarMesa(numeromesa);
        String numeroActa = txtActa.getText();
        int votantesRegistrados = Integer.parseInt(txtre.getText());
        int votantesEfectivos = Integer.parseInt(txte.getText());
        int votosBlanco = Integer.parseInt(txtVotosBlanco.getText());
        int votosNulos = Integer.parseInt(txtVotosNulos.getText());
        String observaciones = txtObservaciones.getText();
        String selloOficial = txtSelloOficial.getText();
        ca.crearActa(titulo, lugar, fecha, hora, mesaSeleccionada, numeroActa);
        ActaElectoral ac2 = ca.buscarActa(numeroActa);

        Map<Candidato, Integer> votosPorCandidato = new HashMap<>();
        Map<Candidato, Integer> votosPreferenciales = new HashMap<>();
        DefaultTableModel model = (DefaultTableModel) tblCandidatos.getModel();
        List<Candidato> candidatos = ca.getCandidatos();

        for (int i = 0; i < model.getRowCount(); i++) {
            Candidato candidato = candidatos.get(i);
            int votosTotales = (Integer) model.getValueAt(i, 2);
            int votosPref = (Integer) model.getValueAt(i, 3);
            int votosNormales = votosTotales - votosPref;
            votosPorCandidato.put(candidato, votosNormales);
            votosPreferenciales.put(candidato, votosPref);
        }

        ac2.setTitulo(titulo);
        ac2.setFecha(fecha);
        ac2.setHora((hora));
        ac2.setLugar(lugar);
        ac2.setMesa(mesaSeleccionada);
        ac2.setNumeroActa(numeroActa);
        ac2.setTotalVotantesRegistrados(votantesRegistrados);
        ac2.setTotalVotantesEfectivos(votantesEfectivos);
        ac2.setVotosEnBlanco(votosBlanco);
        ac2.setVotosNulos(votosNulos);
        ac2.setObservaciones(observaciones);
        ac2.setSelloOficial(selloOficial);
        ac2.setVotosPorCandidato(votosPorCandidato);
        ac2.setVotosPreferenciales(votosPreferenciales);
        ac2.setMiembrosMesa(mesaSeleccionada.getMiembros());
        Random ra = new Random();
        int totalVotos = 0;
        this.ale = ra.nextInt(50);
        int votosNull = Integer.parseInt(txtVotosNulos.getText());
        int votosB = Integer.parseInt(txtVotosBlanco.getText());
        for (Candidato candidato : votosPorCandidato.keySet()) {
            int votosNormales = votosPorCandidato.get(candidato);
            int votosPref = votosPreferenciales.get(candidato);
            totalVotos += votosNormales + votosPref;
        }
        ac2.setTotalVotantesEfectivos(totalVotos + votosB + votosNull);
        ac2.setTotalVotantesRegistrados(totalVotos + ale + votosB + votosNull);

        ac2.setVotosPorCandidato(votosPorCandidato);
        ac2.setVotosPreferenciales(votosPreferenciales);

        JOptionPane.showMessageDialog(this,
                "Acta guardada correctamente.");
        mesaSeleccionada.agregarActa(ac2);

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtTitulo.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        txtLugar.setText("");
        cmbMesa.setSelectedIndex(-1);
        txtActa.setText("");
        jbvr.setText("");
        jbve.setText("");
        txtVotosBlanco.setText("");
        txtVotosNulos.setText("");
        txtObservaciones.setText("");
        txtSelloOficial.setText("");
        DefaultTableModel modelCandidatos = (DefaultTableModel) tblCandidatos.getModel();
        modelCandidatos.setRowCount(0);

        DefaultTableModel modelFirmas = (DefaultTableModel) tblFirmas.getModel();
        modelFirmas.setRowCount(0);
        DefaultTableModel modelMiembros = (DefaultTableModel) tblMiembrosMesa.getModel();
        modelMiembros.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal(ca);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesaActionPerformed

        String numeromesa = (String) cmbMesa.getSelectedItem();
        MesaElectoral mesaSeleccionada = ca.buscarMesa(numeromesa);
        if (mesaSeleccionada != null) {
            List<MiembroMesa> miembros = mesaSeleccionada.getMiembros();
            DefaultTableModel model = (DefaultTableModel) tblMiembrosMesa.getModel();
            model.setRowCount(0);
            for (MiembroMesa miembro : miembros) {
                String nombreCompleto = miembro.getNombre() + " " + miembro.getApellido();
                model.addRow(new Object[]{
                    nombreCompleto,
                    miembro.getTipo(),
                    miembro.getDni()
                });
            }
            DefaultTableModel modelf = (DefaultTableModel) tblFirmas.getModel();
            modelf.setRowCount(0);
            for (MiembroMesa miembro : miembros) {
                String nombreCompleto = miembro.getNombre() + " " + miembro.getApellido();
                modelf.addRow(new Object[]{
                    nombreCompleto,
                    miembro.getTipo(),
                    nombreCompleto,
                    "✅ Firmado"
                });
            }
            cargarResultadosCandidatos();
        }
    }//GEN-LAST:event_cmbMesaActionPerformed

    private void jbRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRActionPerformed

        int totalVotos = 0;
        int re = 0;
        int e = 0;
        int votosNull = Integer.parseInt(txtVotosNulos.getText());
        int votosB = Integer.parseInt(txtVotosBlanco.getText());
        List<Candidato> candi = ca.getCandidatos();
        for (Candidato candidato : candi) {
            int votosNormales = votosPorCandidato.get(candidato);
            int votosPref = votosPreferenciales.get(candidato);
            totalVotos += votosNormales + votosPref;
        }
        re = totalVotos + votosB + votosNull;
        e = totalVotos + ale + votosB + votosNull;

        txtre.setText(String.valueOf(re));
        txte.setText(String.valueOf(e));
    }//GEN-LAST:event_jbRActionPerformed

    private void txtreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreActionPerformed
    private void cargarResultadosCandidatos() {
        DefaultTableModel model = (DefaultTableModel) tblCandidatos.getModel();
        model.setRowCount(0);
        List<Candidato> candidatos = ca.getCandidatos();
        int totalVotos = 0;
        Random ra = new Random();
        for (Candidato candidato : candidatos) {
            int votos = ra.nextInt(200) + 1;
            int votosPref = ra.nextInt(20);
            votosPorCandidato.put(candidato, votos);
            votosPreferenciales.put(candidato, votosPref);
        }

        for (Candidato candidato : votosPorCandidato.keySet()) {
            int votosNormales = votosPorCandidato.get(candidato);
            int votosPref = votosPreferenciales.get(candidato);
            totalVotos += votosNormales + votosPref;
        }

        for (Candidato candidato : votosPorCandidato.keySet()) {
            int votosNormales = votosPorCandidato.get(candidato);
            int votosPref = votosPreferenciales.get(candidato);
            int votosTotales = votosNormales + votosPref;
            String porcentaje = totalVotos > 0 ? String.format("%.2f%%", (votosTotales * 100.0) / totalVotos) : "0%";
            model.addRow(new Object[]{
                candidato.getNombre() + " " + candidato.getApellido(),
                candidato.getPartido().getNombre(),
                votosNormales,
                votosPref,
                votosTotales,
                porcentaje
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private final javax.swing.JComboBox<String> cmbMesa = new javax.swing.JComboBox<>();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbR;
    private javax.swing.JLabel jbve;
    private javax.swing.JLabel jbvr;
    private javax.swing.JTable tblCandidatos;
    private javax.swing.JTable tblFirmas;
    private javax.swing.JTable tblMiembrosMesa;
    private javax.swing.JTextField txtActa;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtSelloOficial;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVotosBlanco;
    private javax.swing.JTextField txtVotosNulos;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtre;
    // End of variables declaration//GEN-END:variables
}
