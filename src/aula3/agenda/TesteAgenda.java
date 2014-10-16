package aula3.agenda;

public class TesteAgenda {

    public static void main(String[] args) {
        
    Principal view = new Principal();
    CadContato cadContato = new CadContato(view, true);
    CadTelefone cadTelefone = new CadTelefone(view, true);
    AgendaController controller = new AgendaController(view, cadContato, cadTelefone);
    
    view.setVisible(true);

}

}
