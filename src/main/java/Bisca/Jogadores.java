package Bisca;
import java.util.ArrayList;
import java.util.List;

public class Jogadores {

    ArrayList<String> cartasEmMaos = new ArrayList<>();
    ArrayList<String> cartasParaOJogador = new ArrayList<>();
    ArrayList<String> cartasDoBaralho = new ArrayList<>();
    
    Baralho baralhoDoJogo = new Baralho();
    
    public ArrayList<String> distribuirCartasParaJogadores(){
        
  
        cartasDoBaralho = baralhoDoJogo.colocandoValoresNasCartasDoBaralho();
        
        for(int carta = 0; carta <=2 ; carta ++){
            cartasParaOJogador.add(carta,cartasDoBaralho.get(carta));
            cartasEmMaos = cartasParaOJogador;
        }
        
        return cartasEmMaos;
    }
    
    public String imprimirCartasDoJogador(){
        return "Cartas do Jogador: " +  distribuirCartasParaJogadores();
    }
    
}