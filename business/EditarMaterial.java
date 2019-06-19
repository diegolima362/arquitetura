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
public class EditarMaterial extends javax.swing.JFrame {

    private final int index;
    private final Material material;
    private final ArrayList<Material> materiais;

    public EditarMaterial(int index, ArrayList<Material> materiais) {
        this.index = index;
        this.material = materiais.get(index);
        this.materiais = materiais;
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

        jPanelNovoMaterial = new javax.swing.JPanel();
        jScrollPaneNovoMaterial = new javax.swing.JScrollPane();
        jPanelNovoClienteConteudo2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jTextFieldMaterialNome = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextFieldMaterialCodigo = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jTextFieldMaterialFabricante = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaMaterialDescricao = new javax.swing.JTextArea();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTextFieldMaterialValor = new javax.swing.JTextField();
        jButtonMaterialSalvar = new javax.swing.JButton();
        jButtonMaterialCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Material"));

        jLabel81.setText("Nome");

        jLabel82.setText("Imagem");

        jTextFieldMaterialNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaterialNomeActionPerformed(evt);
            }
        });

        jLabel83.setText("Código");

        jLabel84.setText("Imagem");

        jTextFieldMaterialCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaterialCodigoActionPerformed(evt);
            }
        });

        jLabel85.setText("Fabricante");

        jLabel86.setText("Imagem");

        jTextFieldMaterialFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaterialFabricanteActionPerformed(evt);
            }
        });

        jLabel103.setText("Descrição");

        jTextAreaMaterialDescricao.setColumns(20);
        jTextAreaMaterialDescricao.setRows(5);
        jScrollPane3.setViewportView(jTextAreaMaterialDescricao);

        jLabel88.setText("Valor");

        jLabel89.setText("Imagem");

        jTextFieldMaterialValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaterialValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel85)
                            .addComponent(jLabel86)
                            .addComponent(jLabel81))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jTextFieldMaterialNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel84)
                                        .addGap(3, 3, 3)
                                        .addComponent(jTextFieldMaterialCodigo))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel88)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel87)
                                        .addGap(309, 360, Short.MAX_VALUE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jTextFieldMaterialFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel89)
                                .addGap(3, 3, 3)
                                .addComponent(jTextFieldMaterialValor))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jTextFieldMaterialNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(jTextFieldMaterialCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextFieldMaterialFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jTextFieldMaterialValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButtonMaterialSalvar.setText("Salvar");
        jButtonMaterialSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMaterialSalvarMouseClicked(evt);
            }
        });
        jButtonMaterialSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaterialSalvarActionPerformed(evt);
            }
        });

        jButtonMaterialCancelar.setText("Cancelar");
        jButtonMaterialCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaterialCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNovoClienteConteudo2Layout = new javax.swing.GroupLayout(jPanelNovoClienteConteudo2);
        jPanelNovoClienteConteudo2.setLayout(jPanelNovoClienteConteudo2Layout);
        jPanelNovoClienteConteudo2Layout.setHorizontalGroup(
            jPanelNovoClienteConteudo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNovoClienteConteudo2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelNovoClienteConteudo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMaterialSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMaterialCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNovoClienteConteudo2Layout.setVerticalGroup(
            jPanelNovoClienteConteudo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovoClienteConteudo2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNovoClienteConteudo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMaterialSalvar)
                    .addComponent(jButtonMaterialCancelar))
                .addContainerGap(375, Short.MAX_VALUE))
        );

        jScrollPaneNovoMaterial.setViewportView(jPanelNovoClienteConteudo2);

        javax.swing.GroupLayout jPanelNovoMaterialLayout = new javax.swing.GroupLayout(jPanelNovoMaterial);
        jPanelNovoMaterial.setLayout(jPanelNovoMaterialLayout);
        jPanelNovoMaterialLayout.setHorizontalGroup(
            jPanelNovoMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneNovoMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        jPanelNovoMaterialLayout.setVerticalGroup(
            jPanelNovoMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneNovoMaterial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelNovoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelNovoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMaterialNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaterialNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaterialNomeActionPerformed

    private void jTextFieldMaterialCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaterialCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaterialCodigoActionPerformed

    private void jTextFieldMaterialFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaterialFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaterialFabricanteActionPerformed

    private void jTextFieldMaterialValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaterialValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaterialValorActionPerformed

    private void jButtonMaterialSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMaterialSalvarMouseClicked
        if (jTextFieldMaterialNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuMaterial();
        } else if (jTextFieldMaterialCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuMaterial();
        } else if (jTextFieldMaterialFabricante.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuMaterial();
        } else if (jTextFieldMaterialValor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuMaterial();
        } else if (jTextAreaMaterialDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos");
            limparMenuMaterial();
        } else {

            material.setNome(jTextFieldMaterialNome.getText());
            material.setCodigo(Integer.parseInt(jTextFieldMaterialCodigo.getText()));
            material.setFabricante(jTextFieldMaterialFabricante.getText());
            material.setValor(Double.parseDouble(jTextFieldMaterialValor.getText()));
            material.setDescricao(jTextAreaMaterialDescricao.getText());

            materiais.remove(index);
            materiais.add(index, material);
            Material.escrever(materiais);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            dispose();
        }
    }//GEN-LAST:event_jButtonMaterialSalvarMouseClicked

    private void jButtonMaterialSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaterialSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMaterialSalvarActionPerformed

    private void jButtonMaterialCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaterialCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonMaterialCancelarActionPerformed

    private void limparMenuMaterial() {
        jTextFieldMaterialNome.setText("");
        jTextFieldMaterialCodigo.setText("");
        jTextFieldMaterialFabricante.setText("");
        jTextAreaMaterialDescricao.setText("");
    }

    private void mostrar() {
        jTextFieldMaterialNome.setText(material.getNome());
        jTextFieldMaterialCodigo.setText(String.valueOf(material.getCodigo()));
        jTextFieldMaterialFabricante.setText(material.getFabricante());
        jTextFieldMaterialValor.setText(String.valueOf(material.getValor()));
        jTextAreaMaterialDescricao.setText(material.getDescricao());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMaterialCancelar;
    private javax.swing.JButton jButtonMaterialSalvar;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelNovoClienteConteudo2;
    private javax.swing.JPanel jPanelNovoMaterial;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneNovoMaterial;
    private javax.swing.JTextArea jTextAreaMaterialDescricao;
    private javax.swing.JTextField jTextFieldMaterialCodigo;
    private javax.swing.JTextField jTextFieldMaterialFabricante;
    private javax.swing.JTextField jTextFieldMaterialNome;
    private javax.swing.JTextField jTextFieldMaterialValor;
    // End of variables declaration//GEN-END:variables
}
