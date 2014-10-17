
package aula3.agenda;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private DefaultListModel modelLista;
    
    public Principal() {
        initComponents();
        habilitacaoDeCampos(false);
        modelLista = new DefaultListModel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        panelEndereco = new javax.swing.JPanel();
        lbLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lbNumeroEndereco = new javax.swing.JLabel();
        txtNumeroEndereco = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lbCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        btnEditarEndereco = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panelTelefone = new javax.swing.JPanel();
        spTblTelefones = new javax.swing.JScrollPane();
        tblTelefones = new javax.swing.JTable();
        btnAdicionarTelefone = new javax.swing.JButton();
        btnRemoverTelefone = new javax.swing.JButton();
        panelContato = new javax.swing.JPanel();
        spListContato = new javax.swing.JScrollPane();
        listContatos = new javax.swing.JList();
        btnAdicionarContato = new javax.swing.JButton();
        btnRemoverContato = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/phonebook.png"))); // NOI18N
        lbTitulo.setText("Agenda");

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        lbLogradouro.setText("Logradouro:");

        lbNumeroEndereco.setText("Numero:");

        lbComplemento.setText("Complemento:");

        lbCep.setText("CEP:");

        btnEditarEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/edit.png"))); // NOI18N

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/save2.png"))); // NOI18N

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
                        .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumeroEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lbComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep)))
                .addGap(18, 18, 18)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLogradouro)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNumeroEndereco)
                            .addComponent(txtNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEditarEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar)
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbComplemento)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCep)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Telefones"));

        tblTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo", "Numero"
            }
        ));
        spTblTelefones.setViewportView(tblTelefones);

        btnAdicionarTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/add.png"))); // NOI18N

        btnRemoverTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/remove.png"))); // NOI18N

        javax.swing.GroupLayout panelTelefoneLayout = new javax.swing.GroupLayout(panelTelefone);
        panelTelefone.setLayout(panelTelefoneLayout);
        panelTelefoneLayout.setHorizontalGroup(
            panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTblTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelTelefoneLayout.setVerticalGroup(
            panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefoneLayout.createSequentialGroup()
                .addGroup(panelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelefoneLayout.createSequentialGroup()
                        .addComponent(btnAdicionarTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnRemoverTelefone))
                    .addComponent(spTblTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelContato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contatos"));

        spListContato.setViewportView(listContatos);

        btnAdicionarContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/add.png"))); // NOI18N

        btnRemoverContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula3/agenda/img/remove.png"))); // NOI18N

        javax.swing.GroupLayout panelContatoLayout = new javax.swing.GroupLayout(panelContato);
        panelContato.setLayout(panelContatoLayout);
        panelContatoLayout.setHorizontalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatoLayout.createSequentialGroup()
                        .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoverContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatoLayout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spListContato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)))
        );
        panelContatoLayout.setVerticalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnAdicionarContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverContato)
                .addGap(87, 87, 87))
            .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatoLayout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(spListContato, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   public void addAdcionarContatoListener(ActionListener listener){
        btnAdicionarContato.addActionListener(listener);
    }
    public void addRemoverContatoListener(ActionListener listener){
        btnRemoverContato.addActionListener(listener);
    }
    
    public void addAdcionarTelefoneListener(ActionListener listener){
        btnAdicionarTelefone.addActionListener(listener);
    }
    public void addRemoveTelefoneListener(ActionListener listener){
        btnRemoverTelefone.addActionListener(listener);
    }
    
    public void addEditarEnderecoListener(ActionListener listener){
        btnEditarEndereco.addActionListener(listener);
    }
    public void addSalvarEnderecoListener(ActionListener listener){
        btnSalvar.addActionListener(listener);
    }
    public void addListaListener(MouseAdapter mouseAdpter){
        listContatos.addMouseListener(mouseAdpter); 
        // verificar implementação no java GUJ com Vinny Godoi 
    }
    public void addPesquisaListener(KeyListener keyListener){
        txtPesquisa.addKeyListener(keyListener);
    }
    
    public void setListModel(List<Contato> lista){
        modelLista.removeAllElements();
        
        for (Contato contato : lista) {
            modelLista.addElement(contato); // deve inserir na lista o to String do contato acompanhar
        }
        listContatos.setModel(modelLista); 
    }
    
    public Endereco getEndereco(){
        
        Endereco endereco = new Endereco();
        
        endereco.setLogradouro(txtLogradouro.getText());
        endereco.setNumero(txtNumeroEndereco.getText());
        endereco.setComplemento(txtComplemento.getText());
        endereco.setCep(txtCep.getText());
        
        return endereco; 
    }
    public String getPesquisa(){
        return txtPesquisa.getText();
    }
    
    public void setEndereco(Endereco endereco){
        txtLogradouro.setText(endereco.getLogradouro());
        txtNumeroEndereco.setText(endereco.getNumero());
        txtComplemento.setText(endereco.getComplemento());
        txtCep.setText(endereco.getCep());
    }
    
     // Mudando a consulta ao item selecionado na lista em vez de o indece passar o objeto
    public Contato getListContatoSelected(){
        Contato contato = (Contato) listContatos.getSelectedValue();
        return contato;
        
    }
    
    public int getListSelect(){
        return listContatos.getSelectedIndex();
    }
     public  DefaultListModel getListModel(){
        return modelLista;
    }
    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) tblTelefones.getModel();
    }
    
     public void setTableModel( String[] colunas  ){
        DefaultTableModel modelTabela = new DefaultTableModel( new Object [][] {{null, null},{null, null}}, colunas);
        tblTelefones.setModel(modelTabela);
    }
    public JTable getTable(){
        return tblTelefones;
    }
    public void limparCampos(String[] colunas){
        
        txtLogradouro.setText("");
        txtNumeroEndereco.setText("");
        txtComplemento.setText("");
        txtCep.setText("");
        
        setTableModel(colunas);
    }
    
    public final void habilitacaoDeCampos(Boolean opcao){
        txtLogradouro.setEditable(opcao);
        txtNumeroEndereco.setEditable(opcao);
        txtComplemento.setEditable(opcao);
        txtCep.setEditable(opcao);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarContato;
    private javax.swing.JButton btnAdicionarTelefone;
    private javax.swing.JButton btnEditarEndereco;
    private javax.swing.JButton btnRemoverContato;
    private javax.swing.JButton btnRemoverTelefone;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbNumeroEndereco;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JList listContatos;
    private javax.swing.JPanel panelContato;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTelefone;
    private javax.swing.JSeparator separador;
    private javax.swing.JScrollPane spListContato;
    private javax.swing.JScrollPane spTblTelefones;
    private javax.swing.JTable tblTelefones;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNumeroEndereco;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
