package vetorswing;

import java.util.Arrays;
import javax.swing.DefaultListModel;

public class TelaVetor extends javax.swing.JFrame {
    int vet[] = new int[10];
    int sel = 0;
    DefaultListModel lista = new DefaultListModel();
    public TelaVetor() {
        initComponents();
        for (int c = 0; c < vet.length; c++) {
            lista.addElement(vet[c]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnNum = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnOrd = new javax.swing.JButton();
        btnRem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblSel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vetor");
        setResizable(false);

        spnNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnNum.setModel(new javax.swing.SpinnerNumberModel());

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnOrd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOrd.setText("Ordenar");
        btnOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdActionPerformed(evt);
            }
        });

        btnRem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRem.setText("Remover");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });

        lstVetor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Vettor");

        lblSel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSel.setText("[0]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRem)
                            .addComponent(btnOrd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(jLabel1)
                    .addComponent(lblSel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnOrd)
                        .addGap(56, 56, 56)
                        .addComponent(btnRem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        vet[sel] = Integer.parseInt(spnNum.getValue().toString());
        lista.removeAllElements();
        for (int c = 0; c < vet.length; c++) {
            lista.addElement(vet[c]);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdActionPerformed
        Arrays.sort(vet);
        lista.removeAllElements();
        for (int c = 0; c < vet.length; c++) {
            lista.addElement(vet[c]);
        }
    }//GEN-LAST:event_btnOrdActionPerformed

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
        vet[sel] = 0;
        lista.removeAllElements();
        for (int c = 0; c < vet.length; c++) {
            lista.addElement(vet[c]);
        }
    }//GEN-LAST:event_btnRemActionPerformed

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        sel = lstVetor.getSelectedIndex();
        lblSel.setText("[" + sel + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaVetor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrd;
    private javax.swing.JButton btnRem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSel;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner spnNum;
    // End of variables declaration//GEN-END:variables
}
