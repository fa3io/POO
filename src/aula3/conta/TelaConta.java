
package aula3.conta;

public class TelaConta extends javax.swing.JDialog {

    public TelaConta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTelaConta = new javax.swing.JPanel();
        lbBemvindo = new javax.swing.JLabel();
        btnSaldo = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTelaConta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBemvindo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lbBemvindo.setText("Bem Vindo");

        btnSaldo.setText("Saldo");

        btnSacar.setText("Sacar");

        btnDepositar.setText("Depositar");

        javax.swing.GroupLayout panelTelaContaLayout = new javax.swing.GroupLayout(panelTelaConta);
        panelTelaConta.setLayout(panelTelaContaLayout);
        panelTelaContaLayout.setHorizontalGroup(
            panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBemvindo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTelaContaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnSaldo)
                .addGap(18, 18, 18)
                .addComponent(btnSacar)
                .addGap(18, 18, 18)
                .addComponent(btnDepositar)
                .addGap(21, 21, 21))
        );
        panelTelaContaLayout.setVerticalGroup(
            panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBemvindo)
                .addGap(18, 18, 18)
                .addGroup(panelTelaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaldo)
                    .addComponent(btnSacar)
                    .addComponent(btnDepositar))
                .addContainerGap(54, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JLabel lbBemvindo;
    private javax.swing.JPanel panelTelaConta;
    // End of variables declaration//GEN-END:variables
}
