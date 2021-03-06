package aula3.agenda;

import java.awt.event.ActionListener;

public class CadContato extends javax.swing.JDialog {

    public CadContato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rbFixo.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoTelefone = new javax.swing.ButtonGroup();
        panelContato = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        panelEndereco = new javax.swing.JPanel();
        lbLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lbNumeroEndereco = new javax.swing.JLabel();
        txtNumeroEndereco = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lbCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        panelTelefone = new javax.swing.JPanel();
        lbTipo = new javax.swing.JLabel();
        rbFixo = new javax.swing.JRadioButton();
        rbCelular = new javax.swing.JRadioButton();
        lbNumeroTelefone = new javax.swing.JLabel();
        txtNumeroTelefone = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro De Contato");
        setResizable(false);

        panelContato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbNome.setText("Nome:");

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        lbLogradouro.setText("Logradouro:");

        lbNumeroEndereco.setText("Numero:");

        lbComplemento.setText("Complemento:");

        lbCep.setText("CEP:");

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lbLogradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lbComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCep)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lbNumeroEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                    .addComponent(txtCep))
                .addContainerGap())
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogradouro)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumeroEndereco)
                    .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Telefone"));

        lbTipo.setText("Tipo:");

        bgTipoTelefone.add(rbFixo);
        rbFixo.setText("Fixo");

        bgTipoTelefone.add(rbCelular);
        rbCelular.setText("Celular");

        lbNumeroTelefone.setText("Numero");

        javax.swing.GroupLayout panelTelefoneLayout = new javax.swing.GroupLayout(panelTelefone);
        panelTelefone.setLayout(panelTelefoneLayout);
        panelTelefoneLayout.setHorizontalGroup(
            panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelefoneLayout.createSequentialGroup()
                        .addComponent(lbTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFixo)
                        .addGap(18, 18, 18)
                        .addComponent(rbCelular))
                    .addGroup(panelTelefoneLayout.createSequentialGroup()
                        .addComponent(lbNumeroTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTelefoneLayout.setVerticalGroup(
            panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(rbFixo)
                    .addComponent(rbCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroTelefone)
                    .addComponent(txtNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Cadastrar");

        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout panelContatoLayout = new javax.swing.GroupLayout(panelContato);
        panelContato.setLayout(panelContatoLayout);
        panelContatoLayout.setHorizontalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar))
                    .addGroup(panelContatoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome)))
                .addContainerGap())
        );
        panelContatoLayout.setVerticalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void addCadastarContatoListener(ActionListener listener) {
        btnCadastrar.addActionListener(listener);
    }

    public void addLimparContatoListener(ActionListener listener) {
        btnLimpar.addActionListener(listener);
    }

    public Contato getContato() {
        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();

        contato.setNome(txtNome.getText());

        endereco.setLogradouro(txtLogradouro.getText());
        endereco.setNumero(txtNumeroEndereco.getText());
        endereco.setComplemento(txtComplemento.getText());
        endereco.setCep(txtCep.getText());

        telefone.setTipo(rbFixo.isSelected() ? "Fixo" : "Celular");
        telefone.setTelefone(txtNumeroTelefone.getText());

        contato.setEndereco(endereco);
        contato.addTelefone(telefone);

        return contato;
    }

    public void setContato(Contato contato) {
        Endereco endereco = contato.getEndereco();

        txtNome.setText(contato.getNome());

        txtLogradouro.setText(endereco.getLogradouro());
        txtNumeroEndereco.setText(endereco.getNumero());
        txtComplemento.setText(endereco.getComplemento());
        txtCep.setText(endereco.getCep());

        // Verificar outras implementação para desabilitar campos
        rbCelular.enable(false);
        rbFixo.enable(false);
        txtNumeroTelefone.enable(false);

    }

    public void limparCampos() {

        txtNome.setText("");
        txtLogradouro.setText("");
        txtNumeroEndereco.setText("");
        txtComplemento.setText("");
        txtCep.setText("");
        rbFixo.setSelected(true);
        txtNumeroTelefone.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoTelefone;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumeroEndereco;
    private javax.swing.JLabel lbNumeroTelefone;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JPanel panelContato;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelTelefone;
    private javax.swing.JRadioButton rbCelular;
    private javax.swing.JRadioButton rbFixo;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroEndereco;
    private javax.swing.JTextField txtNumeroTelefone;
    // End of variables declaration//GEN-END:variables
}
