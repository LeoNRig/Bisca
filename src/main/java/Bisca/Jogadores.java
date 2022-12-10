package Bisca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fagner
 */
public final class Jogadores {
    public int cartasMao = 3;
    private ArrayList <Carta> mao;
    private String carta;
    private int valor;
    private String Topo;
    
    public Jogadores(String Carta,  int Valor) {
          this.carta = Carta;
          this.valor = 0;
          
          mao = new ArrayList<> (cartasMao);
             for(int i =0; i <cartasMao; i++) {
                 drawCard();
             }
    
    }

    public void drawCard() {
           mao.add(Carta.Topo());
    }
    
    public List<Carta> getMao(){
           return mao;
    }
    
    
    
    
}
