package clienteshds.visao;

import clienteshds.DAO.EmpresaDAO;
import clienteshds.DAO.GravaLog;
import clienteshds.controller.TrayClass;
import clienteshds.modelo.Backup;
import clienteshds.modelo.Empresa;
import clienteshds.modelo.Erro;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public final class Principal extends javax.swing.JFrame {

    TrayClass t = new TrayClass(Principal.this);
    EmpresaDAO empresaDAO = new EmpresaDAO();
    GravaLog gravaLog = new GravaLog();

    public Principal() {

        initComponents();
        iniciaTela();
        carregaTabela();
        ImageIcon icone = new ImageIcon("100x100.png");
        setIconImage(icone.getImage());

        Timer timer = new Timer();
        timer.schedule(new Principal.gravaBackup(), 0, 1 * 600000);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtRegimeTributario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtContabilidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTelefoneContabilidade = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtIpServidor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtDominio = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabelFantasia = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabelTelefone1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabelTelefone2 = new javax.swing.JLabel();
        BtnRdp = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabelData = new javax.swing.JLabel();
        jLabelData2 = new javax.swing.JLabel();
        jLabelTerminal = new javax.swing.JLabel();
        jLabelTerminal1 = new javax.swing.JLabel();
        jLabelTerminal2 = new javax.swing.JLabel();
        jLabelTerminal3 = new javax.swing.JLabel();
        jLabelTerminal4 = new javax.swing.JLabel();
        jLabelTerminal5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setTitle("Hds Software - Cadastro de Clientes");
        setMinimumSize(new java.awt.Dimension(975, 636));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 117, 211));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clienteshds/imagens/HdsSoftware.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 970, 70);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTableEmpresas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fantasia", "CNPJ", "Telefone", "Pasta", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpresas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableEmpresas.getTableHeader().setReorderingAllowed(false);
        jTableEmpresas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableEmpresasFocusGained(evt);
            }
        });
        jTableEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpresasMouseClicked(evt);
            }
        });
        jTableEmpresas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTableEmpresasComponentHidden(evt);
            }
        });
        jTableEmpresas.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTableEmpresasCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTableEmpresas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableEmpresasPropertyChange(evt);
            }
        });
        jTableEmpresas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableEmpresasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableEmpresasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpresas);
        if (jTableEmpresas.getColumnModel().getColumnCount() > 0) {
            jTableEmpresas.getColumnModel().getColumn(0).setResizable(false);
            jTableEmpresas.getColumnModel().getColumn(1).setMinWidth(160);
            jTableEmpresas.getColumnModel().getColumn(1).setPreferredWidth(160);
            jTableEmpresas.getColumnModel().getColumn(1).setMaxWidth(160);
            jTableEmpresas.getColumnModel().getColumn(2).setMinWidth(130);
            jTableEmpresas.getColumnModel().getColumn(2).setPreferredWidth(130);
            jTableEmpresas.getColumnModel().getColumn(2).setMaxWidth(130);
            jTableEmpresas.getColumnModel().getColumn(3).setMinWidth(90);
            jTableEmpresas.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTableEmpresas.getColumnModel().getColumn(3).setMaxWidth(90);
            jTableEmpresas.getColumnModel().getColumn(4).setMinWidth(60);
            jTableEmpresas.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTableEmpresas.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Contábeis"));

        txtRegimeTributario.setEditable(false);
        txtRegimeTributario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRegimeTributario.setMaximumSize(new java.awt.Dimension(6, 21));
        txtRegimeTributario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegimeTributarioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Regime tributário :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Contabilidade :");

        txtContabilidade.setEditable(false);
        txtContabilidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContabilidade.setAutoscrolls(false);
        txtContabilidade.setMaximumSize(new java.awt.Dimension(6, 21));
        txtContabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContabilidadeActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Responsável :");

        txtResponsavel.setEditable(false);
        txtResponsavel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsavelActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Telefone :");

        txtTelefoneContabilidade.setEditable(false);
        txtTelefoneContabilidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefoneContabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneContabilidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefoneContabilidade, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtResponsavel)
                    .addComponent(txtRegimeTributario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContabilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegimeTributario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneContabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtContabilidade.getAccessibleContext().setAccessibleName("");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedades de Conexão"));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Ip Servidor :");

        txtIpServidor.setEditable(false);
        txtIpServidor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIpServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpServidorjTextField2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Senha :");

        txtSenha.setEditable(false);
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhajTextField3ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Domínio :");

        txtDominio.setEditable(false);
        txtDominio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDominiojTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txtIpServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDominio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(txtSenha))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIpServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(39, 39, 39))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Básicas"));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Fantasia : ");

        jLabelFantasia.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Telefone (01)  : ");

        jLabelTelefone1.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTelefone1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Telefone (02)  : ");

        jLabelTelefone2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        BtnRdp.setBackground(new java.awt.Color(204, 204, 204));
        BtnRdp.setText("CONECTAR");
        BtnRdp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRdp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRdp.setEnabled(false);
        BtnRdp.setPreferredSize(new java.awt.Dimension(91, 33));
        BtnRdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRdpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addComponent(jLabel27))))
                    .addComponent(BtnRdp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane2.setViewportView(txtObs);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 70, 970, 490);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelData.setForeground(new java.awt.Color(51, 51, 51));
        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("00/00/0000");

        jLabelData2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelData2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData2.setText("Data :");

        jLabelTerminal.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTerminal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTerminalMouseClicked(evt);
            }
        });

        jLabelTerminal1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTerminal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTerminal1.setText("Computador :");

        jLabelTerminal2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTerminal2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTerminal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTerminal2.setText("F7 - Backup ");

        jLabelTerminal3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTerminal3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTerminal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTerminal3.setText("F8 - Erros ");

        jLabelTerminal4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTerminal4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTerminal4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTerminal4.setText("F11 - Atualizar ");

        jLabelTerminal5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTerminal5.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTerminal5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTerminal5.setText("F12 - Conectar ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTerminal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabelTerminal2)
                .addGap(18, 18, 18)
                .addComponent(jLabelTerminal3)
                .addGap(18, 18, 18)
                .addComponent(jLabelTerminal4)
                .addGap(18, 18, 18)
                .addComponent(jLabelTerminal5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabelData2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelData)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addComponent(jLabelData2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTerminal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTerminal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTerminal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTerminal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTerminal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTerminal5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 560, 970, 26);

        jMenu1.setText("CADASTROS");

        jMenu3.setText("Clientes");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("+ Novo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("LOG");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu2.setText("CONFIGURAÇÕES");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem1.setText("Conectar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jMenuItem2.setText("Atualizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem8.setText("Erros");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem7.setText("Backup");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtContabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContabilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContabilidadeActionPerformed

    private void txtResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsavelActionPerformed

    private void txtTelefoneContabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneContabilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneContabilidadeActionPerformed

    private void txtIpServidorjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpServidorjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpServidorjTextField2ActionPerformed

    private void txtSenhajTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhajTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhajTextField3ActionPerformed

    private void txtDominiojTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDominiojTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDominiojTextField4ActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        DefaultTableModel model = (DefaultTableModel) jTableEmpresas.getModel();
        String texto = txtBuscar.getText();
        ArrayList<Empresa> listaEmpresas = new ArrayList();
        try {
            listaEmpresas = empresaDAO.buscaTodos(texto);
            limpaCampos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (jTableEmpresas.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (Empresa e : listaEmpresas) {
            model.addRow(new Object[]{e.getFantasia(), e.getCnpj(), e.getTelefone1(), e.getPasta(), e.getId_cliente()});
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jTableEmpresasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableEmpresasPropertyChange

    }//GEN-LAST:event_jTableEmpresasPropertyChange

    private void jTableEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpresasMouseClicked

        if (jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 1).equals("  .   .   /    -  ")) {
            //btnConsultar.setEnabled(false);
            BtnRdp.setEnabled(false);

        } else {
            Empresa empresa;
            //btnConsultar.setEnabled(true);
            BtnRdp.setEnabled(true);
            String cnpj = (String) jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 1);
            try {
                if (empresaDAO.consultaCnpj(cnpj) == null) {
                    limpaCampos();
                    //iniciaTela();
                    carregaTabela();
                    txtBuscar.requestFocus();
                    //btnConsultar.setEnabled(false);
                    BtnRdp.setEnabled(false);
                } else {
                    empresa = empresaDAO.consultaCnpj(cnpj);
                    jLabelFantasia.setText(empresa.getFantasia());
                    jLabelTelefone1.setText(empresa.getTelefone1());
                    jLabelTelefone2.setText(empresa.getTelefone2());
                    //Testa se as datas estao vencidas e SET Color conforme resultado.
                    //if (testaData(empresa.getVencimentoSistema()) == true) {
                    //    jLabelVencimentoSistema.setText(empresa.getVencimentoSistema());
                    //    jLabelVencimentoSistema.setForeground(new Color(165, 2, 16));
                    //} else {
                    //    jLabelVencimentoSistema.setText(empresa.getVencimentoSistema());
                    //   jLabelVencimentoSistema.setForeground(new Color(0, 144, 16));
                    //}
                    //if (testaData(empresa.getVencimentoCertificado()) == true) {
                    //    jLabelVencimentoCertificado.setText(empresa.getVencimentoCertificado());
                    //    jLabelVencimentoCertificado.setForeground(new Color(165, 2, 16));
                    //} else {
                    //    jLabelVencimentoCertificado.setText(empresa.getVencimentoCertificado());
                    //    jLabelVencimentoCertificado.setForeground(new Color(0, 144, 16));
                    //}
                    //Fim testa datas
                    txtIpServidor.setText(empresa.getIpServidor());
                    txtSenha.setText(empresa.getSenha());
                    txtDominio.setText(empresa.getDominio());
                    txtRegimeTributario.setText(empresa.getRegimeContabil());
                    txtContabilidade.setText(empresa.getContabilidade());
                    txtResponsavel.setText(empresa.getResponsavel());
                    txtTelefoneContabilidade.setText(empresa.getTelefoneContador());
                    txtObs.setText(empresa.getObs());
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //teste 2 cliques
        if (evt.getClickCount() == 2) {
            if (jTableEmpresas.getSelectedRow() < 0) {
                //btnConsultar.setEnabled(false);
                BtnRdp.setEnabled(false);
            } else {
                String cnpj = (String) jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 1);
                ResultadoDialog resultado2 = new ResultadoDialog(this, rootPaneCheckingEnabled, cnpj);
                if (BtnRdp.isEnabled()) {
                    resultado2.setVisible(true);
                    BtnRdp.setEnabled(false);
                    limpaCampos();
                    //iniciaTela();
                    carregaTabela();
                }
            }
        }
    }//GEN-LAST:event_jTableEmpresasMouseClicked

    private void jTableEmpresasCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTableEmpresasCaretPositionChanged
    }//GEN-LAST:event_jTableEmpresasCaretPositionChanged

    private void jTableEmpresasComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableEmpresasComponentHidden
    }//GEN-LAST:event_jTableEmpresasComponentHidden

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ResultadoDialog resultado = new ResultadoDialog(this, rootPaneCheckingEnabled);
        resultado.setVisible(true);
        carregaTabela();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtRegimeTributarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegimeTributarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegimeTributarioActionPerformed

    private void BtnRdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRdpActionPerformed
        conectar();
    }//GEN-LAST:event_BtnRdpActionPerformed

    private void jTableEmpresasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableEmpresasKeyReleased
        if (evt.getKeyCode() == evt.VK_DOWN || evt.getKeyCode() == evt.VK_UP) {
            if (jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 1).equals("  .   .   /    -  ")) {
                //btnConsultar.setEnabled(false);
                BtnRdp.setEnabled(false);

            } else {
                Empresa empresa;
                //btnConsultar.setEnabled(true);
                BtnRdp.setEnabled(true);
                String cnpj = (String) jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 1);
                try {
                    if (empresaDAO.consultaCnpj(cnpj) == null) {
                        //iniciaTela();
                        limpaCampos();
                        carregaTabela();
                        txtBuscar.requestFocus();
                        //btnConsultar.setEnabled(false);
                        BtnRdp.setEnabled(false);
                    } else {
                        empresa = empresaDAO.consultaCnpj(cnpj);
                        jLabelFantasia.setText(empresa.getFantasia());
                        jLabelTelefone1.setText(empresa.getTelefone1());
                        jLabelTelefone2.setText(empresa.getTelefone2());
                        //Testa se as datas estao vencidas e SET Color conforme resultado.
                        //if (testaData(empresa.getVencimentoSistema()) == true) {
                        //    jLabelVencimentoSistema.setText(empresa.getVencimentoSistema());
                        //    jLabelVencimentoSistema.setForeground(new Color(165, 2, 16));
                        //} else {
                        //    jLabelVencimentoSistema.setText(empresa.getVencimentoSistema());
                        //    jLabelVencimentoSistema.setForeground(new Color(0, 144, 16));
                        // }
                        //if (testaData(empresa.getVencimentoCertificado()) == true) {
                        //    jLabelVencimentoCertificado.setText(empresa.getVencimentoCertificado());
                        //   jLabelVencimentoCertificado.setForeground(new Color(165, 2, 16));
                        //} else {
                        //    jLabelVencimentoCertificado.setText(empresa.getVencimentoCertificado());
                        //    jLabelVencimentoCertificado.setForeground(new Color(0, 144, 16));
                        //}
                        //Fim testa datas
                        txtIpServidor.setText(empresa.getIpServidor());
                        txtSenha.setText(empresa.getSenha());
                        txtDominio.setText(empresa.getDominio());
                        txtRegimeTributario.setText(empresa.getRegimeContabil());
                        txtContabilidade.setText(empresa.getContabilidade());
                        txtResponsavel.setText(empresa.getResponsavel());
                        txtTelefoneContabilidade.setText(empresa.getTelefoneContador());
                        txtObs.setText(empresa.getObs());
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            txtBuscar.requestFocus();

            //txtBuscar.setText(Character.toString(evt.getKeyChar()));
        }
    }//GEN-LAST:event_jTableEmpresasKeyReleased

    private void jTableEmpresasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableEmpresasKeyPressed
        if (evt.getKeyCode() == evt.VK_SPACE) {
            txtBuscar.setText("");
            txtBuscar.requestFocus();
            carregaTabela();
        }
    }//GEN-LAST:event_jTableEmpresasKeyPressed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == evt.VK_DOWN) {
            if (jTableEmpresas.getRowCount() >= 1) {
                jTableEmpresas.requestFocus();
                jTableEmpresas.addRowSelectionInterval(0, 0);
            }

        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jTableEmpresasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableEmpresasFocusGained

    }//GEN-LAST:event_jTableEmpresasFocusGained

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        try {
            Runtime.getRuntime().exec("notepad log.txt");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jLabelTerminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTerminalMouseClicked
        try {
            Runtime.getRuntime().exec("notepad " + jLabelTerminal.getText() + ".txt");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelTerminalMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        conectar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        System.out.println("teste1");
        DashboardErros dashboard2 = new DashboardErros();
        System.out.println("teste2");
        dashboard2.setVisible(true);
        System.out.println("teste3");
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        DashboardBackup dashboard = new DashboardBackup();
        dashboard.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        DashboardErros erros = new DashboardErros();
        erros.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (jTableEmpresas.getSelectedRow() >= 0) {
            Empresa empresa;
            String cnpj = (String) jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 1);
            try {
                empresa = empresaDAO.consultaCnpj(cnpj);
                if (empresa != null) {
                    AtualizaDialog atualiza = new AtualizaDialog(this, rootPaneCheckingEnabled, empresa);
                    atualiza.setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException exc) {
        } catch (ClassNotFoundException exc) {
        } catch (InstantiationException exc) {
        } catch (IllegalAccessException exc) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRdp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelData2;
    private javax.swing.JLabel jLabelFantasia;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JLabel jLabelTelefone2;
    private javax.swing.JLabel jLabelTerminal;
    private javax.swing.JLabel jLabelTerminal1;
    private javax.swing.JLabel jLabelTerminal2;
    private javax.swing.JLabel jLabelTerminal3;
    private javax.swing.JLabel jLabelTerminal4;
    private javax.swing.JLabel jLabelTerminal5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTableEmpresas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtContabilidade;
    private javax.swing.JTextField txtDominio;
    private javax.swing.JTextField txtIpServidor;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtRegimeTributario;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefoneContabilidade;
    // End of variables declaration//GEN-END:variables
    public void iniciaTela() {
        //mapeia unidade de rede
        try {
            Runtime.getRuntime().exec("cmd /c login.bat");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Pega data do computador e mostra na tela
        java.util.Date d = new Date();
        String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
        jLabelData.setText(dStr);
        //**

        //Pega o nome do computador e mostra na tela
        try {
            jLabelTerminal.setText(InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //**

        //jLabelVencimentoSistema.setText("00/00/0000");
        //jLabelVencimentoCertificado.setText("00/00/0000");
        //limpaCampos();
    }

    public void carregaTabela() {
        DefaultTableModel model = (DefaultTableModel) jTableEmpresas.getModel();
        ArrayList<Empresa> listaEmpresas = new ArrayList();
        while (jTableEmpresas.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            listaEmpresas = empresaDAO.todasEmpresas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Empresa e : listaEmpresas) {
            model.addRow(new Object[]{e.getFantasia(), e.getCnpj(), e.getTelefone1(), e.getPasta(), e.getId_cliente()});
        }

    }

    public void limpaCampos() {
        jLabelFantasia.setText("");
        jLabelTelefone1.setText("");
        jLabelTelefone2.setText("");
        txtIpServidor.setText("");
        txtSenha.setText("");
        txtDominio.setText("");
        txtRegimeTributario.setText("");
        txtContabilidade.setText("");
        txtResponsavel.setText("");
        txtTelefoneContabilidade.setText("");
        txtObs.setText("");
    }

    class gravaBackup extends TimerTask {

        @Override
        public void run() {
            boolean contemErro = false;
            File folder = new File("X:\\HDS_BKP");
            if (folder.exists()) {
                String[] listaPasta = folder.list();
                for (String pasta : listaPasta) {
                    Empresa empresa = new Empresa();
                    File pastaEmpresa = new File(folder + "\\" + pasta);
                    File[] listaArquivos = pastaEmpresa.listFiles();

                    try {
                        empresa = empresaDAO.consultaPasta(pasta);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    for (File arquivo : listaArquivos) {
                        if (arquivo.getName().contains("BKP")) {
                            Backup backup = new Backup();
                            backup.setPastaEmpresa(pasta);
                            if (empresa.getId_cliente() != null) {
                                backup.setId_cliente(empresa.getId_cliente());
                            } else {
                                gravaLog.gravaTxtLog("ERRO : não encontrado cliente referenciado a pasta " + pasta);
                            }

                            try {
                                BufferedReader StrR = new BufferedReader(new FileReader(arquivo));
                                String Str;
                                String[] TableLine;
                                while ((Str = StrR.readLine()) != null) {
                                    TableLine = Str.split("\\|");
                                    backup.setRetorno(TableLine[0]);
                                    if (TableLine[0].contains("erro")) {
                                        contemErro = true;
                                    }
                                    backup.setNome(TableLine[1]);
                                    backup.setDataFim(TableLine[2]);
                                }
                                StrR.close();
                                empresaDAO.GravaBackup(backup);
                                arquivo.delete();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro ao ler aquivo de backup - " + pasta);
                                gravaLog.gravaTxtLog("Erro ao ler aquivo de backup - " + pasta);
                            }
                        }
                        if (arquivo.getName().contains(".ERR")) {
                            Erro erro = new Erro();
                            erro.setPastaEmpresa(pasta);
                            if (empresa.getId_cliente() != null) {
                                erro.setId_cliente(empresa.getId_cliente());
                            } else {
                                gravaLog.gravaTxtLog("ERRO : não encontrado cliente referenciado a pasta " + pasta);
                            }

                            try {
                                BufferedReader StrR = new BufferedReader(new FileReader(arquivo));
                                String Str;
                                String[] TableLine;
                                while ((Str = StrR.readLine()) != null) {
                                    TableLine = Str.split("\\|");
                                    erro.setPrograma(TableLine[0]);
                                    erro.setCaminhoarquivo(TableLine[1]);
                                    erro.setParagrafo(TableLine[2]);
                                    erro.setArquivo(TableLine[3]);
                                    erro.setOperacao(TableLine[4]);
                                    erro.setCoderro(TableLine[5]);
                                    erro.setChave(TableLine[6]);
                                    erro.setMensagemerro(TableLine[7]);
                                    erro.setData(TableLine[8]);
                                    erro.setUsuariots(TableLine[9]);
                                    erro.setNomeservidor(TableLine[10]);
                                    erro.setNomecomputador(TableLine[11]);
                                }
                                StrR.close();

                                empresaDAO.GravaErro(erro);
                                TrayClass notify = new TrayClass(empresa.getFantasia(), erro.getCoderro() + " - " + erro.getMensagemerro());
                                arquivo.delete();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro ao ler aquivo de .ERR - Empresa : " + pasta);
                                gravaLog.gravaTxtLog("Erro ao ler aquivo de .ERR " + pasta);
                            }

                        }
                    }
                }
            } else {
                gravaLog.gravaTxtLog("ERRO ao encontrar X:\\HDS_BKP, mapeie a unidade para funcionar normalmente.");
                JOptionPane.showMessageDialog(null, "ERRO ao encontrar X:\\HDS_BKP, mapeie a unidade para funcionar normalmente.");
            }
            if (contemErro) {
                try {
                    ProcessBuilder processBuilder = new ProcessBuilder();
                    processBuilder.command("EmiteAudio.exe", "error.mp3");
                    Process process = processBuilder.start(); //Process p = Runtime.getRuntime().exec("EmiteAudio 'error.mp3'");

                } catch (IOException ex) {
                    gravaLog.gravaTxtLog(ex.getMessage());
                }
            }
        }
    }

    public void conectar() {
        //Cria .RDP na pasta Raiz
        try {
            try (FileOutputStream arquivo = new FileOutputStream("./RDP/" + jLabelTerminal.getText() + "-" + txtSenha.getText() + ".rdp"); PrintWriter pr = new PrintWriter(arquivo)) {
                pr.println("screen mode id:i:2");
                pr.println("use multimon:i:0");
                pr.println("desktopwidth:i:800");
                pr.println("desktopheight:i:600");
                pr.println("session bpp:i:32");
                pr.println("winposstr:s:0,3,0,0,800,600");
                pr.println("compression:i:1");
                pr.println("keyboardhook:i:2");
                pr.println("audiocapturemode:i:0");
                pr.println("videoplaybackmode:i:1");
                pr.println("connection type:i:7");
                pr.println("networkautodetect:i:1");
                pr.println("bandwidthautodetect:i:1");
                pr.println("displayconnectionbar:i:1");
                pr.println("enableworkspacereconnect:i:0");
                pr.println("disable wallpaper:i:0");
                pr.println("allow font smoothing:i:0");
                pr.println("allow desktop composition:i:0");
                pr.println("disable full window drag:i:1");
                pr.println("disable menu anims:i:1");
                pr.println("disable themes:i:0");
                pr.println("disable cursor setting:i:0");
                pr.println("bitmapcachepersistenable:i:1");
                pr.println("full address:s:" + txtIpServidor.getText());
                pr.println("audiomode:i:0");
                pr.println("redirectprinters:i:1");
                pr.println("redirectcomports:i:0");
                pr.println("redirectsmartcards:i:1");
                pr.println("redirectclipboard:i:1");
                pr.println("redirectposdevices:i:0");
                pr.println("autoreconnection enabled:i:1");
                pr.println("authentication level:i:2");
                pr.println("prompt for credentials:i:0");
                pr.println("negotiate security layer:i:1");
                pr.println("remoteapplicationmode:i:0");
                pr.println("alternate shell:s:");
                pr.println("shell working directory:s:");
                pr.println("gatewayhostname:s:");
                pr.println("gatewayusagemethod:i:4");
                pr.println("gatewaycredentialssource:i:4");
                pr.println("gatewayprofileusagemethod:i:0");
                pr.println("promptcredentialonce:i:0");
                pr.println("gatewaybrokeringtype:i:0");
                pr.println("use redirection server name:i:0");
                pr.println("rdgiskdcproxy:i:0");
                pr.println("kdcproxyname:s:");
                pr.println("username:s:");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Abre Arquivo .RDP criado acima
        try {
            gravaLog.gravaTxtLogConexoes("Conectando em " + jLabelFantasia.getText());
            Desktop.getDesktop().open(new File("./RDP/" + jLabelTerminal.getText() + "-" + txtSenha.getText() + ".rdp"));
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
