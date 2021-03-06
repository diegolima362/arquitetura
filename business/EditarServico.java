package business;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thebell
 */
public class EditarServico extends javax.swing.JFrame {

    private final int index;
    private final PrestadorServico servico;
    private final ArrayList<PrestadorServico> servicos;

    public EditarServico(int index, ArrayList<PrestadorServico> servicos) {
        this.index = index;
        this.servico = servicos.get(index);
        this.servicos = servicos;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNovoServico = new javax.swing.JPanel();
        jScrollPaneNovoServico = new javax.swing.JScrollPane();
        jPanelNovoServicoConteudo = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jTextFieldServicoNome = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jTextFieldServicoCodigo = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jTextFieldServicoDesconto = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaServicoDescricao = new javax.swing.JTextArea();
        jButtonServicoSalvar = new javax.swing.JButton();
        jButtonServicoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Serviço"));

        jLabel90.setText("Nome");

        jTextFieldServicoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServicoNomeActionPerformed(evt);
            }
        });

        jLabel92.setText("Código");

        jTextFieldServicoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServicoCodigoActionPerformed(evt);
            }
        });

        jLabel94.setText("Desconto");

        jTextFieldServicoDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServicoDescontoActionPerformed(evt);
            }
        });

        jLabel104.setText("Descrição");

        jTextAreaServicoDescricao.setColumns(20);
        jTextAreaServicoDescricao.setRows(5);
        jScrollPane7.setViewportView(jTextAreaServicoDescricao);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextFieldServicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel96))
                            .addComponent(jLabel92)
                            .addComponent(jTextFieldServicoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel94)
                    .addComponent(jLabel90)
                    .addComponent(jLabel104)
                    .addComponent(jTextFieldServicoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldServicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldServicoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jLabel96))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldServicoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButtonServicoSalvar.setText("Salvar");
        jButtonServicoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonServicoSalvarMouseClicked(evt);
            }
        });
        jButtonServicoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicoSalvarActionPerformed(evt);
            }
        });

        jButtonServicoCancelar.setText("Cancelar");
        jButtonServicoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNovoServicoConteudoLayout = new javax.swing.GroupLayout(jPanelNovoServicoConteudo);
        jPanelNovoServicoConteudo.setLayout(jPanelNovoServicoConteudoLayout);
        jPanelNovoServicoConteudoLayout.setHorizontalGroup(
            jPanelNovoServicoConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNovoServicoConteudoLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelNovoServicoConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonServicoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonServicoCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNovoServicoConteudoLayout.setVerticalGroup(
            jPanelNovoServicoConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovoServicoConteudoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNovoServicoConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonServicoSalvar)
                    .addComponent(jButtonServicoCancelar))
                .addContainerGap(375, Short.MAX_VALUE))
        );

        jScrollPaneNovoServico.setViewportView(jPanelNovoServicoConteudo);

        javax.swing.GroupLayout jPanelNovoServicoLayout = new javax.swing.GroupLayout(jPanelNovoServico);
        jPanelNovoServico.setLayout(jPanelNovoServicoLayout);
        jPanelNovoServicoLayout.setHorizontalGroup(
            jPanelNovoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneNovoServico, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        jPanelNovoServicoLayout.setVerticalGroup(
            jPanelNovoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneNovoServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldServicoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServicoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServicoNomeActionPerformed

    private void jTextFieldServicoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServicoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServicoCodigoActionPerformed

    private void jTextFieldServicoDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServicoDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServicoDescontoActionPerformed

    private void jButtonServicoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonServicoSalvarMouseClicked
        if (jTextFieldServicoNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuServico();
        } else if (jTextFieldServicoCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuServico();
        } else if (jTextFieldServicoDesconto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuServico();
        } else if (jTextAreaServicoDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuServico();
        } else {

            servico.setNome(jTextFieldServicoNome.getText());
            servico.setCodigo(Integer.parseInt(jTextFieldServicoCodigo.getText()));
            servico.setDesconto(Double.parseDouble(jTextFieldServicoDesconto.getText()));
            servico.setDescricaoServico(jTextAreaServicoDescricao.getText());

            servicos.remove(index);
            servicos.add(index, servico);
            PrestadorServico.escrever(servicos);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            dispose();

        }
    }//GEN-LAST:event_jButtonServicoSalvarMouseClicked

    private void jButtonServicoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonServicoSalvarActionPerformed

    private void jButtonServicoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonServicoCancelarActionPerformed
    /**
    * Método para limpar os campos dp menu serviços
    */
    private void limparMenuServico() {
        jTextFieldServicoNome.setText("");
        jTextFieldServicoCodigo.setText("");
        jTextFieldServicoDesconto.setText("");
        jTextAreaServicoDescricao.setText("");
    }
    /**
    * Método para preencher os campos do menu com os dados do serviço
    */
    private void mostrar() {
        jTextFieldServicoNome.setText(servico.getNome());
        jTextFieldServicoCodigo.setText(String.valueOf(servico.getCodigo()));
        jTextFieldServicoDesconto.setText(String.valueOf(servico.getDesconto()));
        jTextAreaServicoDescricao.setText(servico.getDescricaoServico());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonServicoCancelar;
    private javax.swing.JButton jButtonServicoSalvar;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelNovoServico;
    private javax.swing.JPanel jPanelNovoServicoConteudo;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPaneNovoServico;
    private javax.swing.JTextArea jTextAreaServicoDescricao;
    private javax.swing.JTextField jTextFieldServicoCodigo;
    private javax.swing.JTextField jTextFieldServicoDesconto;
    private javax.swing.JTextField jTextFieldServicoNome;
    // End of variables declaration//GEN-END:variables
}
