/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import controle.ControleCategorias;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

/**
 *
 * @author Aluno
 */
public class TelaManutencaoCategorias extends javax.swing.JDialog {

    ControleCategorias controle = new ControleCategorias();

    public TelaManutencaoCategorias(Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        
        atualizarTabela();        
    }
    
    private void atualizarTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabCategorias.getModel();
        
        modelo.setRowCount(0);
        // varre todos os produtos que estão no controle
        for(Categoria c : controle.getTodos())
        {
            modelo.addRow(new Object[]{c.getNome(), c.getResponsavel()});
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
        tabCategorias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        botNovo = new javax.swing.JButton();
        botAlterar = new javax.swing.JButton();
        botExcluir = new javax.swing.JButton();
        botVer = new javax.swing.JButton();
        botSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manutenção de Categorias");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Responsável"
            }
        ));
        jScrollPane1.setViewportView(tabCategorias);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 3, 0));

        botNovo.setText("Novo");
        botNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoActionPerformed(evt);
            }
        });
        jPanel2.add(botNovo);

        botAlterar.setText("Alterar");
        botAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(botAlterar);

        botExcluir.setText("Excluir");
        botExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(botExcluir);

        botVer.setText("Ver");
        botVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVerActionPerformed(evt);
            }
        });
        jPanel2.add(botVer);

        botSair.setText("Sair");
        botSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSairActionPerformed(evt);
            }
        });
        jPanel2.add(botSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoActionPerformed
    
        TelaDadosCategoria tela = new TelaDadosCategoria(null, true);
        
        tela.setVisible(true);
        
        if(tela.isConfirmou())
        {
            // pegar o prodyuto que foi digitado na tela de dados
            Categoria c = tela.getCategoria();

            controle.adicionar(c);

            atualizarTabela();
        }
        
    }//GEN-LAST:event_botNovoActionPerformed

    private void botAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAlterarActionPerformed
        
        // pega a linha selecionada da tabela se não estiver selecionada
        // retornará -1
        int linha = tabCategorias.getSelectedRow();
        
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, 
                    "Não foi selecionado nenhum produto. Selecione.");
        }
        else
        {
            TelaDadosCategoria tela = new TelaDadosCategoria(null, true);

            tela.setCategoria(controle.getCategoria(linha));
            
            tela.setVisible(true);    

            if(tela.isConfirmou())
            {
                // pegar o prodyuto que foi digitado na tela de dados
                Categoria c = tela.getCategoria();

                controle.alterar(linha, c);

                atualizarTabela();
            }            
            
            
        }
        
    }//GEN-LAST:event_botAlterarActionPerformed

    private void botExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirActionPerformed
        // pega a linha selecionada da tabela se não estiver selecionada
        // retornará -1
        int linha = tabCategorias.getSelectedRow();
        
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, 
                    "Não foi selecionado nenhuma categoria. Selecione.");
        }
        else
        {
            // cria o dialog de confirmação
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Deseja excluir essa categoria?",
                    "Exclusão de Categorias", 
                    JOptionPane.YES_NO_OPTION);
            
            // verifica o que foi clicado
            if (resposta == JOptionPane.YES_OPTION)
            {
                controle.remover(linha);
                atualizarTabela();
            }
        }
    }//GEN-LAST:event_botExcluirActionPerformed

    private void botVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVerActionPerformed
        // pega a linha selecionada da tabela se não estiver selecionada
        // retornará -1
        int linha = tabCategorias.getSelectedRow();
        
        if (linha == -1)
        {
            JOptionPane.showMessageDialog(null, 
                    "Não foi selecionado nenhum categoria. Selecione.");
        }
        else
        {
            TelaDadosCategoria tela = new TelaDadosCategoria(null, true);

            tela.setCategoria(controle.getCategoria(linha));
            
            tela.desabilitarEdicao();
            
            tela.setVisible(true);    
            
        }        
    }//GEN-LAST:event_botVerActionPerformed

    private void botSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botSairActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManutencaoCategorias(null, true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAlterar;
    private javax.swing.JButton botExcluir;
    private javax.swing.JButton botNovo;
    private javax.swing.JButton botSair;
    private javax.swing.JButton botVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCategorias;
    // End of variables declaration//GEN-END:variables
}
