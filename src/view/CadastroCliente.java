/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import models.Cliente;
import service.ServiceCliente;

/**
 *
 * @author Dan
 */
public class CadastroCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fSobrenome = new javax.swing.JTextField();
        fCpf = new javax.swing.JFormattedTextField();
        fRg = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        fEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fCelular = new javax.swing.JFormattedTextField();
        fTelefone = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fCidade = new javax.swing.JTextField();
        fRua = new javax.swing.JTextField();
        fBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        fComplemento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fCep = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setMaximumSize(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("  Cadastro De Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));
        jPanel3.setMaximumSize(null);

        jLabel1.setText("Nome *");

        fNome.setTransferHandler(null);
        fNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNomeActionPerformed(evt);
            }
        });
        fNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNomeKeyTyped(evt);
            }
        });

        jLabel3.setText("CPF *");

        jLabel4.setText("RG *");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel6.setText("Sexo *");

        jLabel19.setText("Sobrenome *");

        fSobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fSobrenomeKeyTyped(evt);
            }
        });

        try {
            fCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fCpfKeyTyped(evt);
            }
        });

        try {
            fRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fRgKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fNome)
                    .addComponent(fSobrenome)
                    .addComponent(fCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSexo, 0, 133, Short.MAX_VALUE)
                    .addComponent(fRg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNome)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(comboSexo))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fSobrenome)
                            .addComponent(jLabel19))))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        fSobrenome.setTransferHandler(null);
        fCpf.setTransferHandler(null);
        fRg.setTransferHandler(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Contatos"));

        fEmail.setMaximumSize(null);
        fEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fEmailKeyTyped(evt);
            }
        });

        jLabel5.setText("Email");
        jLabel5.setMaximumSize(null);

        jLabel7.setText("Telefone Fixo");

        jLabel8.setText("Celular");

        try {
            fCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fCelularKeyTyped(evt);
            }
        });

        fTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fTelefoneKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(fCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(fTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(fEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(fCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        fEmail.setTransferHandler(null);
        fCelular.setTransferHandler(null);
        fTelefone.setTransferHandler(null);

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(jButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel9.setText("Rua ");

        jLabel10.setText("Bairro ");

        jLabel11.setText("Cidade");

        jLabel12.setText("Estado");

        fCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCidadeActionPerformed(evt);
            }
        });
        fCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fCidadeKeyTyped(evt);
            }
        });

        fRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fRuaKeyTyped(evt);
            }
        });

        fBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fBairroKeyTyped(evt);
            }
        });

        jLabel13.setText("Número ");

        fNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNumeroKeyTyped(evt);
            }
        });

        jLabel14.setText("CEP");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Paraná", "Paraíba", "Pará", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondonia", "Roraima", "Santa Catarina", "Sergipe", "São Paulo", "Tocantins" }));

        fComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fComplementoKeyTyped(evt);
            }
        });

        jLabel18.setText("Complemento");

        try {
            fCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fCepKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(fNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(fRua))
                    .addComponent(fBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(fCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 22, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(fNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(fBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(fCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        fCidade.setTransferHandler(null);
        fRua.setTransferHandler(null);
        fBairro.setTransferHandler(null);
        fNumero.setTransferHandler(null);
        fComplemento.setTransferHandler(null);
        fCep.setTransferHandler(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fCidadeActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        Cliente cliente = new Cliente();
        
        cliente.setNome(fNome.getText());
        cliente.setSobrenome(fSobrenome.getText());
        cliente.setCpf(fCpf.getText());
        cliente.setRg(fRg.getText());
        cliente.setSexo(comboSexo.getSelectedItem().toString());
        cliente.setRua(fRua.getText());
        cliente.setBairro(fBairro.getText());
        cliente.setCidade(fCidade.getText());
        cliente.setComplemento(fComplemento.getText());
        cliente.setCep(fCep.getText());
        cliente.setEstado(comboEstado.getSelectedItem().toString());
        cliente.setCelular(fCelular.getText());
        cliente.setTelefone(fTelefone.getText());
        cliente.setEmail(fEmail.getText());
        cliente.setNumeroCasa(fNumero.getText());
        
        try{
            ServiceCliente.cadastrarCliente(cliente);
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"Erro", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Cliente Cadastrado");
        
        fNome.setText("");
        fSobrenome.setText("");
        fCpf.setText("");
        fRg.setText("");
        fRua.setText("");
        fBairro.setText("");
        fComplemento.setText("");
        comboEstado.setSelectedIndex(0);
        comboSexo.setSelectedIndex(0);
        fCelular.setText("");
        fTelefone.setText("");
        fEmail.setText("");
        fCep.setText("");
        fCidade.setText("");
        fNumero.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void fCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCpfKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fCpf.getText().length() == 11){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 11 Numeros");
        }
    }//GEN-LAST:event_fCpfKeyTyped

    private void fRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fRgKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fRg.getText().length() == 9){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 9 Numeros");
        }
    }//GEN-LAST:event_fRgKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja cancelar o cadastro") == 0){
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNumeroKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fNumero.getText().length() == 5){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 5 Numeros");
        }
    }//GEN-LAST:event_fNumeroKeyTyped

    private void fComplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fComplementoKeyTyped
        if(fCpf.getText().length() == 20){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 20 Caracteres");
        }
    }//GEN-LAST:event_fComplementoKeyTyped

    private void fBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fBairroKeyTyped
        if(fCpf.getText().length() == 20){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 20 Caracteres");
        }
    }//GEN-LAST:event_fBairroKeyTyped

    private void fCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCepKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fNumero.getText().length() == 8){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 8 Numeros");
        }
    }//GEN-LAST:event_fCepKeyTyped

    private void fSobrenomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fSobrenomeKeyTyped
        String permitidos = "abcdefghijklmnopqrstuwyvxz ".toUpperCase();
        Character ch = evt.getKeyChar();
        if(!permitidos.contains(ch.toString().toUpperCase())){
            evt.consume();
        }
        if(fSobrenome.getText().length() == 0 && ch.toString().equals(" ")){
            evt.consume();
        }
        
        if(fSobrenome.getText().length() == 50){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 50 Caracteres");
        }
    }//GEN-LAST:event_fSobrenomeKeyTyped

    private void fNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNomeKeyTyped
        String permitidos = "abcdefghijklmnopqrstuwyvxz ".toUpperCase();
        Character ch = evt.getKeyChar();
        if(!permitidos.contains(ch.toString().toUpperCase())){
            evt.consume();
        }
        
        if(fNome.getText().length() >= 30){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 30 Caracteres");
        }
    }//GEN-LAST:event_fNomeKeyTyped

    private void fEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fEmailKeyTyped
        String permitidos = "abcdefghijklmnopqrstuwyvxz_@0123654789.".toUpperCase();
        Character ch = evt.getKeyChar();
        if(!permitidos.contains(ch.toString().toUpperCase())){
            evt.consume();
        }

        if(fEmail.getText().length() == 50){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 50 Caracteres");
        }
    }//GEN-LAST:event_fEmailKeyTyped

    private void fTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fTelefoneKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fTelefone.getText().length() == 8){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 8 Numeros");
        }
    }//GEN-LAST:event_fTelefoneKeyTyped

    private void fCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCidadeKeyTyped
        String permitidos = "abcdefghijklmnopqrstuwyvxz. ".toUpperCase();
        Character ch = evt.getKeyChar();
        if(!permitidos.contains(ch.toString().toUpperCase())){
            evt.consume();
        }

        if(fCidade.getText().length() == 50){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 50 Caracteres");
        }
    }//GEN-LAST:event_fCidadeKeyTyped

    private void fCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCelularKeyTyped
        Character ch = evt.getKeyChar();
        String permitidos = "0123456789";
        if(!permitidos.contains(ch.toString())){
            evt.consume();
        }
        
        if(fCelular.getText().length() == 11){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 11 Numeros");
        }
    }//GEN-LAST:event_fCelularKeyTyped

    private void fRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fRuaKeyTyped
        String permitidos = "abcdefghijklmnopqrstuwyvxz. ".toUpperCase();
        Character ch = evt.getKeyChar();
        if(!permitidos.contains(ch.toString().toUpperCase())){
            evt.consume();
        }

        if(fRua.getText().length() == 50){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Maximo 50 Caracteres");
        }
    }//GEN-LAST:event_fRuaKeyTyped

    private void fNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalvar;
    public javax.swing.JComboBox<String> comboEstado;
    public javax.swing.JComboBox<String> comboSexo;
    public javax.swing.JTextField fBairro;
    public javax.swing.JFormattedTextField fCelular;
    public javax.swing.JFormattedTextField fCep;
    public javax.swing.JTextField fCidade;
    public javax.swing.JTextField fComplemento;
    public javax.swing.JFormattedTextField fCpf;
    public javax.swing.JTextField fEmail;
    public javax.swing.JTextField fNome;
    public javax.swing.JTextField fNumero;
    public javax.swing.JFormattedTextField fRg;
    public javax.swing.JTextField fRua;
    public javax.swing.JTextField fSobrenome;
    public javax.swing.JFormattedTextField fTelefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
