package app.forms;

public class TelaInicial extends javax.swing.JFrame {

    /** Creates new form TelaInicial */
    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBCadSala = new javax.swing.JButton();
        jBCadLab = new javax.swing.JButton();
        jBCadEquipamento = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jBCSala = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jBCLab = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSala = new javax.swing.JMenuItem();
        jMenuLaboratorio = new javax.swing.JMenuItem();
        jMenuEquipamento = new javax.swing.JMenuItem();
        jMenuCadUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de reserva de salas e laboratórios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Principal"));

        jBCadSala.setText("Cadastro de Sala");
        jBCadSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadSalaActionPerformed(evt);
            }
        });

        jBCadLab.setText("Cadastro de Laboratório");
        jBCadLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadLabActionPerformed(evt);
            }
        });

        jBCadEquipamento.setText("Cadastro de Equipamento");
        jBCadEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadEquipamentoActionPerformed(evt);
            }
        });

        jButton4.setText("Reserva");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jBCSala.setText("Consultar Sala");
        jBCSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCSalaActionPerformed(evt);
            }
        });

        jButton6.setText("Locação");

        jBCLab.setText("Consultar Laboratório");
        jBCLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCLabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBCadLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCadSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCLab, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBCadEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCSala, jBCadEquipamento, jBCadLab, jBCadSala, jButton4, jButton6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadSala, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadLab, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCSala, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBCLab, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\UNB\\UNB 5 semestre\\TEC DE PROG\\icones\\logo gama.png")); // NOI18N

        jMenu1.setText("Cadastro");

        jMenuSala.setText("Sala");
        jMenuSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalaMouseClicked(evt);
            }
        });
        jMenuSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSala);

        jMenuLaboratorio.setText("Laboratórios");
        jMenuLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLaboratorioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuLaboratorio);

        jMenuEquipamento.setText("Equipamento");
        jMenuEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEquipamentoMouseClicked(evt);
            }
        });
        jMenuEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEquipamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEquipamento);

        jMenuCadUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCadUsuarioMouseClicked(evt);
            }
        });
        jMenuCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadUsuario);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pesquisar");

        jMenuItem1.setText("jMenuItem1");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Locação");
        jMenuBar1.add(jMenu6);

        jMenu5.setText("Relatórios");
        jMenuBar1.add(jMenu5);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadSalaActionPerformed
        new CadastroDeSala().show();
    }//GEN-LAST:event_jBCadSalaActionPerformed
/*
    private void jBCadLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadLabActionPerformed
        new CadastroDeLaboratório().show();
    }//GEN-LAST:event_jBCadLabActionPerformed
*/
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
/*
    private void jBCadEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadEquipamentoActionPerformed
        new CadastroDeEquipamento().show();
    }//GEN-LAST:event_jBCadEquipamentoActionPerformed
*/
    
    private void jMenuCadUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadUsuarioMouseClicked

        new CadastroDeSolicitante().show();
    }//GEN-LAST:event_jMenuCadUsuarioMouseClicked

    private void jMenuSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalaMouseClicked
        new CadastroDeSala().show();
    }//GEN-LAST:event_jMenuSalaMouseClicked
/*
    private void jMenuEquipamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEquipamentoMouseClicked
        new CadastroDeEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuEquipamentoMouseClicked
*/
    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalaActionPerformed
        new CadastroDeSala().show();
    }//GEN-LAST:event_jMenuSalaActionPerformed
/*
    private void jMenuEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEquipamentoActionPerformed
        new CadastroDeEquipamento().show();
    }//GEN-LAST:event_jMenuEquipamentoActionPerformed
*/
    private void jMenuCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadUsuarioActionPerformed
        new CadastroDeSolicitante().show();
    }//GEN-LAST:event_jMenuCadUsuarioActionPerformed
/*
    private void jMenuLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLaboratorioActionPerformed
        new CadastroDeLaboratório().show();
    }//GEN-LAST:event_jMenuLaboratorioActionPerformed
*/
    private void jBCSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCSalaActionPerformed
        new PesquisaSala().show();
    }//GEN-LAST:event_jBCSalaActionPerformed
/*
    private void jBCLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCLabActionPerformed
        new PesquisaLaboratorio().show();
    
    }//GEN-LAST:event_jBCLabActionPerformed
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCLab;
    private javax.swing.JButton jBCSala;
    private javax.swing.JButton jBCadEquipamento;
    private javax.swing.JButton jBCadLab;
    private javax.swing.JButton jBCadSala;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadUsuario;
    private javax.swing.JMenuItem jMenuEquipamento;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuLaboratorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuSala;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
