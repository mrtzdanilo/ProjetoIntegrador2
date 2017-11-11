/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import mocks.MockVenda;
import models.ItemVenda;
import models.Venda;

/**
 *
 * @author Dan
 */
public class Relatorio extends javax.swing.JInternalFrame {
    private TelaPrincipal parent;
    /**
     * Creates new form Relatorio
     */
    public Relatorio(TelaPrincipal parent) {
        this.parent = parent;
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

        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonPesquisar = new javax.swing.JButton();
        fMes = new javax.swing.JFormattedTextField();
        buttonDetalhes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRelatorio = new javax.swing.JTable();

        jLabel4.setText("jLabel4");

        jLabel7.setText("Até Mês");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("RELATÓRIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jLabel2.setText("Período");

        jLabel3.setText("Nome do Cliente");

        jLabel5.setText("Titulo do Livro");

        jLabel6.setText("Mês");

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        try {
            fMes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buttonDetalhes.setText("Ver Produtos");
        buttonDetalhes.setEnabled(false);
        buttonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fTitulo)
                    .addComponent(fCliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(fMes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(buttonDetalhes, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        fCliente.setTransferHandler(null);
        fTitulo.setTransferHandler(null);
        fMes.setTransferHandler(null);

        tableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Cliente", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class
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
        tableRelatorio.setToolTipText("");
        tableRelatorio.getColumnModel().getColumn(0).setMinWidth(0);         tableRelatorio.getColumnModel().getColumn(0).setMaxWidth(0);         tableRelatorio.getColumnModel().getColumn(0).setWidth(0);
        tableRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRelatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        buttonDetalhes.setEnabled(false);
        Calendar c = Calendar.getInstance();
        DefaultTableModel model = (DefaultTableModel) tableRelatorio.getModel();
        model.setRowCount(0);
        
        boolean titulo = false;
        for(Venda venda:MockVenda.listaVenda){
            if(!fTitulo.equals("")){
                for(ItemVenda item : venda.getListaItemVenda()){
                    if(fTitulo.getText().toUpperCase().equals(item.getLivro().getTitulo().toUpperCase())){
                        titulo = true;
                    }
                }
            }
            
            c.setTime(venda.getData());
            Format monthYear = new SimpleDateFormat("MM/YYYY");
            Format year = new SimpleDateFormat("dd/MM/YYYY");
            String data = monthYear.format(c.getTime());
            if(data.equals(fMes.getText()) || fCliente.getText().toUpperCase().equals(venda.getCliente().getNome().toUpperCase())
                    || titulo){
                Object[] row = new Object[5];
                row[0] = venda.getIdVenda();
                row[1] = year.format(venda.getData());
                row[2] = venda.getCliente().getNome() + " " + venda.getCliente().getSobrenome();
                row[3] = venda.getValor();
                model.addRow(row);
            }
        }
        
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void tableRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRelatorioMouseClicked
        buttonDetalhes.setEnabled(true);
    }//GEN-LAST:event_tableRelatorioMouseClicked

    private void buttonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetalhesActionPerformed
        parent.abrirTelaDetalhesRelatorio((int)tableRelatorio.getValueAt(tableRelatorio.getSelectedRow(), 0));
        
        
    }//GEN-LAST:event_buttonDetalhesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDetalhes;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JTextField fCliente;
    private javax.swing.JFormattedTextField fMes;
    private javax.swing.JTextField fTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tableRelatorio;
    // End of variables declaration//GEN-END:variables
}
