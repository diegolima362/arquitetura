package login;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class TelaCadastroUser extends javax.swing.JFrame {

    private TelaLogin telaLoginTemp;

    /**
     * Creates new form TelaCadastroUser
     *
     * @param tl
     */
    public TelaCadastroUser(TelaLogin tl) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.telaLoginTemp = tl;
        this.telaLoginTemp.setVisible(false);

    }

    public TelaCadastroUser(long cpf, TelaLogin tl) {
        initComponents();
        this.jTextFieldCPF.setText("" + cpf);
        this.telaLoginTemp = tl;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaCadastroUser = new javax.swing.JPanel();
        jTextFieldCadastroUser = new javax.swing.JTextField();
        jPasswordFieldCadastroUser = new javax.swing.JPasswordField();
        jButtonCadastrarUser = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jLabelNomeUser = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jButtonCancelCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar novo usuário");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanelTelaCadastroUser.setBackground(new java.awt.Color(254, 254, 254));
        jPanelTelaCadastroUser.setPreferredSize(new java.awt.Dimension(300, 400));

        jTextFieldCadastroUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCadastroUser.setBorder(null);
        jTextFieldCadastroUser.setPreferredSize(new java.awt.Dimension(200, 35));

        jPasswordFieldCadastroUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldCadastroUser.setPreferredSize(new java.awt.Dimension(200, 35));

        jButtonCadastrarUser.setText("Cadastrar");
        jButtonCadastrarUser.setPreferredSize(new java.awt.Dimension(95, 35));
        jButtonCadastrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarUserActionPerformed(evt);
            }
        });

        jLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSenha.setText("Senha");
        jLabelSenha.setPreferredSize(new java.awt.Dimension(150, 35));

        jLabelNomeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeUser.setText("Nome do usuário");
        jLabelNomeUser.setMaximumSize(new java.awt.Dimension(150, 17));
        jLabelNomeUser.setPreferredSize(new java.awt.Dimension(150, 35));

        jLabelCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCPF.setText("CPF");
        jLabelCPF.setPreferredSize(new java.awt.Dimension(100, 35));

        jTextFieldCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCPF.setPreferredSize(new java.awt.Dimension(200, 35));

        jButtonCancelCad.setText("Cancelar");
        jButtonCancelCad.setPreferredSize(new java.awt.Dimension(95, 35));
        jButtonCancelCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTelaCadastroUserLayout = new javax.swing.GroupLayout(jPanelTelaCadastroUser);
        jPanelTelaCadastroUser.setLayout(jPanelTelaCadastroUserLayout);
        jPanelTelaCadastroUserLayout.setHorizontalGroup(
            jPanelTelaCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaCadastroUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanelTelaCadastroUserLayout.createSequentialGroup()
                .addGroup(jPanelTelaCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaCadastroUserLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTextFieldCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaCadastroUserLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabelNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaCadastroUserLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaCadastroUserLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanelTelaCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelaCadastroUserLayout.createSequentialGroup()
                                .addComponent(jButtonCancelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCadastrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelTelaCadastroUserLayout.setVerticalGroup(
            jPanelTelaCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaCadastroUserLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanelTelaCadastroUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelTelaCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarUserActionPerformed
        // TODO add your handling code here:
        criarLogin();
    }//GEN-LAST:event_jButtonCadastrarUserActionPerformed

    private void jButtonCancelCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelCadActionPerformed
        // TODO add your handling code here:
        if (telaLoginTemp != null) {
            telaLoginTemp.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_jButtonCancelCadActionPerformed

    private void criarLogin() {

        if (jTextFieldCPF.getText().equals("") || jTextFieldCadastroUser.getText().equals("") || new String(jPasswordFieldCadastroUser.getPassword()).equals("")) {

            JOptionPane.showMessageDialog(null, "Existem campos em branco!", "Falha", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String user = "" + jTextFieldCadastroUser.getText();
        String psswd = new String(jPasswordFieldCadastroUser.getPassword());
        long cpf = Long.parseLong(jTextFieldCPF.getText());

        Login login = new Login(user, psswd, cpf);
        if (Login.gravarLogin(login)) {
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Falha ao criar Usuário!", "Falha", JOptionPane.ERROR_MESSAGE);

        }
        if (telaLoginTemp != null) {
            telaLoginTemp.setVisible(true);
        }
        this.dispose();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarUser;
    private javax.swing.JButton jButtonCancelCad;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelNomeUser;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanelTelaCadastroUser;
    private javax.swing.JPasswordField jPasswordFieldCadastroUser;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCadastroUser;
    // End of variables declaration//GEN-END:variables
}