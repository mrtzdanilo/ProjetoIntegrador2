/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewTelaPrincipal;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import mockLivro.MockLivro;
import mockCliente.MockCliente;
import viewCliente.CadastroCliente;
import viewCliente.DetalhesCliente;
import viewCliente.PesquisaCliente;
import viewLivro.CadastroLivro;
import viewLivro.DetalhesLivro;
import viewLivro.PesquisarLivro;
import viewVenda.Relatorio;
import viewVenda.Venda;

/**
 *
 * @author Dan
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    CadastroCliente cadCliente = null;
    PesquisaCliente pesquisarCliente = null;
    CadastroLivro cadLivro = null;
    DetalhesCliente detalhesCliente = null;
    DetalhesLivro detalhesLivro = null;
    PesquisarLivro pesquisarLivro = null;
    Relatorio relatorio = null;
    Venda venda = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/livraria-lello.jpg"));
        Image image = icon.getImage();
        deskPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCadastroCliente = new javax.swing.JMenuItem();
        menuPesquisarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCadastrarProduto = new javax.swing.JMenuItem();
        menuPesquisarProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuVenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 800));

        deskPane.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout deskPaneLayout = new javax.swing.GroupLayout(deskPane);
        deskPane.setLayout(deskPaneLayout);
        deskPaneLayout.setHorizontalGroup(
            deskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        deskPaneLayout.setVerticalGroup(
            deskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        jMenu1.setText("Cliente");

        menuCadastroCliente.setText("Cadastrar");
        menuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroClienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadastroCliente);

        menuPesquisarCliente.setText("Pesquisar");
        menuPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuPesquisarCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste_1.png"))); // NOI18N
        jMenu2.setText("Produto");

        menuCadastrarProduto.setText("Cadastrar");
        menuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadastrarProduto);

        menuPesquisarProduto.setText("Pesquisar");
        menuPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(menuPesquisarProduto);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda1.png"))); // NOI18N
        jMenu3.setText("Vendas");

        menuVenda.setText("Efeturar Venda");
        menuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendaActionPerformed(evt);
            }
        });
        jMenu3.add(menuVenda);

        menuRelatorio.setText("Relatório");
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        jMenu3.add(menuRelatorio);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    public void abrirTelaCadastroCliente(){
        if(cadCliente == null || !cadCliente.isDisplayable()&& !cadCliente.isVisible()){
            cadCliente = new CadastroCliente();
            deskPane.add(cadCliente);
            this.openFrameInCenter(cadCliente);
        }
        cadCliente.getDesktopPane().getDesktopManager().deiconifyFrame(cadCliente);
        cadCliente.toFront();
    }
    
    public void abrirTelaDetalhesCliente(int id){
        if(detalhesCliente == null || !detalhesCliente.isDisplayable() && 
                !detalhesCliente.isVisible()){
            detalhesCliente = new DetalhesCliente();
            deskPane.add(detalhesCliente);
            this.openFrameInCenter(detalhesCliente);
            detalhesCliente.fNome.setText(MockCliente.listaCliente.get(id).getNome());
            detalhesCliente.fSobrenome.setText(MockCliente.listaCliente.get(id).getSobrenome());
            detalhesCliente.fCpf.setText(MockCliente.listaCliente.get(id).getCpf());
            detalhesCliente.fRg.setText(MockCliente.listaCliente.get(id).getRg());
            detalhesCliente.comboSexo.setSelectedItem(MockCliente.listaCliente.get(id).getSexo());
            detalhesCliente.fRua.setText(MockCliente.listaCliente.get(id).getRua());
            detalhesCliente.fBairro.setText(MockCliente.listaCliente.get(id).getBairro());
            detalhesCliente.fNumero.setText(MockCliente.listaCliente.get(id).getNumeroCasa());
            detalhesCliente.fComplemento.setText(MockCliente.listaCliente.get(id).getComplemento());
            detalhesCliente.fCidade.setText(MockCliente.listaCliente.get(id).getCidade());
            detalhesCliente.comboEstado.setSelectedItem(MockCliente.listaCliente.get(id).getEstado());
            detalhesCliente.fEmail.setText(MockCliente.listaCliente.get(id).getEmail());
            detalhesCliente.fCelular.setText(MockCliente.listaCliente.get(id).getCelular());
            detalhesCliente.fTelefone.setText(MockCliente.listaCliente.get(id).getTelefone());
            detalhesCliente.fCep.setText(MockCliente.listaCliente.get(id).getCep());
            detalhesCliente.setId(id);
        }
    }
    
    public void abrirTelaDetalhesLivro(int id){
        if(detalhesLivro == null || !detalhesLivro.isDisplayable()&& !detalhesLivro.isVisible()){
            detalhesLivro = new DetalhesLivro();
            deskPane.add(detalhesLivro);
            this.openFrameInCenter(detalhesLivro);
            detalhesLivro.fEstoque.setText(MockLivro.listaLivro.get(id).getEstoque().toString());
            detalhesLivro.fieldValor.setText(MockLivro.listaLivro.get(id).getValor().toString());
            detalhesLivro.fTitulo.setText(MockLivro.listaLivro.get(id).getTitulo());
            detalhesLivro.fAutor.setText(MockLivro.listaLivro.get(id).getAutor());
            detalhesLivro.fEditora.setText(MockLivro.listaLivro.get(id).getEditora());
            detalhesLivro.fEdicao.setText(MockLivro.listaLivro.get(id).getEdicao());
            detalhesLivro.fIsbn.setText(MockLivro.listaLivro.get(id).getIsbn());
            detalhesLivro.fAltura.setText(MockLivro.listaLivro.get(id).getAltura());
            detalhesLivro.fPeso.setText(MockLivro.listaLivro.get(id).getPeso());
            detalhesLivro.fLargura.setText(MockLivro.listaLivro.get(id).getLargura());
            detalhesLivro.fNumeroPaginas.setText(MockLivro.listaLivro.get(id).getNumeroPaginas().toString());
            detalhesLivro.comboIdioma.setSelectedItem(MockLivro.listaLivro.get(id).getIdioma());
            detalhesLivro.comboGenero.setSelectedItem(MockLivro.listaLivro.get(id).getGenero());
            detalhesLivro.fNumeroPaginas.setText(MockLivro.listaLivro.get(id).getNumeroPaginas().toString() + (""));
            detalhesLivro.setId(id);
        }
        detalhesLivro.getDesktopPane().getDesktopManager().deiconifyFrame(detalhesLivro);
        detalhesLivro.toFront();
    }
    
    public void attachWindow(JInternalFrame jif){
         if(jif == null || !jif.isDisplayable()&& !jif.isVisible()){
            //cadCliente = new CadastroCliente();
            this.deskPane.add(jif);
            this.openFrameInCenter(jif);
        }
        jif.getDesktopPane().getDesktopManager().deiconifyFrame(jif);
        jif.toFront();
    }
    
            
            
    private void menuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroClienteActionPerformed
        abrirTelaCadastroCliente();
    }//GEN-LAST:event_menuCadastroClienteActionPerformed

    private void menuPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarClienteActionPerformed
        if(pesquisarCliente == null || !pesquisarCliente.isDisplayable() && !pesquisarCliente.isVisible()){
            pesquisarCliente = new PesquisaCliente(this);
            deskPane.add(pesquisarCliente);
            this.openFrameInCenter(pesquisarCliente);
        }
        pesquisarCliente.getDesktopPane().getDesktopManager().deiconifyFrame(pesquisarCliente);
        pesquisarCliente.toFront();
    }//GEN-LAST:event_menuPesquisarClienteActionPerformed

    private void menuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutoActionPerformed
        if(cadLivro == null || !cadLivro.isDisplayable() && !cadLivro.isVisible()){
            cadLivro = new CadastroLivro();
            deskPane.add(cadLivro);
            this.openFrameInCenter(cadLivro);
        }
        cadLivro.getDesktopPane().getDesktopManager().deiconifyFrame(cadLivro);
        cadLivro.toFront();
    }//GEN-LAST:event_menuCadastrarProdutoActionPerformed

    private void menuPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarProdutoActionPerformed
        if(pesquisarLivro == null || !pesquisarLivro.isDisplayable() && !pesquisarLivro.isVisible()){
            pesquisarLivro = new PesquisarLivro(this);
            deskPane.add(pesquisarLivro);
            this.openFrameInCenter(pesquisarLivro);
        }
        pesquisarLivro.getDesktopPane().getDesktopManager().deiconifyFrame(pesquisarLivro);
        pesquisarLivro.toFront();
    }//GEN-LAST:event_menuPesquisarProdutoActionPerformed

    private void menuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendaActionPerformed
        if(venda == null || !venda.isDisplayable() && !venda.isVisible()){
            venda = new Venda();
            deskPane.add(venda);
            this.openFrameInCenter(venda);
           
        }
        venda.getDesktopPane().getDesktopManager().deiconifyFrame(venda);
        venda.toFront();
    }//GEN-LAST:event_menuVendaActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        if(relatorio == null || !relatorio.isDisplayable() && !relatorio.isVisible()){
            relatorio = new Relatorio();
            deskPane.add(relatorio);
            this.openFrameInCenter(relatorio);
           
        }
        relatorio.getDesktopPane().getDesktopManager().deiconifyFrame(relatorio);
        relatorio.toFront();
    }//GEN-LAST:event_menuRelatorioActionPerformed

    
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = deskPane.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane deskPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCadastrarProduto;
    private javax.swing.JMenuItem menuCadastroCliente;
    private javax.swing.JMenuItem menuPesquisarCliente;
    private javax.swing.JMenuItem menuPesquisarProduto;
    private javax.swing.JMenuItem menuRelatorio;
    private javax.swing.JMenuItem menuVenda;
    // End of variables declaration//GEN-END:variables
}
