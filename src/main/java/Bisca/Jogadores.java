package Bisca;
import java.util.ArrayList;
import java.util.Collections;

public class Jogadores {

    ArrayList<String> cartasEmMaos = new ArrayList<>();
    ArrayList<String> cartasParaOJogador = new ArrayList<>();
    ArrayList<String> cartasDoBaralho = new ArrayList<>();
    
    Baralho baralhoDoJogo = new Baralho();
    
    public ArrayList<String> distribuirCartasParaJogadores(){
        
  
        cartasDoBaralho = (ArrayList<String>) baralhoDoJogo.colocandoValoresNasCartasDoBaralho();
        Collections.shuffle(cartasDoBaralho);
        
        for(int carta = 0; carta <=2 ; carta ++){
            cartasParaOJogador.add(carta,cartasDoBaralho.get(carta));
            cartasEmMaos = cartasParaOJogador;
        }
        
        return cartasEmMaos;
    }
    
    public ArrayList<String> imprimirCartasDoJogador(){
        return distribuirCartasParaJogadores();
    }
    
    public String jogarCarta (int posicaoDaCarta) {
   
        int index = posicaoDaCarta;
        String cartaSelecionada ;
        
        if(index == 1) {

            return cartaSelecionada = cartasEmMaos.remove(index-1);

        }
        if(index == 2) {

            return cartaSelecionada = cartasEmMaos.remove(index-1);

        }
        
        if(index == 3) {

            return cartaSelecionada = cartasEmMaos.remove(index-1);

        }
        System.out.println("Valor invalido");
        return null;
    }
    
}