
package aula4.cdvideo;


public class TesteLoja {
    
    public static void main(String[] args) {
        
        BaseDados banco = new BaseDados();
        
        Cd JM = new Cd("Jorge e Mateus", "Otimo", false, 10, 200, "Chove chove");
        Cd ivete = new Cd("Ivete", "Poeira", true, 8, 60, "Festa");
        Cd guns = new Cd("Guns in roses", "Rock", false, 12, 90, "Roses");
        
        
        
        
        Video piratas = new Video("Desconhecido", "Antigo", false, 120, "Piratas do Caribe");
        Video piratas2 = new Video("Desconhecido", "Novo", false, 120, "Piratas do Caribe II");
        Video jpark = new Video("Stiven espioberg", "Pre Historico", false, 120, "Parque dos Dinossauros");
        
        banco.inserirCd(JM);
        banco.inserirCd(ivete);
        banco.inserirVideo(piratas);
        banco.inserirVideo(jpark);
        
        banco.listarCds();
        banco.listarVideos();
        
          
       banco.atualizaCd(1, guns);
       banco.atualizaVideo(0, piratas2);
       
        banco.listarCds();
        banco.listarVideos();
       
        
        banco.apagaCd(1);
        banco.apagaVideo(1);
              
        banco.listarCds();
        banco.listarVideos();
       
        
      
        
    }
    
}
