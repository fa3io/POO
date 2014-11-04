
package aula4.cdvideo.heranca;

import java.util.ArrayList;
import java.util.List;

public class BaseDados {
    
    
    private List<Item> lista = new ArrayList<>();


    public void apagaItem(int idItem) {
        lista.remove(idItem);
    }

    public void atualizaCd(int idItem, Item item) {
        lista.remove(idItem);
        lista.add(idItem, item);
    }


    public List<Item> getListaItens() {
        return lista;
    }

    public void inserirItem(Item item) {
        lista.add(item);
    }
    public void listarItens() {
        System.out.println(lista.toString());
    }

    public void setLista(List<Item> lista) {
        this.lista = lista;
    }
    
    
}
