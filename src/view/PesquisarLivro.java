/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mocks.MockLivro;
import models.Livro;


/**
 *
 * @author danilo.martinez
 */
public class PesquisarLivro extends javax.swing.JInternalFrame {
    private TelaPrincipal parent;
    public List<Livro> pesquisaLivro;

    /**
     * Creates new form PesquisarLivro
     */
    public PesquisarLivro(TelaPrincipal parent) {
        this.parent = parent;
        initComponents();
        
//    tablePesquisa.getColumnModel().getColumn(0).setMinWidth(0);
//    tablePesquisa.getColumnModel().getColumn(0).setMaxWidth(0);
//    tablePesquisa.getColumnModel().getColumn(0).setWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fEditora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonPesquisar = new javax.swing.JButton();
        comboGenero = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePesquisa = new javax.swing.JTable();
        pesquisaDetalhada = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar Livro");

        jLabel2.setText("Título");

        fTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTituloActionPerformed(evt);
            }
        });

        jLabel4.setText("Editora");

        fEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEditoraActionPerformed(evt);
            }
        });

        jLabel5.setText("Autor");

        fAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fAutorActionPerformed(evt);
            }
        });

        jLabel6.setText("Genero");

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.setName(""); // NOI18N
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Drama", "Romance", "Aventura", "Sci-Fi", "Infantil", "Religiao", "Didatico" }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(fTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fAutor)
                    .addComponent(comboGenero, 0, 118, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(buttonPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fTitulo)
                    .addComponent(jLabel2)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addComponent(buttonPesquisar))
        );

        fTitulo.setTransferHandler(null);
        fEditora.setTransferHandler(null);
        fAutor.setTransferHandler(null);

        tablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Editora", "Autor", "Genero", "Edição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePesquisa.setToolTipText("");
        tablePesquisa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesquisaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablePesquisaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablePesquisa);

        pesquisaDetalhada.setText("Mais Detalhes");
        pesquisaDetalhada.setEnabled(false);
        pesquisaDetalhada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaDetalhadaActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pesquisaDetalhada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaDetalhada)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        pesquisaLivro = null;
        
        DefaultTableModel model = (DefaultTableModel) tablePesquisa.getModel();
        model.setRowCount(0);
        
        pesquisaLivro = MockLivro.procurarLivro(fTitulo.getText(), fAutor.getText()
                , fEditora.getText(),comboGenero.getSelectedItem().toString());
        
        if(pesquisaLivro == null){
            JOptionPane.showMessageDialog(this, "Preencha ao menos um campo de pesquisa");
        } else {
            for(int i = 0; i < pesquisaLivro.size(); i++){
                Livro liv = pesquisaLivro.get(i);
                if(liv != null){
                    Object[] row = new Object[7];
                    row[0] = liv.getId();
                    row[1] = liv.getTitulo();
                    row[2] = liv.getEditora();
                    row[3] = liv.getAutor();
                    row[4] = liv.getGenero();
                    row[5] = liv.getEdicao();
                    row[6] = liv.getValor();
                    model.addRow(row);
                }
            }
        }
        pesquisaDetalhada.setEnabled(false);
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGeneroActionPerformed

    private void fEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEditoraActionPerformed
        
    }//GEN-LAST:event_fEditoraActionPerformed
    private void fTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTituloActionPerformed

    private void fAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fAutorActionPerformed
    
    private void pesquisaDetalhadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaDetalhadaActionPerformed
        try{
            int id = pesquisaLivro.get(tablePesquisa.getSelectedRow()).getId();
            if(id >= 0){
                for(Livro livro : MockLivro.listaLivro){
                    if(tablePesquisa.getValueAt(tablePesquisa.getSelectedRow() , 0) == livro.getId()){
                        parent.abrirTelaDetalhesLivro(livro);
                        DefaultTableModel model = (DefaultTableModel) tablePesquisa.getModel();
                        model.setRowCount(0);
                        pesquisaDetalhada.setEnabled(false);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione 1 item para exibir detalhes");
            }  
        } catch (Exception e){
            //JOptionPane.showMessageDialog(this, "Selecione 1 item para exibir detalhes");
        }
    }//GEN-LAST:event_pesquisaDetalhadaActionPerformed

    private void tablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesquisaMouseClicked
        pesquisaDetalhada.setEnabled(true);
    }//GEN-LAST:event_tablePesquisaMouseClicked

    private void tablePesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesquisaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePesquisaMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja cancelar a pesquisa?") == 0){
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JTextField fAutor;
    private javax.swing.JTextField fEditora;
    private javax.swing.JTextField fTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisaDetalhada;
    private javax.swing.JTable tablePesquisa;
    // End of variables declaration//GEN-END:variables
}
