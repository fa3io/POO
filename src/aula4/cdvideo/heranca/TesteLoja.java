
package aula4.cdvideo.heranca;

import java.util.ArrayList;
import java.util.List;


public class TesteLoja {
    
    public static void main(String[] args) {
        
        List<Item> itens = new ArrayList(); 
        
        BaseDados banco = new BaseDados();
        
        Cd jm = new Cd(10, "Jorge e Mateus", "Chove Chove", "Otimo", true, 60);
        Cd ivete = new Cd(12, "Ivete", "Poeira", "Auto-astral", true, 80);
        Cd guns = new Cd(15, "Guns in roses", "Roses", "Rock", false, 100);

        
        
 
        Video piratas = new Video("Desconhecido", "Piratas do Caribe", "Antigo", true, 120);
        Video piratas2 = new Video("Desconhecido", "Piratas do Caribe II" , "Novo", true, 160);
        Video jpark = new Video("Stiven espioberg",  "Parque dos Dinossauros", "Pre Historico", false, 200);
        
        itens.add(jm);
        itens.add(jpark);

        banco.inserirItem(jm);
        banco.inserirItem(ivete);
        banco.inserirItem(piratas);
        banco.inserirItem(guns);
        banco.inserirItem(jpark);
        
        banco.listarItens();
        
        banco.apagaItem(3);
        
        banco.listarItens();
        
        banco.atualizaCd(2, piratas2);
        
        banco.listarItens();
        
        banco.setLista(itens);
        
        banco.listarItens();
        
        
       
       
        
      
        
    }
    
}
