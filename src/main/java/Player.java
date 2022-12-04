import java.util.ArrayList;

/**
 *
 * @author Fagner
 */
public final class Player {
    public int cartasMao = 3;
    private ArrayList <Card> mao;
    private String card;
    private int valor;
    
    public Player(String Card,  int Valor) {
          this.card = Card;
          this.valor = 0;
          
          mao = new ArrayList<> (cartasMao);
             for(int i =0; i <cartasMao; i++) {
                 drawCard();
             }
    
    }

    public void drawCard() {
           mao.add(Card.getTopoCard());
    }
    
    public list<Card> getMao(){
           return mao;
    }
    
    
    
    
}
