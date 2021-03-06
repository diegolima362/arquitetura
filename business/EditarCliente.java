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
public class EditarCliente extends javax.swing.JFrame {

    private final int index;
    private final Cliente cliente;
    private final ArrayList<Cliente> clientes;

    
    public EditarCliente(int index, ArrayList<Cliente> clientes) {
        this.index = index;
        this.cliente = clientes.get(index);
        this.clientes = clientes;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        jPanelEditarProjeto = new javax.swing.JPanel();
        jScrollPaneNovoProjeto = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldClienteNome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldClienteCodigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldClienteTelefone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldClientePais = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldClienteEstado = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldClienteCidade = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldClienteRua = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldClienteBairro = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldClienteNumero = new javax.swing.JTextField();
        jButtonClienteSalvar = new javax.swing.JButton();
        jButtonClienteCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        jLabel11.setText("Nome");

        jTextFieldClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteNomeActionPerformed(evt);
            }
        });

        jLabel13.setText("Código");

        jTextFieldClienteCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteCodigoActionPerformed(evt);
            }
        });

        jLabel15.setText("Telefone");

        jTextFieldClienteTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteTelefoneActionPerformed(evt);
            }
        });

        jLabel18.setText("País");

        jTextFieldClientePais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClientePaisActionPerformed(evt);
            }
        });

        jLabel20.setText("Estado");

        jTextFieldClienteEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteEstadoActionPerformed(evt);
            }
        });

        jLabel22.setText("Cidade");

        jTextFieldClienteCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteCidadeActionPerformed(evt);
            }
        });

        jLabel24.setText("Rua");

        jTextFieldClienteRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteRuaActionPerformed(evt);
            }
        });

        jLabel26.setText("Bairro");

        jTextFieldClienteBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteBairroActionPerformed(evt);
            }
        });

        jLabel28.setText("Número");

        jTextFieldClienteNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextFieldClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel26)
                            .addComponent(jTextFieldClienteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20)
                            .addComponent(jLabel28))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18)
                                .addComponent(jTextFieldClienteCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addComponent(jLabel22)
                                .addComponent(jTextFieldClienteRua)
                                .addComponent(jTextFieldClientePais, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldClienteCodigo)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClienteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClienteRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonClienteSalvar.setText("Salvar");
        jButtonClienteSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClienteSalvarMouseClicked(evt);
            }
        });
        jButtonClienteSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteSalvarActionPerformed(evt);
            }
        });

        jButtonClienteCancelar.setText("Cancelar");
        jButtonClienteCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClienteCancelarMouseClicked(evt);
            }
        });
        jButtonClienteCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonClienteSalvar)
                .addGap(18, 18, 18)
                .addComponent(jButtonClienteCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClienteSalvar)
                    .addComponent(jButtonClienteCancelar))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jScrollPaneNovoProjeto.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanelEditarProjetoLayout = new javax.swing.GroupLayout(jPanelEditarProjeto);
        jPanelEditarProjeto.setLayout(jPanelEditarProjetoLayout);
        jPanelEditarProjetoLayout.setHorizontalGroup(
            jPanelEditarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneNovoProjeto)
        );
        jPanelEditarProjetoLayout.setVerticalGroup(
            jPanelEditarProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneNovoProjeto, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelEditarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelEditarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteNomeActionPerformed

    private void jTextFieldClienteCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteCodigoActionPerformed

    private void jTextFieldClienteTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteTelefoneActionPerformed

    private void jTextFieldClientePaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClientePaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientePaisActionPerformed

    private void jTextFieldClienteEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteEstadoActionPerformed

    private void jTextFieldClienteCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteCidadeActionPerformed

    private void jTextFieldClienteRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteRuaActionPerformed

    private void jTextFieldClienteBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteBairroActionPerformed

    private void jTextFieldClienteNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteNumeroActionPerformed

    private void jButtonClienteSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClienteSalvarMouseClicked

        if (jTextFieldClienteNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClienteCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClienteTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClientePais.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClienteEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClienteCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClienteBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClienteRua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else if (jTextFieldClienteNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
        } else {

            cliente.setNome(jTextFieldClienteNome.getText());
            cliente.setCodigo(Integer.parseInt(jTextFieldClienteCodigo.getText()));
            cliente.setTelefone(Integer.parseInt(jTextFieldClienteTelefone.getText()));
            cliente.setEndereco(new Endereco(
                    jTextFieldClientePais.getText(),
                    jTextFieldClienteEstado.getText(),
                    jTextFieldClienteCidade.getText(),
                    jTextFieldClienteBairro.getText(),
                    jTextFieldClienteRua.getText(),
                    Integer.parseInt(jTextFieldClienteNumero.getText())
            ));
            clientes.remove(index);
            clientes.add(index, cliente);
            Cliente.escrever(clientes);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            dispose();
        }

    }//GEN-LAST:event_jButtonClienteSalvarMouseClicked
    /**
     * Método usado para preencher os campos do menu com os dados do cliente
     */
    private void mostrar() {
        jTextFieldClienteNome.setText(cliente.getNome());
        jTextFieldClienteCodigo.setText(String.valueOf(cliente.getCodigo()));
        jTextFieldClienteTelefone.setText(String.valueOf(cliente.getTelefone()));
        jTextFieldClientePais.setText(cliente.getEndereco().getPais());
        jTextFieldClienteEstado.setText(cliente.getEndereco().getEstado());
        jTextFieldClienteCidade.setText(cliente.getEndereco().getCidade());
        jTextFieldClienteBairro.setText(cliente.getEndereco().getBairro());
        jTextFieldClienteRua.setText(cliente.getEndereco().getRua());
        jTextFieldClienteNumero.setText(String.valueOf(cliente.getEndereco().getNumero()));
    }
    private void jButtonClienteSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClienteSalvarActionPerformed

    private void jButtonClienteCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClienteCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_jButtonClienteCancelarMouseClicked

    private void jButtonClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteCancelarActionPerformed

    }//GEN-LAST:event_jButtonClienteCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClienteCancelar;
    private javax.swing.JButton jButtonClienteSalvar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelEditarProjeto;
    private javax.swing.JScrollPane jScrollPaneNovoProjeto;
    private javax.swing.JTextField jTextFieldClienteBairro;
    private javax.swing.JTextField jTextFieldClienteCidade;
    private javax.swing.JTextField jTextFieldClienteCodigo;
    private javax.swing.JTextField jTextFieldClienteEstado;
    private javax.swing.JTextField jTextFieldClienteNome;
    private javax.swing.JTextField jTextFieldClienteNumero;
    private javax.swing.JTextField jTextFieldClientePais;
    private javax.swing.JTextField jTextFieldClienteRua;
    private javax.swing.JTextField jTextFieldClienteTelefone;
    // End of variables declaration//GEN-END:variables
}
