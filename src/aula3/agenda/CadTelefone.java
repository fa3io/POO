package aula3.agenda;

import java.awt.event.ActionListener;

public class CadTelefone extends javax.swing.JDialog {

    public CadTelefone(javax.swing.JFrame frame, boolean modal) {
        super(frame, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoTelefone = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        lbTipo = new javax.swing.JLabel();
        rbFixo = new javax.swing.JRadioButton();
        rbCelular = new javax.swing.JRadioButton();
        lbNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Telefone");
        setResizable(false);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setToolTipText("");

        lbTipo.setText("Tipo:");

        bgTipoTelefone.add(rbFixo);
        rbFixo.setText("Fixo");

        bgTipoTelefone.add(rbCelular);
        rbCelular.setText("Celular");

        lbNumero.setText("Numero");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/save.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lbNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lbTipo)
                        .addGap(18, 18, 18)
                        .addComponent(rbFixo)
                        .addGap(18, 18, 18)
                        .addComponent(rbCelular)))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(rbFixo)
                    .addComponent(rbCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Telefone getTelefone() {
        Telefone telefone = new Telefone();
        telefone.setTipo(rbFixo.isSelected() ? "Fixo" : "Celular");
        telefone.setTelefone(txtNumero.getText());
        return telefone;
    }
    public void addTelefoneListener(ActionListener listener){
        btnCadastrar.addActionListener(listener);
    }
    public void setTelefone(Telefone telefone){
        txtNumero.setText(telefone.getTelefone());
        rbFixo.setSelected(telefone.getTipo().equals("Fixo"));
        rbCelular.setSelected(telefone.getTipo().equals("Fixo"));
        
  
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoTelefone;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton rbCelular;
    private javax.swing.JRadioButton rbFixo;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
