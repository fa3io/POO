
package aula3.conta;

import java.awt.event.ActionListener;

public class TelaConta extends javax.swing.JDialog {

    public TelaConta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    public void addSaldoListener(ActionListener listener){
        btnSaldo.addActionListener(listener);
    }
    public void addSacarListener(ActionListener listener){
        btnSacar.addActionListener(listener);
    }
    public void addDepositarListener(ActionListener listener){
        btnDepositar.addActionListener(listener);
    }
    
    public void setBoasVindas(String nome){
        lbBemvindo.setText(nome);
    }
    
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTelaConta = new javax.swing.JPanel();
        lbBemvindo = new javax.swing.JLabel();
        btnSaldo = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        lbBemvindo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTelaConta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBemvindo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lbBemvindo.setText("nome");

        btnSaldo.setText("Saldo");

        btnSacar.setText("Sacar");

        btnDepositar.setText("Depositar");

        lbBemvindo1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lbBemvindo1.setText("Bem Vindo !!");

        javax.swing.GroupLayout panelTelaContaLayout = new javax.swing.GroupLayout(panelTelaConta);
        panelTelaConta.setLayout(panelTelaContaLayout);
        panelTelaContaLayout.setHorizontalGroup(
            panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaContaLayout.createSequentialGroup()
                .addGroup(panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelaContaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSaldo)
                        .addGap(18, 18, 18)
                        .addGroup(panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBemvindo)
                            .addGroup(panelTelaContaLayout.createSequentialGroup()
                                .addComponent(btnSacar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDepositar))))
                    .addGroup(panelTelaContaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lbBemvindo1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelTelaContaLayout.setVerticalGroup(
            panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBemvindo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbBemvindo)
                .addGap(25, 25, 25)
                .addGroup(panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaldo)
                    .addComponent(btnSacar)
                    .addComponent(btnDepositar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTelaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTelaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JLabel lbBemvindo;
    private javax.swing.JLabel lbBemvindo1;
    private javax.swing.JPanel panelTelaConta;
    // End of variables declaration//GEN-END:variables
}
